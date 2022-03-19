/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.concurso.softku;

import java.util.*;

/**
 *
 * @author DIDIER JAVIER
 */
public class Pregunta {
    private String pregunta;
    //private Respuesta posiblesRespuestas[];
    private ArrayList<Respuesta> posiblesRespuestas;
    private static final int MAX_POSIBLES_RESPUESTAS = 4;
    private Integer contadorRespuestas = 0;

    public Pregunta(String pregunta) {
        this.pregunta = pregunta;
        this.posiblesRespuestas = new ArrayList<>();
    }

    public void agregarRespuesta(Respuesta respuesta) {
        if (this.contadorRespuestas >= Pregunta.MAX_POSIBLES_RESPUESTAS){
            System.out.println("No se pueden agregar mas respuestas");
            System.out.println("La cantidad máxima de respuestas es: " + Pregunta.MAX_POSIBLES_RESPUESTAS);
        } else {
            //this.posiblesRespuestas [this.contadorRespuestas ++] = respuesta;
            this.contadorRespuestas++;
            this.posiblesRespuestas.add(respuesta);
        }
        
    }

    @Override
    public String toString() {
        return "Pregunta:\n" + pregunta + "\n" + this.posiblesRespuestas;
    }       
    
//    public void mostrarPregunta() {
//        System.out.println("\nPregunta: " + this.pregunta);
//        System.out.println();
//        for (int i = 0; i < this.contadorRespuestas; i++) {
//            System.out.println(this.posiblesRespuestas.get(i));
//        }
//        //System.out.println("\ttotal de la orden: " + calcularTotal() + "\n");
//    }   
    
}
