package com.softtek.presentacion;
import com.softtek.modelo.Areas;
public class PruebaArea {
    public static void main(String[] args) {
        int radio=1;
        Areas a = new Areas();
        System.out.println(a.areaCirculo(radio));
        int base =4;;
        int altura =6;
        System.out.println(a.areaRectangulo(base,altura));
    }
}
