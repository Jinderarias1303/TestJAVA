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
public class Proyecto {
    public enum TipoEstado{
        En_curso,Completado,Cancelado
    }
    
    public int ID_CLIENTE;
    public String NOMBRE;
    public LocalDate FECHA_INICIO;
    public LocalDate FECHA_FIN;
    public TipoEstado tipoestado;

    public Proyecto() {
    }

    public Proyecto(int ID_CLIENTE, String NOMBRE, LocalDate FECHA_INICIO, LocalDate FECHA_FIN, TipoEstado tipoestado) {
        this.ID_CLIENTE = ID_CLIENTE;
        this.NOMBRE = NOMBRE;
        this.FECHA_INICIO = FECHA_INICIO;
        this.FECHA_FIN = FECHA_FIN;
        this.tipoestado = tipoestado;
    }

    public int getID_CLIENTE() {
        return ID_CLIENTE;
    }

    public void setID_CLIENTE(int ID_CLIENTE) {
        this.ID_CLIENTE = ID_CLIENTE;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public LocalDate getFECHA_INICIO() {
        return FECHA_INICIO;
    }

    public void setFECHA_INICIO(LocalDate FECHA_INICIO) {
        this.FECHA_INICIO = FECHA_INICIO;
    }

    public LocalDate getFECHA_FIN() {
        return FECHA_FIN;
    }

    public void setFECHA_FIN(LocalDate FECHA_FIN) {
        this.FECHA_FIN = FECHA_FIN;
    }

    public TipoEstado getTipoestado() {
        return tipoestado;
    }

    public void setTipoestado(TipoEstado tipoestado) {
        this.tipoestado = tipoestado;
    }

    @Override
    public String toString() {
        return "Proyecto{" + "ID_CLIENTE=" + ID_CLIENTE + ", NOMBRE=" + NOMBRE + ", FECHA_INICIO=" + FECHA_INICIO + ", FECHA_FIN=" + FECHA_FIN + ", tipoestado=" + tipoestado + '}';
    }
    
    
}
