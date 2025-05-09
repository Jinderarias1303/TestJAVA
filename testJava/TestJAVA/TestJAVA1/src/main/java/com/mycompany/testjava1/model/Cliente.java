/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testjava1.model;

/**
 *
 * @author camper
 */
public class Cliente {
    
    public enum TipoSector{
        Tecnologia,Salud,Educacion,Comercio,Manofactura
    }
    
    
   public String NOMBRE;
   public String REPRESENTANTE;
   public String CORREO;
   public int TELEFONO;
   public String DIRECCION;
   public TipoSector tiposector;

    public Cliente() {
    }

    public Cliente(String NOMBRE, String REPRESENTANTE, String CORREO, int TELEFONO, String DIRECCION, TipoSector tiposector) {
        this.NOMBRE = NOMBRE;
        this.REPRESENTANTE = REPRESENTANTE;
        this.CORREO = CORREO;
        this.TELEFONO = TELEFONO;
        this.DIRECCION = DIRECCION;
        this.tiposector = tiposector;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getREPRESENTANTE() {
        return REPRESENTANTE;
    }

    public void setREPRESENTANTE(String REPRESENTANTE) {
        this.REPRESENTANTE = REPRESENTANTE;
    }

    public String getCORREO() {
        return CORREO;
    }

    public void setCORREO(String CORREO) {
        this.CORREO = CORREO;
    }

    public int getTELEFONO() {
        return TELEFONO;
    }

    public void setTELEFONO(int TELEFONO) {
        this.TELEFONO = TELEFONO;
    }

    public String getDIRECCION() {
        return DIRECCION;
    }

    public void setDIRECCION(String DIRECCION) {
        this.DIRECCION = DIRECCION;
    }

    public TipoSector getTiposector() {
        return tiposector;
    }

    public void setTiposector(TipoSector tiposector) {
        this.tiposector = tiposector;
    }

    @Override
    public String toString() {
        return "cliente{" + "NOMBRE=" + NOMBRE + ", REPRESENTANTE=" + REPRESENTANTE + ", CORREO=" + CORREO + ", TELEFONO=" + TELEFONO + ", DIRECCION=" + DIRECCION + ", tiposector=" + tiposector + '}';
    }
   
   
}
