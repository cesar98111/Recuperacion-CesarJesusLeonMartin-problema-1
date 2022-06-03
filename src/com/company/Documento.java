package com.company;

public class Documento {
    private String nombre;
    private String tamaño;

    public Documento (String nombre, String tamaño){

        this.nombre = nombre;
        this.tamaño = tamaño;

    }

    @Override
    public String toString() {
        return "Documento{" +
                "nombre='" + nombre + '\'' +
                ", tamaño='" + tamaño + '\'' +
                '}';
    }
}
