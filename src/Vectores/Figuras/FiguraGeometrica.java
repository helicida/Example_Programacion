package Vectores.Figuras;

import java.awt.*;
import java.util.Comparator;

public abstract class FiguraGeometrica implements Comparable<Object> {
	
	protected int codigo = 0;					// Codigo figura
	protected String nombre = "";				// Nombre dado por el usuario
	protected Color color = Color.white;		// Color

	public FiguraGeometrica(int codigo, String nombre, Color color) {
		
		if (codigo > 0){
			this.codigo = codigo;
		}
			
		this.nombre = nombre;
		this.color = color;
	}

	public FiguraGeometrica(FiguraGeometrica f) {
		this(f.codigo, f.nombre, f.color);
	}

	public FiguraGeometrica() {
		// Constructor vacío
	}
	
	// Métodos

	public void imprimirInfo () {

		System.out.println (" · Cdigo: " + codigo +
				"\n · Nombre: " + nombre +
				"\n · Color: " + color);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (obj instanceof FiguraGeometrica)
			return codigo == ((FiguraGeometrica) obj).codigo;
		return false;
	}

	public String toString() {
		return codigo + " - " + nombre;
	}



	public int compareTo(Object obj) {
		return codigo-((FiguraGeometrica)obj).codigo;
	}

	// Setters

	public void setcodigo(int codigo) {
		
		if (codigo >= 0){
			this.codigo = codigo;
		}
	}

	public void setNombre(String nounombre) {
		nombre = nounombre;
	}

	public void setColor(Color nouColor) {
		color = nouColor;
	}

	// Getters

	public int getCodigo() {
		return codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public Color getColor() {
		return color;
	}

	public static class ComparatorFiguraGeometricaSegonsArea implements Comparator<FiguraGeometrica> {

		public int compare(FiguraGeometrica f1, FiguraGeometrica f2) {

			double result = f1.area() - f2.area();
			if (result < 0)
				return -1; // Cas en que f1.area() < f2.area();
			if (result > 0)
				return 1; // Cas en que f1.area() > f2.area();
			return 0; // Cas en que f1.area() i f2.area() s�n iguals
		}
	}


	abstract public double area();
}