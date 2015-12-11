package HashMaps;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by sergi on 11/12/2015.
 */
public class HashMapExample{

    public static void main(String[] args){

        Map map = new HashMap(); //HashMap es parecido a un ArrayList pero en vez de tener un indice utiliza un duo de (llave - valor)
        map.put("KeyA", 1);
        map.put("KeyB", "1");
        map.put("KeyC",  2);
        map.put("KeyD", "2");
        map.put("KeyE", "3");
        map.put("KeyF", true);
        map.put("KeyG", false);
        map.put("KeyH", 2.0);
        map.put("KeyI", 3.23423);
        map.put("KeyJ", null);

        // Cuando llamas a una llave esta te devuelve su valor

        System.out.println(map.get("KeyI")); //Prints 3.23423
        System.out.println(map.values()); //Imprime todos los valores (  1, 1, 2, 2, 3, true, false, 2.0, 3.23423, null )  pero NO EN ESTE ORDEN
    }
}
