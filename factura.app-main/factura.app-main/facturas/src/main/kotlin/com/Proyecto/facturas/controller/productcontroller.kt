package com.Proyecto.facturas.controller

import com.Proyecto.facturas.model.product
import com.Proyecto.facturas.service.productservice
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/product")
class productcontroller(private val service: productservice) {
    @GetMapping
    fun findAll() = service.findAll()

    @PostMapping
    fun save(@RequestBody product: product) = service.save(product)

    @DeleteMapping("/{id}")
    fun deleteById(@PathVariable id: Long) = service.deleteById(id)
}
