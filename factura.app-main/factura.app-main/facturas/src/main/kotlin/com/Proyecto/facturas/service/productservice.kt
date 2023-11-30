package com.Proyecto.facturas.service

import ch.qos.logback.core.model.Model
import com.Proyecto.facturas.model.product
import com.Proyecto.facturas.repository.productrepository
import org.springframework.data.domain.Example
import org.springframework.data.domain.ExampleMatcher
import org.springframework.data.domain.Page
import org.springframework.stereotype.Service
import java.awt.print.Pageable

@Service
class productservice(private val repository: productrepository) {
    fun findAll(): List<product> = repository.findAll()
    fun save(product: product): product = repository.save(product)
    fun deleteById(id: Long) = repository.deleteById(id)

    fun list (pageable: Pageable, product: product) {
        val matcher = ExampleMatcher.matching()
            .withIgnoreNullValues()
            .withMatcher(("description"), ExampleMatcher.GenericPropertyMatchers.contains().ignoreCase())
        return productrepository.findAll(Example.of(product, matcher), pageable)
    }

    fun findTopSellingProducts(): Any {
        TODO("Not yet implemented")
    }

    companion object
}

private fun productrepository.Companion.findAll(of: Example<product>, pageable: Pageable) {

}
