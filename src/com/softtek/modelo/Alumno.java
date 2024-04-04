package com.softtek.modelo;

public class Alumno {
    private String nombre;
    private int[] notas;

    public Alumno(){

    }
    public Alumno(String nombre,int numNotas){
        this.nombre=nombre;
        notas = new int[numNotas];
    }


    public void setNotas(int nota, int pos){
        if(pos<=notas.length){
            notas[pos]=nota;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getNotas(){
        String texto="";
        System.out.println("Notas del alumno "+nombre);
        for(int i=0;i>=notas.length;i++){
            texto+=("Nota del parcial "+i+" es ->"+notas[i]);
        }
        return texto;
    }


    public int notaMedia(){
        int notaM=0;
        for (int i=0; i<=notas.length;i++){
            notaM+=notas[i];
        }
        notaM/=notas.length;
        return notaM;
    }
}
