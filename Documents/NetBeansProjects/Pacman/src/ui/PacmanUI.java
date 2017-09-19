/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.Scanner;

/**
 *
 * @author Victor Carrascal
 */
public class PacmanUI {
    
    public static void Bienvenida(){
        System.out.println("---------------------------------------------------------");
        System.out.println("           Bienvenidos al juego PAC-MAN");
        System.out.println("---------------------------------------------------------");
    }
    public static void menu(){
        System.out.println("---------------------------------------------------------");
        System.out.println("                Emprezar nueva partida:");
        System.out.println("---------------------------------------------------------");
        System.out.println("1. Si");
        System.out.println("2. No");
        System.out.println("3. Salir");
        System.out.println("----------------------------------------------------------");
    } 
    public static void opcionInvalida(){
        System.out.println("");
        System.out.println("----------------------------------------------------------");
        System.out.println("Opcion invalida, por favor intenta de nuevo:");
        System.out.println("----------------------------------------------------------");
        System.out.println("");
    }
     public static void farewell() {
        System.out.println("");
        System.out.println("----------------------------------------------------------");
        System.out.println("--------------Estas saliendo del juego PAC-MAN -----------");
        System.out.println("----------Gracias por tu visita, hasta luego. ------------");
        System.out.println("----------------------------------------------------------");
        System.out.println("");
     }
     public static int leerOpciones(){
         Scanner entrada = new Scanner (System.in);
         return entrada.nextInt();
         
     }
}