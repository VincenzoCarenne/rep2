package com.example.esercizi;

public class Swapper {

	public static void main(String[] args) {
		int x = 100;
		int y = 200;
		int c = 0;
		System.out.println("Valore delle variabili: ");
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		c = x;
		x = y;
		y = c;
		System.out.println("\nValore delle variabili dopo lo swap: ");
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}
