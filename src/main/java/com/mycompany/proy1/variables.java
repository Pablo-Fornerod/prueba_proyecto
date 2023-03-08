/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proy1;

/**
 *
 * @author stere
 */
public class variables {
    public static void main(String[] args) {
        Byte mordida; //byte
        mordida=126;
        System.out.println("mordida="+mordida);
        
        Short corto; //short
        corto=32000;
        System.out.println("corto="+corto);
        
        Integer entero; //int 
        entero=32001;
        System.out.println("entero="+entero);
        
        Long largo;     //long
        largo=32002l;   //casting con l (para convertirlo en long)
        System.out.println("largo="+largo);
        
        final float pi=3.1415f;     //usando "final" se convierte en constante
        float res=pi*2;
        System.out.println("pi*2="+res);
        
        Float flotante;     //float
        flotante=32000.55f;
        System.out.println("flotante="+flotante);
        
        Double doble;       //double
        doble=32004.55;
        System.out.println("doble="+doble);
        
        char caracter;
        caracter='a';
        System.out.println("caracter="+caracter);
        
        Boolean boleano1;       //boolean
        boleano1=true;
        System.out.println("boleanoTrue="+boleano1);
        
        boolean boleano2;
        boleano2=false;
        System.out.println("boleanoFalse="+boleano2);
        
        String cadena;
        cadena="Me cago en la cona";
        System.out.println("cadena="+cadena);
    }
    
}
