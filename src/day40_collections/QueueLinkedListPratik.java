package day40_collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedListPratik {
    public static void main(String[] args) {
        Queue<String> qll = new LinkedList<>();
        qll.add("Adem");
        qll.add("Zeynep");
        qll.add("Hpolat");
        qll.add("Kadir");
        System.out.println(qll);


        /*
        Queue kuyruk demektir sıra önemlidr giden sona gelir giden baştan gider

         */
        System.out.println( qll.remove());
        System.out.println(qll);
        qll.remove("Hpolat");
        System.out.println(qll);
        System.out.println("qll.element() = " + qll.element()); //Retrieves, but does not remove, the head of this queue,

        System.out.println("qll.peek() = " + qll.peek());
        /*
        If the qll was empty,  element method would throw an exception    , while peek method
        would return null
         */
qll.offer("Remco");
            /*
            Inserts the specified element into this queue if it is possible to do so
            immediately without violating capacity restrictions.
            When using a capacity-restricted queue, this method is
            generally preferable to add, which can fail to insert an element only by throwing an exception.
             */
        System.out.println("qll = " + qll);
        System.out.println("qll.poll() = " + qll.poll());
        System.out.println(qll);
        /*
        Retrieves and removes the head of this queue,
        or returns null if this queue is empty.
         Returns:
        the head of this queue, or null if this queue is empty
         */

    }

}
