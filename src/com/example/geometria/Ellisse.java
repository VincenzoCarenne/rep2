package com.example.geometria;

public class Ellisse extends FormaGeometrica{

	double semiasseA = 0;
	double semiasseB = 0;
	
	public Ellisse (double semiasseA, double semiasseB) {
		this.semiasseA = semiasseA;
		this.semiasseB = semiasseB;
		
	}
	
	public double area() {
		double area = Math.PI * semiasseA * semiasseB;
		System.out.println("Area="+area);
		return area;
	}
	
	public double perimetro() {
		double perimetro = 2 * Math.PI * Math.sqrt((semiasseA * semiasseA + semiasseB * semiasseB) / 2);
		System.out.println("Perimetro="+perimetro);
		return perimetro;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ellisse [semiasseA=");
		builder.append(semiasseA);
		builder.append(", semiasseB=");
		builder.append(semiasseB);
		builder.append("]");
		return builder.toString();
	}

	


}
