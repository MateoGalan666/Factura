package com.Proyecto.facturas.repository

import com.Proyecto.facturas.model.product
import org.springframework.data.jpa.repository.JpaRepository

interface productrepository : JpaRepository<product, Long> {
    companion object
}
