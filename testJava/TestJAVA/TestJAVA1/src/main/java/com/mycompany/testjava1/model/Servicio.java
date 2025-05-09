/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testjava1.model;

/**
 *
 * @author camper
 */
public class Servicio {
    
    public enum TipoCategoria{
        TI,Limpieza,Seguridad,Administracion
    }
    
    public String NOMBRE;
    public String DESCRIPCION;
    public double PRECIOPORHORA;
    public TipoCategoria tipocategoria;

    public Servicio() {
    }

    public Servicio(String NOMBRE, String DESCRIPCION, double PRECIOPORHORA, TipoCategoria tipocategoria) {
        this.NOMBRE = NOMBRE;
        this.DESCRIPCION = DESCRIPCION;
        this.PRECIOPORHORA = PRECIOPORHORA;
        this.tipocategoria = tipocategoria;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getDESCRIPCION() {
        return DESCRIPCION;
    }

    public void setDESCRIPCION(String DESCRIPCION) {
        this.DESCRIPCION = DESCRIPCION;
    }

    public double getPRECIOPORHORA() {
        return PRECIOPORHORA;
    }

    public void setPRECIOPORHORA(double PRECIOPORHORA) {
        this.PRECIOPORHORA = PRECIOPORHORA;
    }

    public TipoCategoria getTipocategoria() {
        return tipocategoria;
    }

    public void setTipocategoria(TipoCategoria tipocategoria) {
        this.tipocategoria = tipocategoria;
    }

    @Override
    public String toString() {
        return "Servicio{" + "NOMBRE=" + NOMBRE + ", DESCRIPCION=" + DESCRIPCION + ", PRECIOPORHORA=" + PRECIOPORHORA + ", tipocategoria=" + tipocategoria + '}';
    }
    
    
}
