package com.Proyecto.facturas.repository

import com.Proyecto.facturas.model.client
import com.Proyecto.facturas.model.invoice
import com.Proyecto.facturas.model.product
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
        interface clientrepository : JpaRepository<client, Long> {
            @Query("SELECT c FROM client c JOIN invoice f ON c.id = f.client.id WHERE f.total > 100")
            fun findclientWithHighInvoices(): List<client>
        }
        interface productrepository : JpaRepository<product, Long> {
            @Query("SELECT p, SUM(d.quantity) as total_sold FROM product  p JOIN detail d ON p.id = d.producto.id GROUP BY p.id ORDER BY total_sold DESC")
            fun findTopSellingProducts(): List<Any>
        }

    }


}

