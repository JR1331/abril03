package com.softtek.presentacion;

import com.softtek.modelo.Campos;

public class pruebaCampos {
    public static void main(String[] args) {
        int valEjemplo= 7;
        Campos c = new Campos(valEjemplo);
        System.out.println(c.muestra());
        c.incrementa();
        System.out.println(c.muestra());
    }
}
