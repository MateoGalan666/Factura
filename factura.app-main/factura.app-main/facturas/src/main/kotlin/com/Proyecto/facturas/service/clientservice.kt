package com.Proyecto.facturas.service

import com.Proyecto.facturas.model.client
import com.Proyecto.facturas.model.invoice
import com.Proyecto.facturas.repository.clientrepository
import com.Proyecto.facturas.repository.invoicerepository
import org.springframework.data.domain.Example
import org.springframework.data.domain.ExampleMatcher
import org.springframework.stereotype.Service
import java.awt.print.Pageable

@Service
class clientservice(
    private val repository: clientrepository,
    private val invoicerepository: invoicerepository
) {
    fun findAll(): List<client> = repository.findAll()
    fun save(client: client): client = repository.save(client)
    fun deleteById(id: Long) = repository.deleteById(id)


    fun list (pageable: Pageable, client: client) {
        val matcher = ExampleMatcher.matching()
            .withIgnoreNullValues()
            .withMatcher(("fullname"), ExampleMatcher.GenericPropertyMatchers.contains().ignoreCase())
        return clientrepository.findAll(Example.of(client, matcher), pageable)


    }
    fun listTotalMoreThan(total:Double?): List<invoice>? {
        return invoicerepository.findTotalMoreThan(total)
    }
}

private fun clientrepository.Companion.findAll(of: Example<client>, pageable: Pageable) {

}
