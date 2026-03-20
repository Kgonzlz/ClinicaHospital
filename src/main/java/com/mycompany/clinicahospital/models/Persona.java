/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicahospital.models;

/**
 *
 * @author ESTUDIANTE
 */

  public class Persona {

    private String nombre;
    private int edad;
    private int cedula;

    public Persona() {}

    public Persona(String nombre, int edad, int cedula) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCedula() {
        return this.cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void Persona() {
        // TODO: implement
    }

    public void Persona(String Nombre, int Edad, int Cedula) {
        // TODO: implement
    }

    public String getNombre() {
        return null;
    }

    public String toString() {
        return null;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + "'" +
                ", edad=" + edad +
                ", cedula=" + cedula +
                "}";
    }

}
