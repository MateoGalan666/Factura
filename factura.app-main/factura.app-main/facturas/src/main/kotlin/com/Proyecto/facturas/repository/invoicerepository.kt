package com.Proyecto.facturas.repository

import com.Proyecto.facturas.model.invoice
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

interface invoicerepository : JpaRepository<invoice, Long> {
    fun findTotalMoreThan(total: Double?): List<invoice>?
    fun findById(id:long?):Invoice?

    class long {

    }

    class Invoice {

    }
    @Query(nativeQuery = true)
    fun filterTotal (@Param("value") value:Double?): List<Invoice>?

    companion object {
        fun filterTotal(value: Double): List<invoice> {

            return TODO("Provide the return value")
        }

    }


}

