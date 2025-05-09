/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testjava1.model;

import java.time.LocalDate;

/**
 *
 * @author camper
 */
public class Asignacion {
    public int ID_EMPLEADO;
    public int ID_PROYECTO;
    public int HORAS_TRABAJADAS;
    public LocalDate FECHA_ASIGNACION;

    public Asignacion() {
    }

    public Asignacion(int ID_EMPLEADO, int ID_PROYECTO, int HORAS_TRABAJADAS, LocalDate FECHA_ASIGNACION) {
        this.ID_EMPLEADO = ID_EMPLEADO;
        this.ID_PROYECTO = ID_PROYECTO;
        this.HORAS_TRABAJADAS = HORAS_TRABAJADAS;
        this.FECHA_ASIGNACION = FECHA_ASIGNACION;
    }

    public int getID_EMPLEADO() {
        return ID_EMPLEADO;
    }

    public void setID_EMPLEADO(int ID_EMPLEADO) {
        this.ID_EMPLEADO = ID_EMPLEADO;
    }

    public int getID_PROYECTO() {
        return ID_PROYECTO;
    }

    public void setID_PROYECTO(int ID_PROYECTO) {
        this.ID_PROYECTO = ID_PROYECTO;
    }

    public int getHORAS_TRABAJADAS() {
        return HORAS_TRABAJADAS;
    }

    public void setHORAS_TRABAJADAS(int HORAS_TRABAJADAS) {
        this.HORAS_TRABAJADAS = HORAS_TRABAJADAS;
    }

    public LocalDate getFECHA_ASIGNACION() {
        return FECHA_ASIGNACION;
    }

    public void setFECHA_ASIGNACION(LocalDate FECHA_ASIGNACION) {
        this.FECHA_ASIGNACION = FECHA_ASIGNACION;
    }

    @Override
    public String toString() {
        return "Asignacion{" + "ID_EMPLEADO=" + ID_EMPLEADO + ", ID_PROYECTO=" + ID_PROYECTO + ", HORAS_TRABAJADAS=" + HORAS_TRABAJADAS + ", FECHA_ASIGNACION=" + FECHA_ASIGNACION + '}';
    }
    
    
    
}
