package com.Proyecto.facturas.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.ManyToOne
import java.util.Date

@Entity
data class invoice(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val code: String = "",
    val create_at: Date = Date(),
    val total: Double = 0.0,
    @ManyToOne
    val client: client
)

