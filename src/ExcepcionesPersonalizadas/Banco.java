package ExcepcionesPersonalizadas;

/**
 * Created by sergi on 11/12/15.
 */
public class Banco {

    public static void main(String [] args){

        CuentaCorriente c = new CuentaCorriente(973645);    // Creamos nuestra cuenta corriente

        System.out.println("Deposito $500");
        c.deposito(500.00); // Ingresamos 500 dolares

        try{
            System.out.println("\nRetiro $100");
            c.retiro(100.00);   // Sacabmos 100 dolares
            System.out.println("\nRetiro $600");
            c.retiro(600.00); // Scamos 600 dolares

            // Al intentar sacar mas dinero del existente, saltara nuestra excepcion
        }catch(FondosInsuficientesExcepcion e){
            e.printStackTrace();
        }
    }
}
