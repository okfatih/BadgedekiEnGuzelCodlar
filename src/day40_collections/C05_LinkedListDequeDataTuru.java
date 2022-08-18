package day40_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C05_LinkedListDequeDataTuru {
    public static void main(String[] args) {
        Deque<String>ll4 = new LinkedList<>();
        ll4.add("Cavidan");
        ll4.add("Reis");
        ll4.add("Hamza");
        ll4.offerFirst("Teyze");
        ll4.offerLast("Nike");
        System.out.println(ll4);
    }
}
