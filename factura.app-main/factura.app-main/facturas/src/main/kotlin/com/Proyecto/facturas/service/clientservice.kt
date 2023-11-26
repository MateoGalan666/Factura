package com.Proyecto.facturas.service

import com.Proyecto.facturas.model.client
import com.Proyecto.facturas.repository.clientrepository
import org.springframework.stereotype.Service
import javax.management.loading.ClassLoaderRepository

@Service
class clientservice(private val repository: clientrepository) {
    fun findAll(): List<client> = repository.findAll()
    fun save(client: client): client = repository.save(client)
    fun deleteById(id: Long) = repository.deleteById(id)
}
