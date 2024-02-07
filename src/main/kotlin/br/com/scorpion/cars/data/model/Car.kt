package br.com.scorpion.cars.data.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.time.Year

@Entity
class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null
    var carBrand: String = ""
    var carModel: String = ""
    var carYear: Year = Year.now()
    var carLicensePlate: String = ""

    // Construtor vazio
    constructor();

    // Construtor com todos os atributos
    constructor(carBrand: String, carModel: String, carYear: Year, carLicensePlate: String) {
        this.carBrand = carBrand
        this.carModel = carModel
        this.carYear = carYear
        this.carLicensePlate = carLicensePlate
    }
}