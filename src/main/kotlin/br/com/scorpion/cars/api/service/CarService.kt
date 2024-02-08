package br.com.scorpion.cars.api.service

import br.com.scorpion.cars.data.model.Car
import br.com.scorpion.cars.data.repository.CarRepository
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Service
import java.util.Optional

@Service
class CarService(val carRepository: CarRepository) {
    fun createCar(car: Car): Car {
        return carRepository.save(car)
    }

    fun getCars(pageNumber: Int, pageSize: Int): Page<Car> {
        val pageRequest: PageRequest = PageRequest.of(pageNumber, pageSize, Sort.by("id").ascending())
        return carRepository.findAll(pageRequest)
    }

    fun getCarById(id: Long): Optional<Car> {
        return carRepository.findById(id)
    }

    fun updateCar(car: Car): Car {
        return carRepository.save(car)
    }

    fun deleteCar(id: Long) {
        carRepository.deleteById(id);
    }
}