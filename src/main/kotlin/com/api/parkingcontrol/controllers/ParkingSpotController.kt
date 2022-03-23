package com.api.parkingcontrol.controllers

import com.api.parkingcontrol.repositories.ParkingSpotRepository
import com.api.parkingcontrol.services.ParkingSpotService
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@CrossOrigin(origins = arrayOf("*"), maxAge = 3600)
@RequestMapping("/parking")
class ParkingSpotController {

    class ParkingSpotService(private val service: ParkingSpotService)

    }
