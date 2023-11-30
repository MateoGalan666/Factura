package com.Proyecto.facturas.controller

import ch.qos.logback.core.model.Model
import com.Proyecto.facturas.model.product
import com.Proyecto.facturas.service.clientservice
import com.Proyecto.facturas.service.productservice
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.util.MultiValueMap
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.awt.print.Pageable

@RestController
@RequestMapping("/product")
class productcontroller(private val service: productservice) {
    @GetMapping
    fun findAll() = service.findAll()

    @PostMapping
    fun save(@RequestBody product: product) = service.save(product)

    @DeleteMapping("/{id}")
    fun deleteById(@PathVariable id: Long) = service.deleteById(id)

    @GetMapping
    fun list (product: product, pageable: Pageable): ResponseEntity<*> {
        val response= productservice.list(pageable,product)
        return ResponseEntity(/* headers = */ response, /* status = */ HttpStatus.OK)
    }
}

private fun productservice.Companion.list(pageable: Pageable, product: product): MultiValueMap<String, String> {
    TODO("Not yet implemented")
}
