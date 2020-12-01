package com.example.primefaces.repository;

import com.example.primefaces.model.car.Tyre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TyreRepository extends JpaRepository<Tyre, Long> {
}
