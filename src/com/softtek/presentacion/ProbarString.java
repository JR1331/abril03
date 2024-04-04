package com.softtek.presentacion;

import java.util.Locale;

public class ProbarString {
    public static void main(String[] args) {
        /*
        Crear la cadena de texto: “Nunca mates una mosca sobre la cabeza de un tigre.”
        • Mostrar la cadena toda en mayúsculas
        • Mostrar la cadena en minúsculas
        • Mostrar solo la palabra Nunca
        • Mostrar solo la palabra mosca
        • Mostrar la palabra cabeza
        • Mostrar la posición de la letra primera m
        • Devolver la longitud de la cadena
         */
        String ejemplo="Nunca mates una mosca sobre la cabeza de un tigre";
        System.out.println(ejemplo.toUpperCase());
        System.out.println(ejemplo.toLowerCase());
        //System.out.println(ejemplo.substring(0,5));
        //System.out.println(ejemplo.substring(16,21));
        //System.out.println(ejemplo.substring(26,32));
        String[] palabras = ejemplo.split(" ");
        for (int i =0; i<= palabras.length;i++){
            if(palabras[i].contains("Nunca")){
                System.out.println(palabras[i]);
            }
            if(palabras[i].contains("mosca")){
                System.out.println(palabras[i]);
            }
            if(palabras[i].contains("cabeza")){
                System.out.println(palabras[i]);
            }
        }
        String m ="m";
        System.out.println(ejemplo.indexOf(m));
        System.out.println(ejemplo.length());
    }
}
