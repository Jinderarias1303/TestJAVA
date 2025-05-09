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
public class Contrato {
    public enum TipoEstado{
        Activo,En_espera,Finalizado
    }
    
    public int ID_CLIENTE;
    public int ID_SERVICIO;
    public LocalDate FECHA_INICIO;
    public LocalDate FECHA_FIN;
    public double COSTO_TOTAL;
    public TipoEstado tipoestado;

    public Contrato() {
    }

    public Contrato(int ID_CLIENTE, int ID_SERVICIO, LocalDate FECHA_INICIO, LocalDate FECHA_FIN, double COSTO_TOTAL, TipoEstado tipoestado) {
        this.ID_CLIENTE = ID_CLIENTE;
        this.ID_SERVICIO = ID_SERVICIO;
        this.FECHA_INICIO = FECHA_INICIO;
        this.FECHA_FIN = FECHA_FIN;
        this.COSTO_TOTAL = COSTO_TOTAL;
        this.tipoestado = tipoestado;
    }

    public int getID_CLIENTE() {
        return ID_CLIENTE;
    }

    public void setID_CLIENTE(int ID_CLIENTE) {
        this.ID_CLIENTE = ID_CLIENTE;
    }

    public int getID_SERVICIO() {
        return ID_SERVICIO;
    }

    public void setID_SERVICIO(int ID_SERVICIO) {
        this.ID_SERVICIO = ID_SERVICIO;
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

    public double getCOSTO_TOTAL() {
        return COSTO_TOTAL;
    }

    public void setCOSTO_TOTAL(double COSTO_TOTAL) {
        this.COSTO_TOTAL = COSTO_TOTAL;
    }

    public TipoEstado getTipoestado() {
        return tipoestado;
    }

    public void setTipoestado(TipoEstado tipoestado) {
        this.tipoestado = tipoestado;
    }

    @Override
    public String toString() {
        return "contrato{" + "ID_CLIENTE=" + ID_CLIENTE + ", ID_SERVICIO=" + ID_SERVICIO + ", FECHA_INICIO=" + FECHA_INICIO + ", FECHA_FIN=" + FECHA_FIN + ", COSTO_TOTAL=" + COSTO_TOTAL + ", tipoestado=" + tipoestado + '}';
    }
    
    
}
