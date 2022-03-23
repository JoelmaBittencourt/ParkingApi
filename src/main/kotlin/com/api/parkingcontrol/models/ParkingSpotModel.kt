package com.api.parkingcontrol.models

import java.math.BigDecimal
import java.time.LocalDateTime
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table


@Entity
@Table(name = "TB_BANKING_SPOT2")
class ParkingSpotModel(

    @Id //
    val id: String = UUID.randomUUID().toString(),
    val value: BigDecimal,

    @Column(nullable = false, unique = true, length = 10)
    val parkingSpotNumber: String,

    @Column(nullable = false, unique = true, length = 7)
    val licensePlateCar: String,

    @Column(nullable = false, length = 70)
    val brandCar: String,

    @Column(nullable = false, length = 70)
    val modelCar: String,

    @Column(nullable = false, length = 70)
    val colorCar: String,

    @Column(nullable = false)
    val dateTime: LocalDateTime = LocalDateTime.now(),

    @Column(nullable = false, length = 130)
    val responsibleName: String,

    @Column(nullable = false, length = 30)
    val apartment: String,

    @Column(nullable = false, length = 30)
    val block: String
)