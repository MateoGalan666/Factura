package com.Proyecto.facturas.repository

import com.Proyecto.facturas.model.client
import com.Proyecto.facturas.model.invoice
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface clientrepository : JpaRepository<client, Long> {
    companion object
    @Query(nativeQuery = true)
    fun filterTotal (value:Double):List <invoice>
}