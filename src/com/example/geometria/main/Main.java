package com.example.geometria.main;

import com.example.geometria.Cerchio;
import com.example.geometria.Ellisse;
import com.example.geometria.Quadrato;
import com.example.geometria.Rettangolo;

public class Main {

	public static void main(String[] args) {
		
		double areaTotale = 0;
		double perimetroTotale = 0;
		
		System.out.println("Calcolo di area e perimetro del rettangolo: ");
		Rettangolo r = new Rettangolo(20, 50);
		areaTotale = areaTotale + r.area();
		perimetroTotale = perimetroTotale + r.perimetro();
		
		System.out.println("");
		System.out.println("Calcolo di area e perimetro del rettangolo 1: ");
		Rettangolo r1 = new Rettangolo(10, 20);
		areaTotale = areaTotale + r1.area();
		perimetroTotale = perimetroTotale + r1.perimetro();
		
		System.out.println("");
		System.out.println("Calcolo di area e perimetro del cerchio: ");
		Cerchio c = new Cerchio(5);
		areaTotale = areaTotale + c.area();
		perimetroTotale = perimetroTotale + c.perimetro();
		
		System.out.println("");
		System.out.println("Calcolo di area e perimetro del quadrato: ");
		Quadrato q = new Quadrato(14);
		areaTotale = areaTotale + q.area();
		perimetroTotale = perimetroTotale + q.perimetro();
		
		System.out.println("");
		System.out.println("Calcolo di area e perimetro dell'ellisse: ");
		Ellisse e = new Ellisse(12, 8);
		areaTotale = areaTotale + e.area();
		perimetroTotale = perimetroTotale + e.perimetro();
		
		System.out.println("");
		System.out.println("Area totale: " + areaTotale);
		System.out.println("Perimetro totale: " + perimetroTotale );
		
		System.out.println("\nQuadrato: " + q );
		System.out.println("Rettangolo: " + r );
		System.out.println("Rettangolo 1: " + r1 );
		System.out.println("Cerchio: " + c );
		System.out.println("Ellisse: " + e );
	}

}