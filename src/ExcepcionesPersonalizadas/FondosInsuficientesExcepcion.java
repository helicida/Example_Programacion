package ExcepcionesPersonalizadas;

/**
 * Created by sergi on 11/12/15.
 */
public class FondosInsuficientesExcepcion extends Exception{

    private double cantidad;    // Diferencia en la que nos hemos pasado al extraer dinero

    public FondosInsuficientesExcepcion(double cantidad){   // Constructor que guarda la cantidad y muestra por pantalla un texto

        this.cantidad = cantidad;

        System.out.println("No puede retirar, fondos insuficientes");
        System.out.println("Se han intentado extraer " + cantidad + " dolares mas de lo posible");
    }

    public double getCantidad(){
        return cantidad;
    }
}
