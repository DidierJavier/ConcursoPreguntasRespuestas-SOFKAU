/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import com.concurso.sofkau.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DIDIER JAVIER
 */
public class UIMenu {

    public static void verMenu() {
        System.out.println("Bienvenido al concurso de preguntas y respuestas");
        System.out.println("El juego consta de cinco rondas; una pregunta en cada ronda");
        System.out.println("Te puedes retirar cuando quieras y quedas con los puntos acumulados");
        System.out.println("Si continuas y pierdes, tambien pierdes todos los puntos\n");
        System.out.println("Selecciona una opcion valida");
        String respuesta;
        do {
            System.out.println("1. Empezar");
            System.out.println("2. Salir");

            Scanner sc = new Scanner(System.in);
            respuesta = sc.nextLine();

            switch (respuesta) {
                case "1" -> {
                    respuesta = "1";
                    ingresarUsuario();
                }
                case "2" -> {
                    System.out.println("Hasta la proxima ocasion");
                    salir(Usuario.getPuntos());
                    System.exit(0);
                }
                default -> System.out.println("Selecciona una opcion valida");
            }
        } while (!"1".equals(respuesta));
    }

    private static void ingresarUsuario() {
        Usuario usuario = new Usuario("");
        int nombreLengthSinEspacios;
        do {
            System.out.println("Ingresa tu nombre (Como minimo debe contener 7 letras):\n");
            Scanner sc = new Scanner(System.in);
            usuario.setNombre(sc.nextLine());
            nombreLengthSinEspacios = usuario.getName().replace(" ", "").length();
        } while (nombreLengthSinEspacios < 7);
    }

    public static String continuar() {
        String opcionValida = null;
        String respuesta;
        do {
            System.out.println("Digite la letra de la respuesta que considera correcta (A, B, C, D)");
            System.out.println("Digite otra letra si desea retirarse");
            Scanner sc = new Scanner(System.in);
            respuesta = sc.nextLine().toUpperCase();
            switch (respuesta) {
                case "A", "B", "C", "D" -> {
                    opcionValida = respuesta;

                    respuesta = "E";
                }
                default -> {
                    System.out.println("\nHasta la proxima ocasion\n");
                    if (Usuario.getPuntos() == 1) {
                        Usuario.setPuntos(0);
                    }
                    salir(Usuario.getPuntos());
                    System.exit(0);
                }
            }
        } while (!respuesta.equals("E"));
        return opcionValida;

    }

    // public static void verificarEleccion(Categoria categoriaDeLista) {
    public static void verificarEleccion(ArrayList<Categoria> categorias) {
        for (int i = 0; i < 5; i++) {
            Categoria categoriaDeLista = categorias.get(i);
            //System.out.println("Tipo de categoria= " + categoriaDeLista);

            int idPreguntaAleatoria = categoriaDeLista.mostrarPreguntasPorCategoria();
            System.out.println("Este es el id de categoría: " + categoriaDeLista.getIdCategoria());
            System.out.println(categoriaDeLista.getPosiblesPreguntas().get(idPreguntaAleatoria));
            Pregunta guardarPregunta = categoriaDeLista.getPosiblesPreguntas().get(idPreguntaAleatoria);

            String opcionValida = continuar();
            int j = 0;
            switch (opcionValida) {
                case "A" ->
                    j = 0;
                case "B" ->
                    j = 1;
                case "C" ->
                    j = 2;
                case "D" ->
                    j = 3;
            }

            System.out.println("Cierto o falso = " + guardarPregunta.getPosiblesRespuestas().get(j).getAcierto());
            if (guardarPregunta.getPosiblesRespuestas().get(j).getAcierto() && i < 4) {
                System.out.println("Felicidades: Pasas a la siguiente ronda");
                Usuario.setPuntos(Usuario.getPuntos() * 10);
                System.out.println("Puntos acumulados: " + Usuario.getPuntos());
            } else if (guardarPregunta.getPosiblesRespuestas().get(j).getAcierto() && i == 4) {
                System.out.println("Eres todo un campeon");
                Usuario.setPuntos(Usuario.getPuntos() * 10);
                salir(Usuario.getPuntos());
            } else {
                System.out.println("Lo siento. Haz perdido");
                Usuario.setPuntos(0);
                salir(Usuario.getPuntos());
            }

        }
    }

    public static void salir(int puntos) {
        System.out.println("Quedaste con " + puntos + " puntos");
        System.out.println("Fin del juego");
        System.exit(0);
    }

}
