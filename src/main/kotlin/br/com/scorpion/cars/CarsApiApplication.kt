package br.com.scorpion.cars

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CarsApiApplication

fun main(args: Array<String>) {
	runApplication<CarsApiApplication>(*args)
}
