package com.fatec.city.resources.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatec.city.dto.CityResponse;
import com.fatec.city.entities.City;
import com.fatec.city.mappers.CityMapper;
import com.fatec.city.repositories.CityRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class CityService {
    
    @Autowired
    private CityRepository cityRepository;

    public List<CityResponse> getCities(){

        List <City> cities = cityRepository.findAll();

        return cities.stream()
                                .map(c -> CityMapper.toDTO(c))
                                .collect(Collectors.toList());
    }

    
    public City getCityById(int id){
        return cityRepository.findById(id).orElseThrow(
            () -> new EntityNotFoundException("Cidade não encontrada")
        );
    }

}
