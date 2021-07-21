package com.example.esercizi;

import java.util.Random;




public class ArraySommaDemo {

	// 1) generare un array di 5 posizioni double
	// 2) inizializzare l'array a valori random double moltiplicati per 1000
	// 3) stampare la somma dei valori contenuti negli elementi
	
	public static void main(String[] args) {
		
		double [] array = new double [5];
		Random random= new Random();
		double somma = 0;
		double sommaDispari= 0;
		
		
		for (int i=0; i<array.length; i++) {
			array[i] = random.nextDouble()*1000;
			System.out.println("array["+i+"]"+ array[i]);
		}
		
		
		for (int i=0; i<array.length; i++) {
			somma= somma + array[i];
		}
		
		for (int i=1; i<array.length; i = i+2) {
			sommaDispari= sommaDispari + array[i];
		}
		
		System.out.println("\nLa somma è: " + somma);
		System.out.println("La somma dei dispari è: " + sommaDispari);
	}
	
	
}