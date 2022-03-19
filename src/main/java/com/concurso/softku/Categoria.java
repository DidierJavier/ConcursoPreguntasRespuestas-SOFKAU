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
public class Categoria {
    private String categoria;
    private Pregunta posiblesPreguntas[];
    private static final int MAX_POSIBLES_PREGUNTAS = 5;
    private int contadorPreguntas;
    private static int idCategoria;
    
    public Categoria() {    
        this.categoria = categoria;
        this.posiblesPreguntas = new Pregunta[Categoria.MAX_POSIBLES_PREGUNTAS];
        this.idCategoria = idCategoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public Pregunta[] getPosiblesPreguntas() {
        return posiblesPreguntas;
    }

    public int getContadorPreguntas() {
        return contadorPreguntas;
    }

    public void agregarPregunta(Pregunta pregunta) {
        if (this.contadorPreguntas >= Categoria.MAX_POSIBLES_PREGUNTAS){
            System.out.println("No se pueden agregar mas preguntas");
            System.out.println("La cantidad máxima de preguntas es: " + Categoria.MAX_POSIBLES_PREGUNTAS);
        } else {
            this.posiblesPreguntas [this.contadorPreguntas ++] = pregunta;            
        }
        
    }
    public void mostrarPreguntasPorCategoria() {
        System.out.println("\nCategoria " + ++Categoria.idCategoria);
        System.out.println();
//        for (int i = 0; i < this.contadorPreguntas; i++) {
//            //System.out.println("\n: " + (i + 1));
//            System.out.println(this.posiblesPreguntas[i].toString());
//        }
        Random random = new Random();
        System.out.println(this.posiblesPreguntas[random.nextInt(Categoria.MAX_POSIBLES_PREGUNTAS)]);
        
    }   
}
