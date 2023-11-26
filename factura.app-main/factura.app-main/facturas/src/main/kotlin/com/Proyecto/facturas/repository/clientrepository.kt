package com.Proyecto.facturas.repository

import com.Proyecto.facturas.model.client
import org.springframework.data.jpa.repository.JpaRepository

interface clientrepository : JpaRepository<client, Long>