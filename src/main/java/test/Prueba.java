/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import com.concurso.softku.*;

/**
 *
 * @author DIDIER JAVIER
 */
public class Prueba {
    public static void main(String[] args) {
//    Respuesta respuestaA_Ronda1 = new Respuesta("El pollo", 'A' , false);
//    Respuesta respuestaB_Ronda1 = new Respuesta("El gallo", 'B' , false);
//    Respuesta respuestaC_Ronda1 = new Respuesta("La gallina", 'A' , true);
//    Respuesta respuestaD_Ronda1 = new Respuesta("La gallineta", 'B' , false);
//    Respuesta respuestaA_Pregunta2_Ronda1 = new Respuesta("Uno", 'A' , false);
//    Respuesta respuestaB_Pregunta2_Ronda1 = new Respuesta("Todos", 'B' , true);
//    Respuesta respuestaC_Pregunta2_Ronda1 = new Respuesta("Ninguno", 'A' , false);
//    Respuesta respuestaD_Pregunta2_Ronda1 = new Respuesta("Siete", 'B' , false);
//    Pregunta pregunta2_Ronda1 = new Pregunta("¿Cual es la mama de los pollitos?",respuestaA_Pregunta2_Ronda1);
//Respuestas ronda 1-------------------------------------------------------------
    Respuesta respuestaA_Pregunta1_Ronda1 = new Respuesta("El pollo", 'A' , false);
    Respuesta respuestaB_Pregunta1_Ronda1 = new Respuesta("El gallo", 'B' , false);
    Respuesta respuestaC_Pregunta1_Ronda1 = new Respuesta("La gallina", 'C' , true);
    Respuesta respuestaD_Pregunta1_Ronda1 = new Respuesta("La gallineta", 'D' , false);
    Pregunta pregunta1_ronda1 = new Pregunta("¿Cual es la mama de los pollitos");
    pregunta1_ronda1.agregarRespuesta(respuestaA_Pregunta1_Ronda1);
    pregunta1_ronda1.agregarRespuesta(respuestaB_Pregunta1_Ronda1);
    pregunta1_ronda1.agregarRespuesta(respuestaC_Pregunta1_Ronda1);
    pregunta1_ronda1.agregarRespuesta(respuestaD_Pregunta1_Ronda1);
    
    Respuesta respuestaA_Pregunta2_Ronda1 = new Respuesta("Uno", 'A' , false);
    Respuesta respuestaB_Pregunta2_Ronda1 = new Respuesta("Todos", 'B' , true);
    Respuesta respuestaC_Pregunta2_Ronda1 = new Respuesta("Ninguno", 'C' , false);
    Respuesta respuestaD_Pregunta2_Ronda1 = new Respuesta("Siete", 'D' , false);
    
    Respuesta respuestaA_Pregunta3_Ronda1 = new Respuesta("El agua", 'A' , false);
    Respuesta respuestaB_Pregunta3_Ronda1 = new Respuesta("La lluvia", 'B' , false);
    Respuesta respuestaC_Pregunta3_Ronda1 = new Respuesta("La luna", 'C' , false);
    Respuesta respuestaD_Pregunta3_Ronda1 = new Respuesta("El sol", 'D' , true);
    
    Respuesta respuestaA_Pregunta4_Ronda1 = new Respuesta("El cinco", 'A' , false);
    Respuesta respuestaB_Pregunta4_Ronda1 = new Respuesta("El ocho", 'B' , true);
    Respuesta respuestaC_Pregunta4_Ronda1 = new Respuesta("El dos", 'C' , false);
    Respuesta respuestaD_Pregunta4_Ronda1 = new Respuesta("El tres", 'D' , false);
    
    Respuesta respuestaA_Pregunta5_Ronda1 = new Respuesta("De vapor", 'A' , false);
    Respuesta respuestaB_Pregunta5_Ronda1 = new Respuesta("De agua", 'B' , false);
    Respuesta respuestaC_Pregunta5_Ronda1 = new Respuesta("De vidrio", 'C' , false);
    Respuesta respuestaD_Pregunta5_Ronda1 = new Respuesta("De aire", 'D' , true);
    
    //Respuestas ronda 2--------------------------------------------------------------
    Respuesta respuestaA_Pregunta1_Ronda2 = new Respuesta("86.400", 'A' , true);
    Respuesta respuestaB_Pregunta1_Ronda2 = new Respuesta("84.600", 'B' , false);
    Respuesta respuestaC_Pregunta1_Ronda2 = new Respuesta("48.600", 'C' , false);
    Respuesta respuestaD_Pregunta1_Ronda2 = new Respuesta("46.800", 'D' , false);
    
    Respuesta respuestaA_Pregunta2_Ronda2 = new Respuesta("El Amazonas", 'A' , true);
    Respuesta respuestaB_Pregunta2_Ronda2 = new Respuesta("El Nilo", 'B' , false);
    Respuesta respuestaC_Pregunta2_Ronda2 = new Respuesta("El Misisipi", 'C' , false);
    Respuesta respuestaD_Pregunta2_Ronda2 = new Respuesta("El Tigris", 'D' , false);
    
    Respuesta respuestaA_Pregunta3_Ronda2 = new Respuesta("La tierra", 'A' , false);
    Respuesta respuestaB_Pregunta3_Ronda2 = new Respuesta("Venus", 'B' , false);
    Respuesta respuestaC_Pregunta3_Ronda2 = new Respuesta("Marte", 'C' , false);
    Respuesta respuestaD_Pregunta3_Ronda2 = new Respuesta("Mercurio", 'D' , true);
    
    Respuesta respuestaA_Pregunta4_Ronda2 = new Respuesta("Cuadrilatero", 'A' , false);
    Respuesta respuestaB_Pregunta4_Ronda2 = new Respuesta("Pentagono", 'B' , false);
    Respuesta respuestaC_Pregunta4_Ronda2 = new Respuesta("Triangulo", 'C' , true);
    Respuesta respuestaD_Pregunta4_Ronda2 = new Respuesta("Hexagono", 'D' , false);
    
    Respuesta respuestaA_Pregunta5_Ronda2 = new Respuesta("Diptongo", 'A' , false);
    Respuesta respuestaB_Pregunta5_Ronda2 = new Respuesta("Histeresis", 'B' , false);
    Respuesta respuestaC_Pregunta5_Ronda2 = new Respuesta("Triptongo", 'C' , false);
    Respuesta respuestaD_Pregunta5_Ronda2 = new Respuesta("Onomatopeya", 'D' , true);
    
    //Respuestas ronda 3---------------------------------------------------------------
    Respuesta respuestaA_Pregunta1_Ronda3 = new Respuesta("Rumania", 'A' , true);
    Respuesta respuestaB_Pregunta1_Ronda3 = new Respuesta("Transilvania", 'B' , false);
    Respuesta respuestaC_Pregunta1_Ronda3 = new Respuesta("Rusia", 'C' , false);
    Respuesta respuestaD_Pregunta1_Ronda3 = new Respuesta("Noruega", 'D' , false);
    
    Respuesta respuestaA_Pregunta2_Ronda3 = new Respuesta("1999", 'A' , false);
    Respuesta respuestaB_Pregunta2_Ronda3 = new Respuesta("1809", 'B' , false);
    Respuesta respuestaC_Pregunta2_Ronda3 = new Respuesta("1989", 'C' , true);
    Respuesta respuestaD_Pregunta2_Ronda3 = new Respuesta("1986", 'D' , false);
    
    Respuesta respuestaA_Pregunta3_Ronda3 = new Respuesta("Carl Lewis", 'A' , false);
    Respuesta respuestaB_Pregunta3_Ronda3 = new Respuesta("Usain Bolt", 'B' , false);
    Respuesta respuestaC_Pregunta3_Ronda3 = new Respuesta("Mark Spitz", 'C' , false);
    Respuesta respuestaD_Pregunta3_Ronda3 = new Respuesta("Michael Phelps", 'D' , true);
    
    Respuesta respuestaA_Pregunta4_Ronda3 = new Respuesta("10.800", 'A' , false);
    Respuesta respuestaB_Pregunta4_Ronda3 = new Respuesta("13.800", 'B' , true);
    Respuesta respuestaC_Pregunta4_Ronda3 = new Respuesta("12.800", 'C' , false);
    Respuesta respuestaD_Pregunta4_Ronda3 = new Respuesta("14.800", 'D' , false);
    
    Respuesta respuestaA_Pregunta5_Ronda3 = new Respuesta("El Gallego", 'A' , false);
    Respuesta respuestaB_Pregunta5_Ronda3 = new Respuesta("El Arameo", 'B' , false);
    Respuesta respuestaC_Pregunta5_Ronda3 = new Respuesta("El Vasco", 'C' , true);
    Respuesta respuestaD_Pregunta5_Ronda3 = new Respuesta("El Castellano", 'D' , false);
    
    //Respuesta ronda 4-----------------------------------------------------------------------
    Respuesta respuestaA_Pregunta1_Ronda4 = new Respuesta("Dinamarca", 'A' , true);
    Respuesta respuestaB_Pregunta1_Ronda4 = new Respuesta("Islandia", 'B' , false);
    Respuesta respuestaC_Pregunta1_Ronda4 = new Respuesta("Islas Feroe", 'C' , false);
    Respuesta respuestaD_Pregunta1_Ronda4 = new Respuesta("Noruega", 'D' , false);
    
    Respuesta respuestaA_Pregunta2_Ronda4 = new Respuesta("Londres", 'A' , false);
    Respuesta respuestaB_Pregunta2_Ronda4 = new Respuesta("Tokio", 'B' , false);
    Respuesta respuestaC_Pregunta2_Ronda4 = new Respuesta("Barcelona", 'C' , true);
    Respuesta respuestaD_Pregunta2_Ronda4 = new Respuesta("Beijing", 'D' , false);
    
    Respuesta respuestaA_Pregunta3_Ronda4 = new Respuesta("Dos", 'A' , false);
    Respuesta respuestaB_Pregunta3_Ronda4 = new Respuesta("Tres", 'B' , true);
    Respuesta respuestaC_Pregunta3_Ronda4 = new Respuesta("Uno", 'C' , false);
    Respuesta respuestaD_Pregunta3_Ronda4 = new Respuesta("Cuatro", 'D' , false);
    
    Respuesta respuestaA_Pregunta4_Ronda4 = new Respuesta("Ramses IV", 'A' , false);
    Respuesta respuestaB_Pregunta4_Ronda4 = new Respuesta("Ramses V", 'B' , false);
    Respuesta respuestaC_Pregunta4_Ronda4 = new Respuesta("Ramses III", 'C' , true);
    Respuesta respuestaD_Pregunta4_Ronda4 = new Respuesta("Ramses II", 'D' , false);
    
    Respuesta respuestaA_Pregunta5_Ronda4 = new Respuesta("El higado", 'A' , false);
    Respuesta respuestaB_Pregunta5_Ronda4 = new Respuesta("El Pancreas", 'B' , true);
    Respuesta respuestaC_Pregunta5_Ronda4 = new Respuesta("Los rinones", 'C' , false);
    Respuesta respuestaD_Pregunta5_Ronda4 = new Respuesta("El vazo", 'D' , false);
    
    //Respuesta ronda 5-----------------------------------------------------------------------
    Respuesta respuestaA_Pregunta1_Ronda5 = new Respuesta("Sirio", 'A' , false);
    Respuesta respuestaB_Pregunta1_Ronda5 = new Respuesta("Procyon", 'B' , false);
    Respuesta respuestaC_Pregunta1_Ronda5 = new Respuesta("Epsilon Indi", 'C' , false);
    Respuesta respuestaD_Pregunta1_Ronda5 = new Respuesta("Alfa Centauri", 'D' , true);
    
    Respuesta respuestaA_Pregunta2_Ronda5 = new Respuesta("Etna", 'A' , false);
    Respuesta respuestaB_Pregunta2_Ronda5 = new Respuesta("Vesubio", 'B' , true);
    Respuesta respuestaC_Pregunta2_Ronda5 = new Respuesta("Sicilia", 'C' , false);
    Respuesta respuestaD_Pregunta2_Ronda5 = new Respuesta("Santorini", 'D' , false);
    
    Respuesta respuestaA_Pregunta3_Ronda5 = new Respuesta("Cheliabinsk", 'A' , false);
    Respuesta respuestaB_Pregunta3_Ronda5 = new Respuesta("Perm", 'B' , false);
    Respuesta respuestaC_Pregunta3_Ronda5 = new Respuesta("Voronezh", 'C' , false);
    Respuesta respuestaD_Pregunta3_Ronda5 = new Respuesta("Pripiat", 'D' , true);
    
    Respuesta respuestaA_Pregunta4_Ronda5 = new Respuesta("Indonesia", 'A' , true);
    Respuesta respuestaB_Pregunta4_Ronda5 = new Respuesta("India", 'B' , false);
    Respuesta respuestaC_Pregunta4_Ronda5 = new Respuesta("Pakistan", 'C' , false);
    Respuesta respuestaD_Pregunta4_Ronda5 = new Respuesta("Bangladesh", 'D' , false);
    
    Respuesta respuestaA_Pregunta5_Ronda5 = new Respuesta("Sur Africa", 'A' , false);
    Respuesta respuestaB_Pregunta5_Ronda5 = new Respuesta("Mongolia", 'B' , true);
    Respuesta respuestaC_Pregunta5_Ronda5 = new Respuesta("China", 'C' , false);
    Respuesta respuestaD_Pregunta5_Ronda5 = new Respuesta("Australia", 'D' , false);

    
      //System.out.println(pregunta1_orden1);
    pregunta1_ronda1.mostrarPregunta();
    }
}
