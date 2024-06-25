package com.fatec.city.mappers;

import com.fatec.city.dto.CityRequest;
import com.fatec.city.dto.CityResponse;
import com.fatec.city.entities.City;

public class CityMapper {
    
    public static City toEntity(CityRequest request){
        City city = new City();
        city.setName(request.name());
        city.setEstado(request.estado());
        city.setPopul(request.popul());
        city.setPib(request.pib());

        return city;
    }

    public static CityResponse toDTO(City city){
        return new CityResponse(city.getId(), city.getName(), city.getEstado(), city.getPopul(), city.getPib());
    }

}
