package com.test.challenge.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "personas")
public class Persona {

    public Persona(){}
    public Persona(Long id_persona, String nombre, int edad, String ocupacion) {
        this.id_persona = id_persona;
        this.nombre = nombre;
        this.edad = edad;
        this.ocupacion = ocupacion;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_persona;
    @Column (name= "nombre")
    private String nombre;
    @Column(name = "edad")
    private int edad;
    @Column(name = "ocupacion")
    private String ocupacion;

    public Long getId_persona() {
        return id_persona;
    }

    public void setId_persona(Long id_persona) {
        this.id_persona = id_persona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String toString()
    {
        return id_persona + " " + nombre;
    }
}
