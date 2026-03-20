/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicahospital.models;

/**
 *
 * @author ESTUDIANTE
 */
public class Medico extends Persona
{

    private String especialidad;
    private String TarjetaProfesional;

    public Medico() {}

    public Medico(String nombre, int edad, int cedula, String especialidad, String TarjetaProfesional) {
        super(nombre, edad, cedula);
        this.especialidad = especialidad;
        this.TarjetaProfesional = TarjetaProfesional;
    }

    public String getEspecialidad() {
        return this.especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getTarjetaProfesional() {
        return this.TarjetaProfesional;
    }

    public void setTarjetaProfesional(String TarjetaProfesional) {
        this.TarjetaProfesional = TarjetaProfesional;
    }

    public void Medico() {
        // TODO: implement
    }

    public void Medico(String especialidad, String TarjetaProfesional) {
        // TODO: implement
    }

    public void atender(String c) {
        // TODO: implement
    }

    public String getEspecialidad() {
        return null;
    }

    public String getTarjeta() {
        return null;
    }

    public String toString() {
        return null;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "especialidad='" + especialidad + "'" +
                ", TarjetaProfesional='" + TarjetaProfesional + "'" +
                "}";
    }
}
