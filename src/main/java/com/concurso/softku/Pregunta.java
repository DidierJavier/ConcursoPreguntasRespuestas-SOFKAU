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
    private Respuesta posiblesRespuestas[];
    private static final int MAX_PREGUNTAS = 25;
    private int contadorRespuestas;

    public Pregunta(String pregunta) {
        this.pregunta = pregunta;
        this.posiblesRespuestas = new Respuesta[Pregunta.MAX_PREGUNTAS];
    }

//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("Pregunta{");
//        sb.append("pregunta=").append(pregunta);
//        sb.append(", posiblesRespuestas=").append(posiblesRespuestas);
//        sb.append(", contadorRespuestas=").append(contadorRespuestas);
//        sb.append('}');
//        return sb.toString();
//    }

    public void agregarRespuesta(Respuesta respuesta) {
        if (this.contadorRespuestas >= Pregunta.MAX_PREGUNTAS){
            System.out.println("No se pueden agregar mas respuestas");
            System.out.println("La cantidad máxima de respuestas es: " + Pregunta.MAX_PREGUNTAS);
        } else {
            this.posiblesRespuestas [this.contadorRespuestas ++] = respuesta;            
        }
        
    }
    
    public void mostrarPregunta() {
        System.out.println("Pregunta: " + this.pregunta);
        System.out.println();
        for (int i = 0; i < this.contadorRespuestas; i++) {
            System.out.println(this.posiblesRespuestas[i]);
        }
        //System.out.println("\ttotal de la orden: " + calcularTotal() + "\n");
    }   
    
}
