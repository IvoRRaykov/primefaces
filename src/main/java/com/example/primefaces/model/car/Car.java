package com.example.primefaces.model.car;

import com.example.primefaces.model.owner.Owner;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.List;

@Entity()
@Table(name = "cars")
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String brand;
	private int year;
	private String color;

	@ManyToMany
	@JoinTable(name = "carOwners", joinColumns = @JoinColumn(name = "carId"), inverseJoinColumns = @JoinColumn(name = "ownerId"))
	private List<Owner> owners;

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@Fetch(value = FetchMode.SUBSELECT)
	@JoinColumn(name = "carId")
	private List<CarTyre> tyres;

	public Car() {
	}

	public Car(Long id, String brand, int year, String color) {
		this.id = id;
		this.brand = brand;
		this.year = year;
		this.color = color;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public List<Owner> getOwners() {
		return owners;
	}

	public void setOwners(List<Owner> owners) {
		this.owners = owners;
	}

	public List<CarTyre> getTyres() {
		return tyres;
	}

	public void setTyres(List<CarTyre> tyres) {
		this.tyres = tyres;
	}
}
