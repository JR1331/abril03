package com.softtek.presentacion;

import com.softtek.modelo.Tablas;

public class PruebaTablas {
    public static void main(String[] args) {
        Tablas t = new Tablas(5);
        System.out.println(t.multiplicar());
    }
}
