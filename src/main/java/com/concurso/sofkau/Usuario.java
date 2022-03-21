/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.concurso.sofkau;

/**
 *
 * @author DIDIER JAVIER
 */
public class Usuario {//Atributos de la clase
    private String nombre;
    private static int puntos;
    
    //Constructor de la clase
    public Usuario(String nombre) {
        this.nombre = nombre;
        Usuario.puntos = 1;
    }

    //Métodos get y set
    public static int getPuntos() {
        return puntos;
    }

    public static void setPuntos(int puntos) {
        Usuario.puntos = puntos;
    }

    public String getName() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}


