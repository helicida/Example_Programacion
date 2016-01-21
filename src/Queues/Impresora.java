package Queues;

import java.util.PriorityQueue;

/**
 * Created by sergi on 17/01/16.
 */
public class Impresora {

	public static void main(String[] args) {

		int colaImpresoraTamaño = 9;	// Tamaño de nuestra cola

		PriorityQueue<Documento> colaImpresora = new PriorityQueue<>(colaImpresoraTamaño, new ComparadorPrioridad ());

		Documento documentoAImprimir = new Documento("TextoAImprimir", Prioridad.ALTA ,"Empleado 1");
			colaImpresora.add(documentoAImprimir);
		documentoAImprimir = new Documento("TextoAImprimir 1", Prioridad.BAJA ,"Empleado 2");
			colaImpresora.add(documentoAImprimir);
		documentoAImprimir = new Documento("TextoAImprimir 2", Prioridad.BAJA ,"Empleado 3");
			colaImpresora.add(documentoAImprimir);
		documentoAImprimir = new Documento("TextoAImprimir 3", Prioridad.MEDIA ,"Empleado 2");
			colaImpresora.add(documentoAImprimir);
		documentoAImprimir = new Documento("TextoAImprimir 4", Prioridad.MEDIA,"Empleado 2");
			colaImpresora.add(documentoAImprimir);
		documentoAImprimir = new Documento("TextoAImprimir 5", Prioridad.ALTA ,"Empleado 5");
			colaImpresora.add(documentoAImprimir);
		documentoAImprimir = new Documento("TextoAImprimir 6", Prioridad.BAJA ,"Empleado 4");
			colaImpresora.add(documentoAImprimir);
		documentoAImprimir = new Documento("TextoAImprimir 7", Prioridad.ALTA ,"Empleado 1");
			colaImpresora.add(documentoAImprimir);
		documentoAImprimir = new Documento("TextoAImprimir 8", Prioridad.BAJA ,"Empleado 5");
			colaImpresora.add(documentoAImprimir);

		// Imprimimos los documentos en pantalla
		for(int iterador = 0; iterador <  colaImpresoraTamaño; iterador++){
			System.out.println(colaImpresora.poll().imprimirInfo());
		}
	}
}
