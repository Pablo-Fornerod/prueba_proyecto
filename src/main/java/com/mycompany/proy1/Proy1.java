/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proy1;

import java.util.Scanner;

/**
 *
 * @author stere
 */
public class Proy1 {
    
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int valor;
        System.out.println("Ingrese un entero:");
        valor=entrada.nextInt();
        System.out.println("El entero ingresado:"+valor);
        
        Scanner entradacad=new Scanner(System.in);
        String cadena;
        System.out.println("Ingrese una cadena:");
        cadena=entradacad.nextLine();   //next para una palabra
                                        //nextLine para toda la linea
        System.out.println("Su cadena es:"+cadena);
        
        Scanner entradachar=new Scanner(System.in);
        char caracter;
        System.out.println("Ingrese un caracter:");
        caracter=entradachar.next().charAt(0);
        System.out.println("Su caracter es:"+caracter);
    }
}
