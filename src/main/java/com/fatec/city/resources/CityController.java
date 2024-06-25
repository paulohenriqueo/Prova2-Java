package com.fatec.city.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.city.dto.CityResponse;
import com.fatec.city.entities.City;
import com.fatec.city.resources.services.CityService;

@RestController
@RequestMapping("city")
public class CityController {
    

    @Autowired
    private CityService cityService;

    @GetMapping
    public ResponseEntity<List<CityResponse>> getCities(){
        return ResponseEntity.ok(cityService.getCities());
    }

    @GetMapping("{id}")
    public City geCityById(@PathVariable int id){
        return cityService.getCityById(id);
    }

    @PutMapping("{id}")
    public void uptade(@PathVariable int id, @RequestBody City city){
        this.cityService.update(id, city);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable int id) {
        this.cityService.deleteCityById(id);
    }
}
