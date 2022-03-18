/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import com.concurso.softku.Respuesta;

/**
 *
 * @author DIDIER JAVIER
 */
public class Prueba {
    public static void main(String[] args) {
    Respuesta respuestaA_Ronda1 = new Respuesta("El pollo", 'A' , false);
    Respuesta respuestaB_Ronda1 = new Respuesta("El gallo", 'B' , false);
    Respuesta respuestaC_Ronda1 = new Respuesta("La gallina", 'A' , true);
    Respuesta respuestaD_Ronda1 = new Respuesta("La gallineta", 'B' , false);
    
        System.out.println(respuestaC_Ronda1);
    }
}
