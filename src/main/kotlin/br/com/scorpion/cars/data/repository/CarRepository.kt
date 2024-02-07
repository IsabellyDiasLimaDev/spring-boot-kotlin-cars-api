package br.com.scorpion.cars.data.repository

import br.com.scorpion.cars.data.model.Car
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CarRepository: JpaRepository<Car, Long> {
}