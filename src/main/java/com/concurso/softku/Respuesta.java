/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.concurso.softku;

/**
 *
 * @author DIDIER JAVIER
 */
public class Respuesta {
    private String respuesta;
    private char caracter;
    private boolean acierto;

    public Respuesta(String respuesta, char caracter, boolean acierto) {
        this.respuesta = respuesta;
        this.caracter = caracter;
        this.acierto = acierto;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public char getCaracter() {
        return caracter;
    }

    public boolean isAcierto() {
        return acierto;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Respuesta{");
        sb.append("").append(caracter);
        sb.append(". ").append(respuesta);
        sb.append(", acierto=").append(acierto);
        sb.append('}');
        return sb.toString();
    }
    
    
}
