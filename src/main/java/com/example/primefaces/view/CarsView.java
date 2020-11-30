package com.example.primefaces.view;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import com.example.primefaces.model.Car;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.primefaces.repository.CarRepository;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;

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
    User asd = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    return asd.getUsername();
  }

  public List<Car> getCars() {
    return cars;
  }
}
