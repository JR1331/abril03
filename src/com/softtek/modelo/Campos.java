package com.softtek.modelo;

public class Campos {
    int valor;

    public Campos(int x){
        this.valor = x;
    }

    public int muestra(){
        return valor;
    }

    public void incrementa(){
        valor++;
    }
}
