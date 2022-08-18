package day40_collections;

import java.util.Deque;
import java.util.LinkedList;

public class DequeueLinkedListPratik {
    public static void main(String[] args) {
        Deque<String>dellist = new LinkedList<>();
        dellist.add("Cavidan");
        dellist.add("Mesut");
        dellist.add("Tevik");
        dellist.add("Selim");
        System.out.println("dellist.pop() = " + dellist.pop());
        /*
        Pop liste başındaki elemanı silip bize döndürür
         */


        dellist.offerFirst("Roy");
        dellist.offerLast("Trevor");
        dellist.offerLast("Cavidan");//[Cavidan, Mesut, Tevik, Selim, Trevor, Cavidan]
        System.out.println(dellist); // [Roy, Cavidan, Mesut, Tevik, Selim, Trevor]
        dellist.pollFirst();
        /*
        Retrieves and removes the first element of this deque,
        or returns null if this deque is empty.
        Returns:
        the head of this deque, or null if this deque is empt
         */
        System.out.println(dellist);//[Cavidan, Mesut, Tevik, Selim, Trevor]

        dellist.removeFirstOccurrence("Cavidan");//[Mesut, Tevik, Selim, Trevor, Cavidan]
        System.out.println(dellist);
        System.out.println("dellist.removeLastOccurrence(\"Cavidan\") = " + dellist.removeLastOccurrence("Cavidan"));
        System.out.println(dellist);
        System.out.println("dellist.pop() = " + dellist.pop());
        System.out.println();


    }
}
