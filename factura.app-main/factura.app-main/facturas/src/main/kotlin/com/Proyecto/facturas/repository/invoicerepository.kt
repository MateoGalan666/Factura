package com.Proyecto.facturas.repository

import com.Proyecto.facturas.model.invoice
import org.springframework.data.jpa.repository.JpaRepository

interface invoicerepository : JpaRepository<invoice, Long>
