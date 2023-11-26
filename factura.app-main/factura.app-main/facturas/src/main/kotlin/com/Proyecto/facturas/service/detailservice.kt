package com.Proyecto.facturas.service

import com.Proyecto.facturas.model.detail
import com.Proyecto.facturas.repository.detailrepository
import org.springframework.stereotype.Service

@Service
class detailservice(private val repository: detailrepository) {
    fun findAll(): List<detail> = repository.findAll()
    fun save(detail: detail): detail = repository.save(detail)
    fun deleteById(id: Long) = repository.deleteById(id)
}
