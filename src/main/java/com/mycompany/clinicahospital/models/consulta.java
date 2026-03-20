/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicahospital.models;

/**
 *
 * @author ESTUDIANTE
 */
public class consulta
{

    private String fecha;
    private String motivo;
    private String diagnostico;

    public consulta() {}

    public consulta(String fecha, String motivo, String diagnostico) {
        this.fecha = fecha;
        this.motivo = motivo;
        this.diagnostico = diagnostico;
    }

    public String getFecha() {
        return this.fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMotivo() {
        return this.motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getDiagnostico() {
        return this.diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public void consulta() {
        // TODO: implement
    }

    public void consulta(String fecha, String motivo, String diagnostico) {
        // TODO: implement
    }

    public void getFecha() {
        // TODO: implement
    }

    public void getMotivo() {
        // TODO: implement
    }

    public void toString() {
        // TODO: implement
    }

    @Override
    public String toString() {
        return "consulta{" +
                "fecha='" + fecha + "'" +
                ", motivo='" + motivo + "'" +
                ", diagnostico='" + diagnostico + "'" +
                "}";
    }
}
