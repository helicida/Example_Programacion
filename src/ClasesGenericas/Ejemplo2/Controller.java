package ClasesGenericas.Ejemplo2;

/**
 * Created by 48089748z on 11/12/15.
 */
public class Controller{

    public static void main(String[] args){
        /*Pila pila = new Pila<Integer>();

        pila.add("String 0");
        pila.add("String 1");
        pila.add("String 2");

        System.out.println("\n VALORES INICIALES");
        for(int x=0; x<pila.size(); x++)
        {
            System.out.println("Valor posicion "+x+": "+pila.get(x));
        }

        System.out.println("\nSIZE DEBERIA SER 3: " + pila.size());
        pila.remove();
        System.out.println("SIZE DEBERIA SER 2: " + pila.size());

        System.out.println("\nVALORES FINALES (Deberia haberse borrado 'String 2'");
        for(int x=0; x<pila.size(); x++)
        {
            System.out.println("Valor posicion "+x+": "+pila.get(x));
        }*/

        Cola cola = new Cola<Number>();

        cola.add(1);
        cola.add(2.45);
        cola.add(2.56374645645645623);

        System.out.println("ESTO DEBERIA SER TRUE: " + cola.contains(1));
        System.out.println("SIZE DEBERIA SER 3: " + cola.size());
        System.out.println("\n VALORES INICIALES");

        for(int iterador = 0; iterador < cola.size(); iterador++){
            System.out.println("Valor posicion " + iterador + ": " + cola.get(iterador));
        }

        cola.remove(0);
        System.out.println("ESTO DEBERIA SER FALSE: " + cola.contains(120));
        cola.clear();
        System.out.println("SIZE DEBERIA SER 0: " + cola.size());

    }
}
