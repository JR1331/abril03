package com.softtek.presentacion;

public class TiposPrimitivos {
    public static void main(String[] args) {
        System.out.println("Tipos primitivos");
        byte numPequeño;
        short numCorto;
        int num;
        long numLargo;//Hay que poner la l al final del numero para que lo reconozca
        float numDecimal;//Hay que poner la f para que lo reconozca
        double numMuyGrande;
        boolean verdadero;
        char caracterAscii;//Es de tipo numerico que se transforma con la tabla ascii


        int lado = 6;
        int area = lado*lado;
        System.out.println(area);

        double radio=3;
        double areaT= Math.PI * radio*radio;
        System.out.println(areaT);

        int base = 4;
        int altura =3;
        int perimetro = 2*base + 2*altura;
        System.out.println(perimetro);
    }
}
