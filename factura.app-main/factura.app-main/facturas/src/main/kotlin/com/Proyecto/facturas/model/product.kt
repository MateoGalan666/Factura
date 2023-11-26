package com.Proyecto.facturas.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class product(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val description: String = "",
    val brand: String = "",
    val price: Double = 0.0,
    val stock: Int = 0
)
