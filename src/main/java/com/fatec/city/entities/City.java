package com.fatec.city.entities;

public class City {
    
    private Integer id;
    private String name;
    private String estado;
    private String popul;
    private String pib;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getPopul() {
        return popul;
    }
    public void setPopul(String popul) {
        this.popul = popul;
    }
    public String getPib() {
        return pib;
    }
    public void setPib(String pib) {
        this.pib = pib;
    }


}
