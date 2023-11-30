package com.Proyecto.facturas.controller

import com.Proyecto.facturas.model.invoice
import com.Proyecto.facturas.service.invoiceservice
import com.Proyecto.facturas.service.productservice
import org.springframework.http.HttpStatus
import org.springframework.http.HttpStatusCode
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/invoice")
class invoicecontroller(private val service: invoiceservice) {

    @GetMapping("/highinvoices")
    fun findclientWithHighInvoices() = service.findclientWithHighinvoices()
    // Otros métodos...

    @GetMapping("/topselling")
    fun findTopSellingProducts() = service.findTopSellingProducts()
    // Otros métodos...
    @GetMapping
    fun findAll() = service.findAll()

    @PostMapping
    fun save(@RequestBody invoice: invoice) = service.save(invoice)

    @DeleteMapping("/{id}")
    fun deleteById(@PathVariable id: Long) = service.deleteById(id)

    @GetMapping("/filter-Total/{value}")
    fun ListfilterTotal (value: Double):ResponseEntity<*>{
        return ResponseEntity(invoiceservice.filterTotal(value), HttpStatus.OK)

        @RestController
        @RequestMapping("/client")
        class ClientController(private val service: clientService) {

        }
        @RestController
        @RequestMapping("/product")
        class productController(private val service: productservice) {

        }

    }
    class clientService {
        fun findclientWithHighInvoices() {
        }
        fun findclientWithHighinvoices() {
        }
    }
}