package Vectores;

import Vectores.Figuras.Circulo;
import Vectores.Figuras.Rectangulo;
import Vectores.Figuras.Triangulo;

import java.awt.Color;
import java.util.Scanner;

/**
 * Created by 46465442z on 20/01/2016.
 */
public class ProvaGrupOrdenatFiguraGeometricaViaVector {

    public static void main(String[] args) {

        // Creamos un nuevo grupo de figuras
        GrupOrdenatFiguraGeometricaViaVector grupoFiguras= new GrupOrdenatFiguraGeometricaViaVector(50);

        Scanner teclat = new Scanner(System.in);

        // Añadimos algunos objetos
        Triangulo triangulo1 = new Triangulo(1, "triangulo1", Color.red, 8.6, 2.2);
        Circulo circulo1 = new Circulo(2,"circulo1", Color.blue, 3.2);
        Rectangulo rectangulo1 = new Rectangulo(3,"rectangulo1", Color.black, 4.3, 3.2);
        Circulo circulo2 = new Circulo(4,"circulo2", Color.yellow, 5.2);
        Rectangulo rectangulo2 = new Rectangulo(5,"rectangulo2", Color.orange, 5.1, 4.2);
        Triangulo Triangulo2 = new Triangulo(6,"triangulo2", Color.green, 8.6, 2.2);
        Triangulo Triangulo3 = new Triangulo(7,"triangulo3", Color.gray, 3.6, 4.2);
        Circulo circulo3 = new Circulo(8,"circulo3", Color.cyan, 3.2);
        Triangulo Triangulo4 = new Triangulo(9,"triangulo4", Color.lightGray, 8.6, 2.2);
        Rectangulo rectangulo3 = new Rectangulo(10,"rectangulo3", Color.white, 5.1, 4.2);

        int opcio = 1;

        while (opcio != 0){

            System.out.println("\n");
            System.out.println("MENU:");
            System.out.println("1 - Añadir objetos al vector");
            System.out.println("2 - Eliminar objeto del vector");
            System.out.println("3 - Obtener informacion de algun objeto del vector");
            System.out.println("4 - Sortir del programa");
            System.out.println(" ");

            opcio = teclat.nextInt();

            switch (opcio){

                case 0:
                    System.out.println("Saliendo del programa...");
                    opcio = 0;
                break;

                case 1:
                    grupoFiguras.anyadir(triangulo1);
                    grupoFiguras.anyadir(circulo1);
                    grupoFiguras.anyadir(rectangulo1);
                    grupoFiguras.anyadir(circulo2);
                    grupoFiguras.anyadir(rectangulo2);
                    grupoFiguras.anyadir(Triangulo2);
                    grupoFiguras.anyadir(Triangulo3);
                    grupoFiguras.anyadir(circulo3);
                    grupoFiguras.anyadir(Triangulo4);
                    grupoFiguras.anyadir(rectangulo3);
                    break;

                case 2:
                    System.out.println("\nIntroduce la id de la figura a eliminar:");
                        int idEliminar = teclat.nextInt();

                    grupoFiguras.eliminar(idEliminar);
                    System.out.println("La figura se ha eliminado correctamente");
                    break;

                case 3:
                    System.out.println("\nIntroduce la id de la figura de la que quieres obtener informacion:");
                        int idInfo = teclat.nextInt();

                    grupoFiguras.devolverFigura(idInfo).imprimirInfo();
                break;

                default:
                    System.out.println("Ha seleccionat una opcio incorrecta");
                break;
            }
        }
    }
}
