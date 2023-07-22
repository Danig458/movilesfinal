package com.example.vengaamipueblo2.moldes;

public class MoldeSitios {
    private String nombre;
    private String telefono;
    private String precio;
    private int foto;

    public MoldeSitios() {
    }

    public MoldeSitios(String nombre, String telefono, String precio, int foto) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.precio = precio;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}


