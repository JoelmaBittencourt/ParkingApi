package com.api.parkingcontrol.dtos

import java.time.LocalDateTime
import javax.persistence.Column

class ParkingSpotDto (
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

    @Column(nullable = false, length = 130)
    val responsibleName: String,

    @Column(nullable = false, length = 30)
    val apartment: String,

    @Column(nullable = false, length = 30)
    val block: String
)
