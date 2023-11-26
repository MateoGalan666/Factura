package com.Proyecto.facturas.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.ManyToOne

@Entity
data class detail(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val quantity: Int = 0,
    val price: Double = 0.0,
    @ManyToOne
    val invoice: invoice,
    @ManyToOne
    val product: product
)
