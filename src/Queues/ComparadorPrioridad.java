package Queues;

import java.util.Comparator;

/**
 * Created by sergi on 17/01/16.
 */
public class ComparadorPrioridad implements Comparator<Documento> {

	// Usamos el comparator de java para poder saber la prioridad de los documentos
	// IMPORTANTE! El método compare desciende de Comparator, es obligatorio instanciar este método

    public int compare(Documento documento1, Documento documento2) {

		// Hacemos las comparaciones jugando con los valores que devuelve la funcion
		if( documento1.determinarPrioridad() - documento2.determinarPrioridad() == 0){
			return documento1.getIdentificadorDoc() - documento2.getIdentificadorDoc();
		}
		else{
			return documento1.determinarPrioridad() - documento2.determinarPrioridad();
		}

	}
}
