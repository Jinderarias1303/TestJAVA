/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testjava1.model;

/**
 *
 * @author camper
 */
public class Empleado {
    
    public enum TipoEspecialidad{
        TI,Administracion,Limpieza,Seguridad
    }
    
    public String NOMBRE;
    public String CARGO;
    public double SALARIO;
    public TipoEspecialidad tipoespecialidad;

    public Empleado() {
    }

    public Empleado(String NOMBRE, String CARGO, double SALARIO, TipoEspecialidad tipoespecialidad) {
        this.NOMBRE = NOMBRE;
        this.CARGO = CARGO;
        this.SALARIO = SALARIO;
        this.tipoespecialidad = tipoespecialidad;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getCARGO() {
        return CARGO;
    }

    public void setCARGO(String CARGO) {
        this.CARGO = CARGO;
    }

    public double getSALARIO() {
        return SALARIO;
    }

    public void setSALARIO(double SALARIO) {
        this.SALARIO = SALARIO;
    }

    public TipoEspecialidad getTipoespecialidad() {
        return tipoespecialidad;
    }

    public void setTipoespecialidad(TipoEspecialidad tipoespecialidad) {
        this.tipoespecialidad = tipoespecialidad;
    }

    @Override
    public String toString() {
        return "Empleado{" + "NOMBRE=" + NOMBRE + ", CARGO=" + CARGO + ", SALARIO=" + SALARIO + ", tipoespecialidad=" + tipoespecialidad + '}';
    }
    
    
}
