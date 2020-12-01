package com.example.primefaces.service;

import com.example.primefaces.model.car.Car;
import com.example.primefaces.repository.CarRepository;
import com.example.primefaces.repository.CarSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class CarService {

	@Autowired
	private CarRepository carRepository;

	public List<Car> findMishelinCarsOnly() {
		List<Long> tyreIds = Collections.singletonList(2l);

		return carRepository.findAll(
				CarSpecification.getCarsByTyres(tyreIds));
	}
}
