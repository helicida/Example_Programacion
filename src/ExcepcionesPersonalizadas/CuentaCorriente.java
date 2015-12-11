package ExcepcionesPersonalizadas;

/**
 * Created by sergi on 11/12/15.
 */
public class CuentaCorriente {

    private double balance;
    private int numero;

    public CuentaCorriente(int numero){
        this.numero = numero;
    }

    public void deposito(double cantidad){  // Metodo para ingresar dinero
        balance += cantidad;
    }

    public void retiro(double cantidad) throws FondosInsuficientesExcepcion{

        if(cantidad <= balance){    // Si intentamos retirar menos que el dinero total de la caja
            balance -= cantidad;    // Simplemente lo extraemos
        }
        else{   // Si no es posible, lanzamos nuestra excepcion
            double resta = cantidad - balance;  // Calculamos cual es la diferencia que falta
            throw new FondosInsuficientesExcepcion(resta);  // Y lanzamos nuestra excepcion psandole el valor
        }
    }

    // Getters

    public double getBalance(){
        return balance;
    }

    public int getNumero(){
        return numero;
    }
}
