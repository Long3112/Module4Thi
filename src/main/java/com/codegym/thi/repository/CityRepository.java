package com.codegym.thi.repository;

import com.codegym.thi.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository <City,Long> {
}
