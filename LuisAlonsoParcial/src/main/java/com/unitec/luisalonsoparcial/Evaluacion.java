/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unitec.luisalonsoparcial;

/**
 *
 * @author Alonso
 */
public class Evaluacion {
    private String nombre;
    private float calificacion;

    public Evaluacion(float calificacion) {
        this.calificacion = calificacion;
    }

    public Evaluacion(String nombre) {
        this.nombre = nombre;
    }

    public Evaluacion(String nombre, float calificacion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }

    public Evaluacion() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }
    
}
