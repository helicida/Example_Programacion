package Arrays;

import Arrays.Figuras.Circulo;
import Arrays.Figuras.FiguraGeometrica;

import java.awt.*;
import java.util.Arrays;

/**
 * Created by 46465442z on 20/01/2016.
 */
public class GrupOrdenatFiguraGeometricaViaArray {

    private FiguraGeometrica[] array;
    private int tamanyoArray;

    public GrupOrdenatFiguraGeometricaViaArray(int tamanyoArray) {

        // Si el tamaño del array es incorrecto, que suelte una excepción
        if (tamanyoArray < 0){
            throw new IllegalArgumentException(tamanyoArray + " | El valor introducido como tamaño del vector es incorrecto, ha de ser superior a cero");
        }

       this.tamanyoArray = tamanyoArray;
       array = new FiguraGeometrica[tamanyoArray];
       Arrays.fill(array, null);
    }

    // Devuelve una figura busada por id
    public FiguraGeometrica buscarPorID(int codigo) {

        int posicionFigura; // Posicion del array en la que estará nuestra figura

        FiguraGeometrica figuraAComparar = new FiguraGeometrica() {
            @Override
            public double area() {

                return 0;
            }
        };

        figuraAComparar.setCodigo(codigo);

        posicionFigura = Arrays.binarySearch(array, 0, numeroOcupados(), figuraAComparar);  // Busqueda dicotómica tiene un error

        // Si es -1 es que no ha encontrado la figura
        if (posicionFigura < 0){
            System.out.println("No se ha encontrado la figura");
            return null;
        }

        // Si la encuentra que la devuelva
        FiguraGeometrica figura = array[posicionFigura];

        return figura;
    }

    // Devuelve una figura buscada por la posición del array
    public FiguraGeometrica buscarPorPos(int posicion) {
        return array[posicion];
    }

    // Vacia el array
    public void vaciarArray() {

        for (int iterador = 0; iterador < tamanyoArray; iterador++){
            array[iterador]=null;
        }
    }

    // Numero de posiciones llenas del array
    public int numeroOcupados() {

        // Cuenta los numerosOcupados y devuelve el numero
        int numeroOcupados = 0;

        // Vamos sumando uno a la variable cada vez que encontremos una posición llena
        for (int iterador = 0; iterador < array.length; iterador++) {
            if (array[iterador] != null) {
                numeroOcupados++;
            }
        }
        return numeroOcupados;
    }

    // Metodo con el que añadimos un objeto al vector
    public int anyadir(FiguraGeometrica figura) {

        int indice = 0; // indice en el vector

        System.out.println("Añadiendo el objeto " + figura.toString());

        // Si la figura es null dice que no es valida
        if (figura == null){
            System.out.println("No se ha podido añadir el objeto, el ojeto no es valido");
            return 0;
        }

        else {
            // Vamos a una posición vacía con el for y asignamos ahí la nueva figura
            for(int iterador = 0; iterador < tamanyoArray; iterador++){
                if(array[iterador] == null){
                    indice = iterador;
                    array[indice] = figura;
                    return 0;
                }
            }

            if (indice == tamanyoArray && array[tamanyoArray] == null) {
                System.out.println("El array esta lleno!");
                Arrays.sort(array); //ordena para la posterior busqueda
                return  0;
            }
        }

        System.out.println("Se ha añadido el objeto");
        return 0;
    }

    // Buscamos un objeto y lo eliminamos
    public void eliminar(int codigo) {

        int iterador;   // Iterador con el que recorreremos el indice

        // Aquí no usamos la búsqueda dicotómica

        for (iterador = 0; iterador < array.length && array[iterador].getCodigo() != codigo; iterador++);

        // Si llega a la última posición y no lo encuentra
        if (iterador == array.length && array[iterador] == null){
            System.out.println("No existe la figura");
        }

        System.out.println("El objeto " + array[iterador] + " se ha eliminado");

        array[iterador] = null;
    }

    // Getter

    public int getTamanyoArray() {
        return tamanyoArray;
    }
}
