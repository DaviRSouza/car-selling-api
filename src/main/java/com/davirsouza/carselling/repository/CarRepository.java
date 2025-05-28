package com.davirsouza.carselling.repository;

import com.davirsouza.carselling.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
