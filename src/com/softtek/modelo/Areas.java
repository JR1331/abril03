package com.softtek.modelo;

public class Areas {
    private double area;

    public Areas(){

    }
    public double areaCirculo(int radio){
        return  (Math.PI * Math.pow(radio,2));

    }

    public double areaRectangulo(int base, int altura){
        return base*altura;
    }
}
