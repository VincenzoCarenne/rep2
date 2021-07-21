package com.example.esercizi;

public class Calcolatore {
    public static void main(String[] args) {
        Calcolatore calcolatore =new Calcolatore();
        System.out.println(calcolatore.somma(15,10));
        System.out.println(calcolatore.sottrazione(40,25));
    }
    public Integer somma(Integer a, Integer b){
        Integer somma= a+b;
        return somma;
    }
    public Integer sottrazione(Integer a, Integer b){
        Integer sottrazione= a-b;
        return sottrazione;
    }
}