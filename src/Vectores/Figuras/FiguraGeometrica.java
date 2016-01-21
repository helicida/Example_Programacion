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

	public boolean equals (Object figura) {

		if (this == figura){
			return true;
		}
		if (figura == null){
			return false;
		}
		if (figura instanceof FiguraGeometrica){
			return codigo == ((FiguraGeometrica)figura).codigo;
		}
		return false;
	}

	public String toString() {
		return codigo + " - " + nombre;
	}



	public int compareTo(Object obj) {
		return codigo-((FiguraGeometrica)obj).codigo;
	}

	// Setters

	public void setCodigo(int codigo) {
		
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

	abstract public double area();
}