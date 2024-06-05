package com.codegym.thi.service.impl;

import com.codegym.thi.model.City;
import com.codegym.thi.repository.CityRepository;
import com.codegym.thi.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService  implements ICityService {
    @Autowired
    private CityRepository cityRepository;
    @Override
    public List<City> findAll() {
        return cityRepository.findAll();
    }

    @Override
    public City findById(Long id) {
        return cityRepository.findById(id).get();
    }

    @Override
    public void save(City city) {
         cityRepository.save(city);
    }

    @Override
    public void remove(Long id) {
          cityRepository.deleteById(id);
    }
}
