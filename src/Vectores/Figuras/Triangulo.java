package Vectores.Figuras;

import java.awt.*;

/**
 * Created by 46465442z on 20/01/2016.
 */
public class Triangulo extends FiguraGeometrica {

   private double base = 0;      // Base
   private double altura = 0;    // Altura

   // Los tres constructores para inicializar el objeto

   // Por parametros
   public Triangulo (int codi, String nom, Color color, double base, double altura) {

      super(codi, nom, color);

      if (base > 0){
         this.base = base;
      }
      if (altura > 0){
         this.altura = altura;
      }
   }

   // Por referencia a otro objeto
   public Triangulo (Triangulo r) {
      this(r.codigo, r.nombre, r.color, r.base, r.altura);
   }

   public Triangulo() {
      // Constructor vacío
   }

   // Metodos

   public double area () {
      return base*altura/2;
   }

   public void imprimirInfo () {

      System.out.println("Triangulo \n----------------------------------");
      super.imprimirInfo();

      System.out.println (" · Base: " + base +
              "\n · Altura: " + altura +
              "\n · Área: " + area());
   }

   public String toString() {
      return "Triangulo " + super.toString();
   }

   // Setters

   public void setBase (double base) {
      if ( base >= 0){
         this.base = base;
      }
   }

   public void setAltura (float novaAltura) {
      if (novaAltura>=0) altura = novaAltura;
   }

   // Getters

   public double getBase() {
      return base;
   }

   public double getAltura() {
      return altura;
   }

}