package com.example.primefaces.repository;

import com.example.primefaces.model.car.Car;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.JoinType;
import java.util.List;

public class CarSpecification {
	public static Specification<Car> getCarsByTyres(List<Long> tyreIds) {
		return (root, query, criteriaBuilder) -> root.join("tyres", JoinType.LEFT).get("tyre").get("id").in(tyreIds);
	}
}
