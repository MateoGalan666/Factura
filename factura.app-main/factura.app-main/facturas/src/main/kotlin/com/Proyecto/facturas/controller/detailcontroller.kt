package com.Proyecto.facturas.controller

import com.Proyecto.facturas.model.detail
import com.Proyecto.facturas.service.detailservice
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/detail")
class detailcontroller(private val service: detailservice) {
    @GetMapping
    fun findAll() = service.findAll()

    @PostMapping
    fun save(@RequestBody detail: detail) = service.save(detail)

    @DeleteMapping("/{id}")
    fun deleteById(@PathVariable id: Long) = service.deleteById(id)
}
