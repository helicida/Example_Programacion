package Vectores;

import Vectores.Figuras.FiguraGeometrica;

import java.util.Collections;
import java.util.Vector;

/**
 * Created by 46465442z on 20/01/2016.
 */
public class GrupOrdenatFiguraGeometricaViaVector {

    private Vector<FiguraGeometrica> vector;

    public GrupOrdenatFiguraGeometricaViaVector(int tamanyoVector) {

        if (tamanyoVector < 0){
            throw new IllegalArgumentException(tamanyoVector + " | El valor introducido como tamaño del vector es incorrecto, ha de ser superior a cero");
        }

        vector = new Vector<>(tamanyoVector);
    }

    public FiguraGeometrica devolverFigura(int indice){

        return vector.get(indice);
    }

    // Metodo con el que añadimos un objeto al vector
    public int anyadir(FiguraGeometrica figura) {

        System.out.println ("Añadiendo el objeto " + figura.toString());

        int indice; // indice en el vector

        if (figura == null){
            System.out.println("No se ha podido añadir el objeto");
            return -2;
        }

        indice = vector.indexOf(figura);

        if (indice >= 0){
            System.out.println("Error en la posición " + indice);
            return indice;
        }

        vector.add(figura);
        Collections.sort(vector);

        System.out.println("Se ha añadido el objeto");
        return -1;
    }

    // Buscamos un objeto y lo eliminamos
    public void eliminar(int codigo) {

        int iterador;   // Iterador con el que recorreremos el indice

        for (iterador = 0; iterador < vector.size() && vector.get(iterador).getCodigo() != codigo; iterador++);

        if (iterador == vector.size()){
            System.out.println(":No existe la figura:");
        }

        System.out.println("El objeto " + vector.get(iterador) + " eliminado");
        vector.remove(iterador);
    }
}
