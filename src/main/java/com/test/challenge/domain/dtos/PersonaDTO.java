package com.test.challenge.domain.dtos;
public class PersonaDTO {
    private Long id_persona;
    private String nombre;
    private int edad;
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

    @Override
    public String toString() {
        return "PersonaDTO{" +
                "id_persona=" + id_persona +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", ocupacion='" + ocupacion + '\'' +
                '}';
    }
}
