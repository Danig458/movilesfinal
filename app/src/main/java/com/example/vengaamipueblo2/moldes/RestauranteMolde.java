package com.example.vengaamipueblo2.moldes;

public class RestauranteMolde {

    private String nombre;
    private String plato;
    private String rangoPrecios;
    private int foto;

    public RestauranteMolde() {
    }

    public RestauranteMolde(String nombre, String plato, String rangoPrecios, int foto) {
        this.nombre = nombre;
        this.plato = plato;
        this.rangoPrecios = rangoPrecios;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPlato() {
        return plato;
    }

    public void setPlato(String plato) {
        this.plato = plato;
    }

    public String getRangoPrecios() {
        return rangoPrecios;
    }

    public void setRangoPrecios(String rangoPrecios) {
        this.rangoPrecios = rangoPrecios;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
