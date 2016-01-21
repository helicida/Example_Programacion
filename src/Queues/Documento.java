package Queues;

import java.util.Date;

// Enum con la prioridad correspondiente a cada impresion
enum Prioridad {
	ALTA, MEDIA, BAJA,
}

/**
 * Created by sergi on 17/01/16.
 */
public class Documento {

	private static int contadorIdentificador = 0;	// Contador que usaremos para ir asignando a cada documento su id
	private int identificadorDoc;    				// Numero que identifica el documento
	private String documento;        				// Información del documento
	private Prioridad prioridad;   					// Prioridad del documento
	private String empleado;						// Nombre del empleado
	private Date fecha = new Date();				// Date que usaremos para mostrarla fecha

	public Documento(String documento, Prioridad prioridad, String empleado) {
		this.documento = documento;
		this.prioridad = prioridad;
		this.empleado = empleado;
		this.identificadorDoc = Documento.contadorIdentificador;
		Documento.contadorIdentificador++;
	}

	// Con este método devolveremos la prioridad
	public int determinarPrioridad() {

		if (prioridad.equals(Prioridad.ALTA)) {
			return 1;
		} else if (prioridad.equals(Prioridad.MEDIA)) {
			return 2;
		} else if (prioridad.equals(Prioridad.BAJA)){
			return 3;
		}
		return 3; // Si no se especifica nada es prioridad baja
	}

	// Con este método imprimiremos la información
	public String imprimirInfo() {
		return "\n · ID : " + getIdentificadorDoc() + " | Prioridad: " + prioridad +
				"\n--------------------------------------" +
				"\n · Titulo: " + documento +
				"\n · Empleado: " + this.empleado +
				"\n · Fecha: " + this.fecha.toString();
	}

	// Getters
	public int getIdentificadorDoc(){
		return identificadorDoc;
	}
}
