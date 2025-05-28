package com.davirsouza.carselling.controller;

import com.davirsouza.carselling.domain.Car;
import com.davirsouza.carselling.service.CarService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarController {
    public final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @PostMapping("/cadastroAutomoveis")
    @ResponseStatus(HttpStatus.CREATED)
    public void registerCar(@RequestBody Car car) {
        carService.saveCar(car);
    }

    @GetMapping("/automoveis")
    public List<Car> getCars() {
        return carService.getAllCars();
    }
}
