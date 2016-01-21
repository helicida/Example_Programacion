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

        // Si el tamaño del vector es incorrecto, que suelte una excepción
        if (tamanyoVector < 0){
            throw new IllegalArgumentException(tamanyoVector + " | El valor introducido como tamaño del vector es incorrecto, ha de ser superior a cero");
        }

        vector = new Vector<>(tamanyoVector);
    }

    public FiguraGeometrica buscarFiguraPorPosicion(int indice){
        // Devuelve la figura en el indice introducido
        return vector.get(indice);
    }

    public FiguraGeometrica buscarFiguraPorId(int indice){

        // Devuelve la figura con un ID determinado
        for (int iterador = 0; iterador < vector.size(); iterador ++){
            if (vector.get(iterador).getCodigo() == indice){
                return vector.get(iterador);
            }
        }

        return null;
    }

    // Metodo con el que añadimos un objeto al vector
    public int anyadir(FiguraGeometrica figura) {

        System.out.println ("Añadiendo el objeto " + figura.toString());

        int indice; // indice en el vector

        // Si la figura introducida fuese null da un mensaje de error y no devuelve nada
        if (figura == null){
            System.out.println("No se ha podido añadir el objeto, el objeto no es valido");
            return 0;
        }

        indice = vector.indexOf(figura);

        if (indice >= 0){
            System.out.println("Error en la posición " + indice);
            return indice;
        }

        vector.add(figura);
        Collections.sort(vector);

        System.out.println("Se ha añadido el objeto");
        return 0;
    }

    public void vaciarVector(){
        // Limpia el vector
        vector.clear();
    }

    // Buscamos un objeto y lo eliminamos
    public void eliminar(int codigo) {

        int iterador;   // Iterador con el que recorreremos el indice

        for (iterador = 0; iterador < vector.size() && vector.get(iterador).getCodigo() != codigo; iterador++);

        if (iterador == vector.size()){
            System.out.println("No existe la figura");
        }

        System.out.println("El objeto " + vector.get(iterador) + " eliminado");
        vector.remove(iterador);
    }
}
