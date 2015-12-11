package ClasesGenericas.Ejemplo1;

/**
 * Created by sergi on 11/12/2015.
 */
public class GenericaTester{

    public static void main(String[] args){ //Al ser una clase generica , al igual que un ArrayList<Loquesea> le podemos pasar cualquier cosa

        //PODEMOS LLAMARLAS ASI.
        GenericaExample example1 = new GenericaExample("String"); //Pasamos String
        GenericaExample example2 = new GenericaExample(1); //Pasamos Integer
        GenericaExample example3 = new GenericaExample(1.0); //Pasamos Double
        GenericaExample example4 = new GenericaExample(true); //Pasamos Boolean

        System.out.println(example1.getVariable()); //Prints 'String'
        System.out.println(example2.getVariable()); //Prints '1'
        System.out.println(example3.getVariable()); //Prints '1.0'
        System.out.println(example4.getVariable()); //Prints 'true'

        //O ASI, COMO CUANDO LLAMAMOS A UN ARRAYLIST
        GenericaExample<String> onlyStrings = new GenericaExample<>();
        onlyStrings.setVariable("Hola");
        System.out.println(onlyStrings.getVariable()); //Prints 'Hola'
    }
}
