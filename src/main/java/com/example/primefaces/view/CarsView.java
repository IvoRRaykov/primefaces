package com.example.primefaces.view;

import com.example.primefaces.model.car.Car;
import com.example.primefaces.model.user.MyUserDetails;
import com.example.primefaces.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class CarsView implements Serializable {

	private static final long serialVersionUID = 1L;

	@Autowired
	private CarRepository carRepository;

	private List<Car> cars;

	private String user;

	@PostConstruct
	public void init() {
		cars = carRepository.findAll();
	}

	public String getUser() {
		MyUserDetails asd = (MyUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		return asd.getUsername();
	}

	public List<Car> getCars() {
		return cars;
	}
}
