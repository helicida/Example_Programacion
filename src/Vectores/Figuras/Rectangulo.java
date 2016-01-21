package Vectores.Figuras;

import java.awt.*;

/**
 * Created by 46465442z on 20/01/2016.
 */
public class Rectangulo extends FiguraGeometrica {

   private double base = 0;
   private double altura = 0;

   // Los tres constructores para inicializar el objeto

   // Por parametros
   public Rectangulo (int codi, String nom, Color color, double base, double altura) {

      super (codi, nom, color);

      if (base > 0){
         this.base = base;
      }
      if (altura > 0){
         this.altura = altura;
      }
   }

   // Por referencia a otro objeto
   public Rectangulo (Rectangulo r) {
      this(r.codigo, r.nombre, r.color, r.base, r.altura);
   }

   public Rectangulo() {
      // constructor vacío
   }

   // Métodos
   public double perimetro () {
      return (base + altura) * 2;
   }

   public double area () {
      return base * altura;
   }

   public void imprimirInfo () {

      System.out.println("Rectangulo \n----------------------------------");
      super.imprimirInfo();

      System.out.println (" · Base: " + base +
              "\n · Altura: " + altura +
              "\n · Perímetro: " + perimetro() +
              "\n · Área: " + area());
   }

   public String toString() {
      return "Rectangulo " + super.toString();
   }

   // Setters

   public void setBase (double base) {
      if (base >= 0){
         this.base = base;
      }
   }

   public void setAltura (float altura) {
      if (altura >= 0){
         this.altura = altura;
      }
   }

   // Getters

   public double getBase() {
      return base;
   }
   
   public double getAltura() {
      return altura;
   }
}