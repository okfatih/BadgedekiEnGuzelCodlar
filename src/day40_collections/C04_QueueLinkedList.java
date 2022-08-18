package day40_collections;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class C04_QueueLinkedList {
    public static void main(String[] args) {
        Queue<String> ll3 =new LinkedList<>();
        ll3.add("Adem");
        ll3.add("Zeynep");
        ll3.add("Hpolat");
        ll3.add("Kadir");
        System.out.println(ll3);
        System.out.println("ll3.remove() = " + ll3.remove()); // remove dediğimizde bizden index veya String istemiyor
                     //  ilk queue itemi siler
        System.out.println("ll3 = " + ll3);
        System.out.println("ll3.remove(\"Hpolat\") = " + ll3.remove("Hpolat"));//true
        System.out.println("ll3 = " + ll3);
        System.out.println(ll3.element());
        System.out.println(ll3.peek());
        Queue<String> ll4 =new LinkedList<>();
//ll4.element();
        System.out.println("ll4.peek() = " + ll4.peek());
        /*
        peek ve element silmeden bize ilk elementi döndürürler
        aralarındaki fark boş listede element exception fırlatır
        peek null verir
         */
        /*
        Sıra demektir sıra önemlidir
        Gelen sona gelir giden bastan gider
         */

        ll3.offer("Ahmet"); //sona ekledi
        ll3.offer("Sefa");
        System.out.println("ll3 = " + ll3);
        System.out.println("ll3.poll() = " + ll3.poll());// baştaki elemanı silip getirir


         try {
             ll4.remove();
         }catch (NoSuchElementException e){
             System.out.println("Olut böyle vakalar amq abartma");
         }


    }
}
