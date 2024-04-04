package com.softtek.modelo;

import java.util.Random;

public class Dado {
    private int numeroAleatorio;

    public Dado(){
    }

    public String lanzar(){
        numeroAleatorio=(int)(Math.random()*(6-1)+1);
        String texto="";
        switch (numeroAleatorio){
            case 1: texto=". . . \n. * . \n. . . ";
                break;
            case 2: texto="* . . \n. . . \n. . * ";
                break;
            case 3: texto="* . . \n. * . \n. . * ";
                break;
            case 4: texto="* . * \n. . . \n* . * ";
                break;
            case 5: texto="* . * \n. * . \n* . * ";
                break;
            case 6: texto="* . * \n* . * \n* . * ";
                break;
            default:
                texto="No ha salido un numero entre 1 y 6";
                break;
        }
        return texto;
    }
}
