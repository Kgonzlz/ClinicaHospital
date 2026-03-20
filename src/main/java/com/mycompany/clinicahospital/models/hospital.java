/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicahospital.models;

/**
 *
 * @author ESTUDIANTE
 */
public class hospital
{

    private String nombre;
    private String ciudad;
    private consulta consultas;

    public hospital() {}

    public hospital(String nombre, String ciudad, consulta consultas) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.consultas = consultas;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return this.ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public consulta getConsultas() {
        return this.consultas;
    }

    public void setConsultas(consulta consultas) {
        this.consultas = consultas;
    }

    public void hospital() {
        // TODO: implement
    }

    public void hospital(String nombre, String ciudad, consulta cunsultas) {
        // TODO: implement
    }

    public void registrarConsulta(consulta c) {
        // TODO: implement
    }

    public void getNombre() {
        // TODO: implement
    }

    public void getConsulta(int i) {
        // TODO: implement
    }

    @Override
    public String toString() {
        return "hospital{" +
                "nombre='" + nombre + "'" +
                ", ciudad='" + ciudad + "'" +
                ", consultas=" + consultas +
                "}";
    }
}