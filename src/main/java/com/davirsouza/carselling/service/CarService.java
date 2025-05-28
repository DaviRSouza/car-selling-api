package com.davirsouza.carselling.service;

import com.davirsouza.carselling.domain.Car;
import com.davirsouza.carselling.repository.CarRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import java.time.LocalDate;
import java.util.List;

@Service
public class CarService {

    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public void saveCar(Car car) {
        car.setDataCadastro(LocalDate.now());
        carRepository.save(car);
    }

    public List<Car> getAllCars() {
        Sort sort = Sort.by("Marca").ascending();
        return carRepository.findAll(sort);
    }
}
