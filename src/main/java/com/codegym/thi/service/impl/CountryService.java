package com.codegym.thi.service.impl;

import com.codegym.thi.model.City;
import com.codegym.thi.model.Country;
import com.codegym.thi.repository.CountryRepository;
import com.codegym.thi.service.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CountryService implements ICountryService {
    @Autowired
    private CountryRepository countryRepository;
    @Override
    public List<Country> findAll() {
        return countryRepository.findAll();
    }

    @Override
    public Country findById(Long id) {
        return null;
    }

    @Override
    public void save(Country country) {

    }

    @Override
    public void remove(Long id) {

    }
}
