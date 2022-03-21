/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.concurso.sofkau;

import java.util.*;

/**
 *
 * @author DIDIER JAVIER
 */
public class Categoria {
//Atributos de la clase categoria
    ArrayList<Pregunta> posiblesPreguntas;
    private static final int MAX_POSIBLES_PREGUNTAS = 5;
    private int contadorPreguntas;
    private int idCategoria;
    private static int contadorCategorias;

    public Categoria() {
        this.posiblesPreguntas = new ArrayList<>();
        this.idCategoria = ++Categoria.contadorCategorias;
    }
//Métodos get y set
    public static int getContadorCategorias() {
        return contadorCategorias;
    }

    public static void setContadorCategorias(int contadorCategorias) {
        Categoria.contadorCategorias = contadorCategorias;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public ArrayList<Pregunta> getPosiblesPreguntas() {
        return posiblesPreguntas;
    }

    public int getContadorPreguntas() {
        return contadorPreguntas;
    }
//Método para agregar las preguntas al ArrayList posibles preguntas, que es un atributo de la clase
    public void agregarPregunta(Pregunta pregunta) {
        if (this.contadorPreguntas >= Categoria.MAX_POSIBLES_PREGUNTAS) {
            System.out.println("");
        } else {
            this.contadorPreguntas++;
            this.posiblesPreguntas.add(pregunta);
        }

    }
//Método para mostrar las preguntas de acuerdo a la categoría y de forma aleatoria
    public int mostrarPreguntasPorCategoria() {
        System.out.println();
        Random random = new Random();
        int aleatorio = random.nextInt(Categoria.MAX_POSIBLES_PREGUNTAS);
        return aleatorio;
    }
}
