package com.softtek.modelo;

public class Tablas {
    private int tabla;
    public Tablas(int tabla){
        this.tabla=tabla;
    }

    public String multiplicar(){
        String resultado="";
        for(int i=0;i<=10;i++){
            resultado+=tabla+" * "+i+" = "+tabla*i ;
        }
        return resultado;
    }
}
