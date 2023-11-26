package com.Proyecto.facturas.repository

import com.Proyecto.facturas.model.detail
import org.springframework.data.jpa.repository.JpaRepository

interface detailrepository : JpaRepository<detail, Long>
