package com.fatec.city.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.city.entities.City;
import com.fatec.city.resources.services.CityService;

@RestController
@RequestMapping("city")
public class CityController {
    

    @Autowired
    private CityService cityService;

    @GetMapping
    public List<City> getCity(){

        return cityService.getCities();
    }
}
