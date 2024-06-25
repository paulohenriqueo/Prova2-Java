package com.fatec.city.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CityRequest (
    @NotNull (message = "Campo requerido!!")
    String name,

    @NotBlank (message = "Campo requerido!!")
    String estado,

    @NotBlank (message = "Campo requerido!!")
    String popul,

    @NotBlank (message = "Campo requerido!!")
    String pib
) {
    

}
