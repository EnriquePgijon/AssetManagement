package com.enrique.gestor_activos.model;

public class Activo {
    private int id;
    private String nombre;

    public Activo(int id, String nombre){
        this.id= id;
        this.nombre=nombre;
    }

    public int getId(){
        return id;
    }

    public String getNombre(){
        return nombre;
    }
}
