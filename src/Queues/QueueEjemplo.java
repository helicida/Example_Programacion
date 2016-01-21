package Queues;

import java.util.*;

/**
 * Created by sergi on 17/01/16.
 */

// Un objeto de la clase Queue es una cola. Permite almacenar objetos y luego recuperarlos en el orden en el cual se insertaron. Para insertar un objeto a la cola se invoca el método put
// En cualquier momento se puede recuperar el primer elemento de la cola con los métodos getTipo().

public class QueueEjemplo{

    public static void main(String[] args){
        
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        // Ordena de forma natural
        
        Integer[] nums = {4,3,1,2};
        
        //OFFER(E) añadir
        for(Integer i:nums){
            pq.offer(i);
        }
        
        //SIZE()
        System.out.println("size: " + pq.size());
        // 4
        
        //ITERATOR(), no orden.
        Iterator it = pq.iterator();
        
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
        // 1 2 3 4 
        
        //ADD
        pq.add(new Integer(1)); // permite duplicados
        
        try{
            pq.offer(null);    // Error ejecución, no permite nulos.
            
        }catch(java.lang.NullPointerException e){
            //RuntimeException.NullPointerException
            System.out.println("\n Error, PriorityQueue no " + " permite nulos!");
        }
        
        //ADD(E)
        System.out.println("\n Añade 5 -> add(5) : " + pq.add(new Integer(5)));
        // true
        
        //ELEMENT()
        System.out.println("Devuelve el 1º elemento sin " + " borrar -> element(): " + pq.element());
        // 1
        
        //PEEK()
        System.out.println("Devuelve el 1º sin " + " borrarlo -> peek(): " + pq.peek());
        // 1
        
        //POLL()
        System.out.println("Devuelve el 1º y lo " + " elimina -> poll(): " + pq.poll());
        // 1
        
        //REMOVE()
        System.out.println("Devuelve el 1º elemento " + " y lo elimina -> remove: " + pq.remove());
        // 1 
        
        //SIZE()
        System.out.println("size: " + pq.size());
        // 4 
        
        // CONSTRUCTOR CON COMPARATOR
        PriorityQueue<Integer> pqc =
        new PriorityQueue<Integer>(8, new PQsort());
        
        Integer[] vals = {9,6,7,8};
        
        for(Integer i:vals) pqc.offer(i);
        
        //ITERATOR(), no orden
        Iterator<Integer> itc = pqc.iterator();

        while(itc.hasNext()){
            System.out.print(itc.next() + " ");
        }
        // 9 8 7 6
        
        }
    
}

class PQsort implements Comparator<Integer> {
        
        // Sobreescribir compare:
        // public int compare(Ref a, Ref b){}
        
        // Sobrecargar compare:
        // public int compare(primitivo a, primitivo b){}
        
        public int compare(Integer one, Integer two) {
    
    // Invertir orden
    return two - one; // UnBoxing
    
    }
}