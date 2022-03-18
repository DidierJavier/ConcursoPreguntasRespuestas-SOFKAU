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
    private static final int MAX_POSIBLES_RESPUESTAS = 100;
    private int contadorRespuestas;

    public Pregunta(String pregunta) {
        this.pregunta = pregunta;
        this.posiblesRespuestas = new Respuesta[Pregunta.MAX_POSIBLES_RESPUESTAS];
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
        if (this.contadorRespuestas >= Pregunta.MAX_POSIBLES_RESPUESTAS){
            System.out.println("No se pueden agregar mas respuestas");
            System.out.println("La cantidad máxima de respuestas es: " + Pregunta.MAX_POSIBLES_RESPUESTAS);
        } else {
            this.posiblesRespuestas [this.contadorRespuestas ++] = respuesta;            
        }
        
    }
    
    public void mostrarPregunta() {
        System.out.println("\nPregunta: " + this.pregunta);
        System.out.println();
        for (int i = 0; i < this.contadorRespuestas; i++) {
            System.out.println(this.posiblesRespuestas[i]);
        }
        //System.out.println("\ttotal de la orden: " + calcularTotal() + "\n");
    }   
    
}
