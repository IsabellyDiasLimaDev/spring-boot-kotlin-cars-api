# Cars Api

> Project based in you.com

## Table of content
- [Cars Api](#cars-api)

    - [Installation](#installation)
    - [Endpoints Manual](#endpoints-manual)
    - [Videos endpoint](#videos-endpoint)
    - [Project Structure](#project-structure)
    - [Data Schemas](#data-schemas)
        - [Car Schema](#car-schema)

## Installation

Before start the project locally you must have [Java 17](https://adoptium.net/temurin/releases/?version=17), [Maven](https://maven.apache.org/install.html) 
and [IntelliJ IDEA](https://www.jetbrains.com/pt-br/idea/) installed on your machine.

After clone the project, open in the IntelliJ or your preferred IDE
If you are in the IntelliJ, just open ```src/main/kotlin/br/com/scorpion/cars/CarsApiApplication.kt``` and start the project
Now if you are not anywhere IDE, open your terminal and run ```./mvnw install```, after that run ```./mvnw spring-boot:run```

## Endpoints Manual

### Videos endpoint

| Method | Route | Functionality                | Body Data                 | Query Params                | Auth Required | Content Return                 |
| ------ |-------|------------------------------| ------------------------- |-----------------------------| ------------- |--------------------------------|
| POST   | /cars | create a new car description | [Car Schema](#car-schema) | empty                       | false         | empty                          |
| GET    | /cars | show all cars                | empty                     | page: number & size: number | false         | [Car Schema](#car-schema) List |


## Project Structure

This API was written in [Kotlin](https://kotlinlang.org/) together with the [spring](https://spring.io/) framework for http operations and [h2](https://www.h2database.com/html/main.html) database.

Below is the current project directory structure:

```
├── .mvn
    ├── wrapper
        ├── maven-wrapper.jar
        ├── maven-wrapper.properties
├── src
    ├── main
        ├── kotlin
            ├── br.com.scorpion.cars
                ├── api
                    ├── controller
                        ├── CarController.kt
                    ├── service
                        ├── CarService.kt
                ├── data
                    ├── model
                        ├── Car.kt
                    ├── repository
                        ├── CarRepository.kt
                ├── CarsApiApplication.kt
        ├── resources
            ├── application.properties
    ├── test
        ├── kotlin
            ├── br.com.scorpion.cars
                ├── CarsApiApplicationTests.kt
├── .gitignore
├── mvnw
├── mvnw.cmd
├── pom.xml
├── README.md
```

## Data Schemas

The project have the current data schemas:

- ### Car Schema

```
{
    id: integer,
    carBrand: String,
    carModel: String,
    carYear: integer,
    carLicensePlate: String,
}
```


