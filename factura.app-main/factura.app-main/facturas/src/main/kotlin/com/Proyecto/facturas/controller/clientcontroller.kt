package com.Proyecto.facturas.controller
import ch.qos.logback.core.model.Model
import com.Proyecto.facturas.model.client
import com.Proyecto.facturas.service.clientservice
import com.Proyecto.facturas.service.invoiceservice
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.awt.print.Pageable

@RestController
@RequestMapping("/client")
class clientcontroller(
    private val service: clientservice,
    private val clientservice: clientservice
) {
    @GetMapping
    fun findAll() = service.findAll()

    @PostMapping
    fun save(@RequestBody client: client) = service.save(client)

    @DeleteMapping("/{id}")
    fun deleteById(@PathVariable id: Long) = service.deleteById(id)

    @GetMapping
    fun list (client: client, pageable: Pageable):ResponseEntity<*>{
        val response= clientservice.list(pageable, client())
        return ResponseEntity(response, HttpStatus.OK)

    }
    @GetMapping("/filter-total/{value}")
    fun listTotals (@PathVariable("value") value: Double ):ResponseEntity<*>{
        return ResponseEntity(/* headers = */ invoiceservice.listTotalMoreThan(value), /* status = */ HttpStatus.OK)
    }

}

