package com.Proyecto.facturas.service

import com.Proyecto.facturas.model.product
import com.Proyecto.facturas.repository.productrepository
import org.springframework.stereotype.Service

@Service
class productservice(private val repository: productrepository) {
    fun findAll(): List<product> = repository.findAll()
    fun save(product: product): product = repository.save(product)
    fun deleteById(id: Long) = repository.deleteById(id)
}
