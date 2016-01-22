package Arrays;

import Arrays.Figuras.Circulo;
import Arrays.Figuras.Rectangulo;
import Arrays.Figuras.Triangulo;
import Arrays.GrupOrdenatFiguraGeometricaViaArray;


import java.awt.Color;
import java.util.Scanner;

/**
 * Created by 46465442z on 20/01/2016.
 */
public class ProvaGrupOrdenatFiguraGeometricaViaArray {

    public static void main(String[] args) {

        // Creamos un nuevo grupo de figuras
        GrupOrdenatFiguraGeometricaViaArray grupoFiguras= new GrupOrdenatFiguraGeometricaViaArray(50);

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
            System.out.println("1 - Añadir objetos al array");
            System.out.println("2 - Eliminar objeto del array");
            System.out.println("3 - Obtener informacion de algun objeto del array (POR ID DE FIGURA)");
            System.out.println("4 - Obtener informacion de algun objeto del array (POR POSICIÓN DE ARRAY)");
            System.out.println("5 - Saber espacios llenos del array");
            System.out.println("6 - Vacíar el array");
            System.out.println("0 - Salir del programa");
            System.out.println(" ");

            opcio = teclat.nextInt();

            switch (opcio){

                case 0:
                    System.out.println("Saliendo del programa...");
                    opcio = 0;
                break;

                case 1:
                    // anyadir los objetos al array
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
                    // eliminar un objeto del array
                    System.out.println("\nIntroduce la id de la figura a eliminar:");
                        int idEliminar = teclat.nextInt();

                    grupoFiguras.eliminar(idEliminar);
                    System.out.println("La figura se ha eliminado correctamente");
                break;

                case 3:
                    // info por posicion
                    System.out.println("\nIntroduce la posicion del array de la que quieres obtener informacion:");
                        int idInfo = teclat.nextInt();

                    grupoFiguras.buscarPorID(idInfo).imprimirInfo();
                break;

                case 4:
                    // info por id de figura
                    System.out.println("\nIntroduce la id de la figura de la que quieres obtener informacion:");
                    int posicionArray = teclat.nextInt();

                    grupoFiguras.buscarPorPos(posicionArray).imprimirInfo();
                break;

                case 5:
                    // posiciones llenas del array
                    System.out.println("Hay " + grupoFiguras.numeroOcupados() + "/" + grupoFiguras.getTamanyoArray());
                break;

                case 6:
                    // vaciar array
                    grupoFiguras.vaciarArray();
                    System.out.println("Se ha vaciado el array correctamente");
                break;

                default:
                    System.out.println("Has seleccionado una opción incorrecta");
                break;
            }
        }
    }
}
