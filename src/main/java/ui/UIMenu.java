/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import com.concurso.softku.Usuario;
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
        int respuesta = 0;
        do {
            System.out.println("1. Empezar");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            respuesta = Integer.parseInt(sc.nextLine());

            switch (respuesta) {
                case 1:
                    respuesta = 0;
                    ingresarUsuario();
                    break;
                case 0:
                    System.out.println("Hasta la proxima ocasion");
                    break;
                default:
                    System.out.println("Selecciona una opcion valida");
            }
        } while (respuesta != 0);
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

    public static void continuar() {
        String respuesta = "E";
        do {
            System.out.println("Digite la letra de la respuesta que considera correcta (A, B, C, D)");
            System.out.println("Digite otra letra si desea retirarse");
            Scanner sc = new Scanner(System.in);
            respuesta = sc.nextLine().toUpperCase();

            switch (respuesta) {
                case "A": 
                case "B":
                case "C": 
                case "D":
                    respuesta = "E";
                    //verMenu();
                    break;
                default:
                    respuesta = "E";
                    System.out.println("\nHasta la proxima ocasion\n");
                    salir();
                    break;
            }
        } while (respuesta != "E");
    }
    
    public static void salir() {
        System.out.println("Fin del juego");
    }
}
