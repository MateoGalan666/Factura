package com.Proyecto.facturas.service

import com.Proyecto.facturas.model.invoice
import com.Proyecto.facturas.repository.invoicerepository
import org.springframework.stereotype.Service
import org.springframework.util.MultiValueMap

@Service
class invoiceservice(private val repository: invoicerepository) {
    fun findAll(): List<invoice> = repository.findAll()
    fun save(invoice: invoice): invoice = repository.save(invoice)
    fun deleteById(id: Long) = repository.deleteById(id)

    companion object {
        fun listTotalMoreThan(value: Double): MultiValueMap<String, String> {
            TODO("Not yet implemented")
        }
        fun filterTotal (value: Double): List<invoice>{
            return invoicerepository.filterTotal(value)
        }
    }
}
