package com.Proyecto.facturas.controller
import com.Proyecto.facturas.model.client
import com.Proyecto.facturas.service.clientservice
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.server.ResponseStatusException

@RestController
@RequestMapping("/client")
class clientcontroller(private val service: clientservice) {
    @GetMapping
    fun findAll() = service.findAll()

    @PostMapping
    fun save(@RequestBody client: client) = service.save(client)

    @DeleteMapping("/{id}")
    fun deleteById(@PathVariable id: Long) = service.deleteById(id)

}

