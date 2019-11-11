package com.example.movilparaiso;

public class Atractivos  {
    private String nombre;
    private String horario;
    private String dirección;
    private String descripción;
    private String Distrito;

    public String getNombre() {
        return nombre;
    }

    public Atractivos() {
    }

    public Atractivos(String nombre, String horario, String dirección, String descripción, String distrito) {
        this.nombre = nombre;
        this.horario = horario;
        this.dirección = dirección;
        this.descripción = descripción;
        Distrito = distrito;
    }
}
