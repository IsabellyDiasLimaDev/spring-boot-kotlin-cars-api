package br.com.scorpion.cars.api.controller

import br.com.scorpion.cars.api.service.CarService
import br.com.scorpion.cars.data.model.Car
import org.hibernate.engine.jdbc.Size
import org.springframework.data.domain.Page
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("/cars")
class CarController(val carService: CarService) {

    @PostMapping
    fun createCar(@RequestBody car: Car): ResponseEntity<Car> {
        val createdCar = carService.createCar(car);
        return ResponseEntity(createdCar, HttpStatus.CREATED);
    }

    @GetMapping
    fun getCars(
        @RequestParam(defaultValue = "0") page: Int,
        @RequestParam(defaultValue = "10") size: Int
    ): ResponseEntity<Page<Car>> {
        val carsPage = carService.getCars(page, size);
        return ResponseEntity.ok(carsPage);
    }

    @GetMapping("/{id}")
    fun getCarById(@PathVariable id: Long): ResponseEntity<Optional<Car>> {
        val car = carService.getCarById(id);
        return ResponseEntity.ok(car);
    }

    @PutMapping
    fun updateCar(@RequestBody car: Car): ResponseEntity<Car> {
        val updatedCar = carService.updateCar(car);
        return ResponseEntity(updatedCar, HttpStatus.OK);
    }
}