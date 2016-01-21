package Vectores.Figuras;

import java.awt.*;

/**
 * Created by 46465442z on 20/01/2016.
 */
public class Circulo extends FiguraGeometrica {
   
   private double radio = 0;   // Radio

   // Los tres constructories

   // Por parametros
   public Circulo (int codi, String nom, Color color, double radi) {
      super (codi, nom, color);

      if (radi > 0){
         radi = radi;
      }
   }

   // Por referencia a otro objeto
   public Circulo (Circulo c) {
      this (c.codigo, c.nombre, c.color, c.radio);
   }
   
   public Circulo () {
      // Constructor vacío
   }

   // Metodos
   
   public double perimetro () {
      return 2 * Math.PI * radio;
   }

   public double area () {
      return Math.PI * radio * radio;
   }

   public void imprimirInfo () {

      System.out.println("Circulo \n----------------------------------");
      super.imprimirInfo();

      System.out.println (" · Radio: " + radio +
              "\n · Perimetro: " + perimetro() +
              "\n · Área: " + area());
   }
   
   public String toString() {
      return "Circulo " + super.toString();
   }

   // Setters

   public void setRadio (double radio) {
      if (radio >= 0) this.radio = radio;
   }

   // Getters
   public double getRadi () {
      return radio;
   }
}