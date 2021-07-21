package com.example.tombola;

public class TombolaMain {

	public static void main(String[] args) {
		Tombola tombola = new Tombola();
		for(int i=0; i<90; i++) {
			if(i>0 && i%20 == 0 ) {
				System.out.println("Tabellone:\n"+tombola.tabellone());
			}
			System.out.println("Estratto "+tombola.estrai());
		}
		System.out.println("Tabellone:\n"+tombola.tabellone());
	}

}