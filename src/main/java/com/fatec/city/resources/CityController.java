package com.fatec.city.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.city.entities.City;

@RestController
@RequestMapping("city")
public class CityController {
    

    @GetMapping
    public List<City> getCity(){

        City c1 = new City();
        c1.setId(1);
        c1.setName("Itu");
        c1.setEstado("SP");
        c1.setPopul("175.568");
        c1.setPib("84B");

        City c2 = new City();
        c2.setId(2);
        c2.setName("Salto");
        c2.setEstado("SP");
        c2.setPopul("119.736");
        c2.setPib("9.3B");

        City c3 = new City();
        c3.setId(3);
        c3.setName("Cabreuva");
        c3.setEstado("SP");
        c3.setPopul("50.429");
        c3.setPib("6B");

        ArrayList<City> lista = new ArrayList<City>();
        lista.add(c1);
        lista.add(c2);
        lista.add(c3);

        return lista;
    }
}
