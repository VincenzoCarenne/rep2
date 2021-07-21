package com.example.geometria;

public class Quadrato extends Rettangolo{

	private double lato = 0;
	
	/*
	 * Costruttore per la classe quadrato
	 * @param l rappresenta il lato del quadrato
	 */
	public Quadrato (double lato) {
		super (lato, lato);
		this.lato = lato;
	}
	
/*
	   public double area() {
	 
		double area = lato * lato;
		System.out.println("Area="+area);
		return area;
	}
	
	public double perimetro() {
		double perimetro = lato * 4;
		System.out.println( "Perimetro="+perimetro );
		return perimetro;
	}
*/
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Quadrato [lato=");
		builder.append(lato);
		builder.append("]");
		return builder.toString();
	}
	
}
