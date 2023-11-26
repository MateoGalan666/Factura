package com.Proyecto.facturas.service

import com.Proyecto.facturas.model.invoice
import com.Proyecto.facturas.repository.invoicerepository
import org.springframework.stereotype.Service

@Service
class invoiceservice(private val repository: invoicerepository) {
    fun findAll(): List<invoice> = repository.findAll()
    fun save(invoice: invoice): invoice = repository.save(invoice)
    fun deleteById(id: Long) = repository.deleteById(id)
}
