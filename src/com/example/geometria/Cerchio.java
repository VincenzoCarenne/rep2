package com.example.geometria;

public class Cerchio extends Ellisse{

	private double raggio = 0;
	
	public Cerchio (double raggio) {
		super (raggio, raggio);
		this.raggio = raggio;
	
	}
	
/*	public double area() {
		double area = Math.PI * raggio * raggio;
		System.out.println("Area="+area);
		return area;
	}
	
	public double perimetro() {
		double perimetro = 2 * Math.PI * raggio;
		System.out.println("Perimetro="+perimetro);
		return perimetro;
	}
*/
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cerchio [raggio=");
		builder.append(raggio);
		builder.append("]");
		return builder.toString();
	}

}