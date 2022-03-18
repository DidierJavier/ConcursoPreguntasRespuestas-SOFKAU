/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.concurso.softku;

/**
 *
 * @author DIDIER JAVIER
 */
public class Pregunta {
    private String pregunta;
    private Respuesta posiblesRespuestas[][];

    public Pregunta(String pregunta, Respuesta[][] posiblesRespuestas) {
        this.pregunta = pregunta;
        this.posiblesRespuestas = posiblesRespuestas;
    }
    
//    Respuesta respuestaA_Ronda1 = new Respuesta("El pollo", 'A' , true);
//    Respuesta respuestaB_Ronda1 = new Respuesta("El ", 'B' , true);
//    Respuesta respuestaC_Ronda1 = new Respuesta("El pollo", 'A' , true);
//    Respuesta respuestaD_Ronda1 = new Respuesta("El pollo", 'B' , true);
}
