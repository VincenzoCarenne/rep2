package com.example.geometria;

public class Rettangolo extends FormaGeometrica{

	private double base = 0;
	private double altezza = 0;
	
	/*
	 * Costruttore per la classe rettangolo
	 * @param b rappresenta la base del rettangolo
	 * @param a rappresenta l'altezza del rettangolo
	 */
	public Rettangolo (double base, double altezza) {
		this.base = base;
	    this.altezza = altezza;
	}
	
	public double area() {
		double area = base * altezza;
		System.out.println("Area="+area);
		return area;
	}
	
	public double perimetro() {
		double perimetro = base * 2 + altezza *2;
		System.out.println( "Perimetro="+perimetro );
		return perimetro;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rettangolo [base=");
		builder.append(base);
		builder.append(", altezza=");
		builder.append(altezza);
		builder.append("]");
		return builder.toString();
	}

}