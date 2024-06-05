package com.codegym.thi.controller;

import com.codegym.thi.model.Country;
import com.codegym.thi.service.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@CrossOrigin("*")
@RequestMapping("/countries")
public class CountryController {
    @Autowired
    private ICountryService countryService;

    @GetMapping("")
    public ResponseEntity<List<Country>> getAll() {
        List<Country> list = countryService.findAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
