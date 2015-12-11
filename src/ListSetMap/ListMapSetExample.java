package ListSetMap;

import java.util.*;
/**
 * Created by 46465442z on 11/12/15.
 */

public class ListMapSetExample {

    public static void main(String[] args) {

// LISTS ---------------------------------------------- FUNCIONAN CON INDICES ----------------------------------------
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
// MAPS ---------------------------------------------- FUNCIONAN CON CLAVE - VALOR -----------------------------------
        Map hashMap = new HashMap();    // Sin orden logico secuencial
        Map treeMap = new TreeMap<>();  // Ordenados por la key
        Map linkedHashMap = new LinkedHashMap<>();  // Ordenados por introduccion
// SETS ---------------------------------------------- FUNCIONAN CON INDICES -----------------------------------------
        Set<String> hashSet = new HashSet<>();
        Set<String> treeSet = new TreeSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>(); }}
/*----------------------------------------------------------------------------------------------------------------------
A.allAdd(B) = En la Lista A, se añadirán todos los elementos que haya en la lista B.
A.removeAll(B) = En la Lista A, se borraran todos los elementos que sean iguales a cualquiera de la Lista B.
A.retainAll(B) = En la Lista A, se quedaran todos los elementos que sean iguales a cualquiera de la Lista B.
A.containsAll(B) = Te dice true o false, dependiendo de si la Lista A, contiene todos los elementos de la Lista B.
----------------------------------------------------------------------------------------------------------------------*/