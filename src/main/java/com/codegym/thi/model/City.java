package com.codegym.thi.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double area;
    private Long population;
    private double gdp;
    private String description;
    @ManyToOne
    private Country country;
}
