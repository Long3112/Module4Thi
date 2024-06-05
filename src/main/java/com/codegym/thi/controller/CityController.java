package com.codegym.thi.controller;

import com.codegym.thi.model.City;
import com.codegym.thi.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin("*")
@RequestMapping("/cities")


public class CityController {
    @Autowired
private ICityService cityService;
    @GetMapping("")
    public ResponseEntity<List<City>> getAll(){
        List<City> list = cityService.findAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    @PostMapping("")
    public ResponseEntity<String> add(@RequestBody City city) {
        cityService.save(city);
        String message = "Add success";
        return new ResponseEntity<>(message, HttpStatus.CREATED);
    }

    @PutMapping("{id}")
    public ResponseEntity<String> edit(@PathVariable Long id, @RequestBody City city) {
        city.setId(id);
        cityService.save(city);
        String message = "Edit success";
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        cityService.remove(id);
        String message = "Deleted success";
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
    @GetMapping("{id}")
    public ResponseEntity<City> findById(@PathVariable Long id) {
        City city = cityService.findById(id);
        return new ResponseEntity<>(city, HttpStatus.OK);
    }

}

