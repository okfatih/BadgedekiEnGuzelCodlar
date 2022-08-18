package day40_collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C03_LinkedList {
    public static void main(String[] args) {
        LinkedList linkedList1 = new LinkedList<>();
        // Linkedlist bir classtır ilk eleman head dir ve head data tutmaz

        // her elemanın içinde data ve address kısımları vardır
//linked list aramada yavaşken yeni bir eleman ekleme de çok iyidir sıralama yapmaz. sıralı yapmak istiyorsak tree
        // Linked Listin 2 adet interface parent ı vardır Queue ve List.
        // Obje oluştururken data turu olarak istediğimiz paretn interface i seçer ve o interfacedeki özellikleri kullanabiliriz
        List<String> ll2 = new LinkedList<>();
        ll2.add("Berk");
        ll2.add("kenan");
        ll2.add("reis");
        Queue<String> ll3 =new LinkedList<>();

        Deque<String > ll4 = new LinkedList<>();

//        System.out.println(ll2);
//        System.out.println("ll2.remove(2) = " + ll2.remove(2));

      /*
      Eper listemiz Integer elementlerden oluşyurosa
      direkt sayi yazdırırsak index olarak kabul eder
      bir variable a atama yapar ve remove da
       */
        System.out.println("ll2.isEmpty() = " + ll2.isEmpty());
        ll2.set(0,"Rocky");
        System.out.println("ll2 = " + ll2);
    linkedList1.add("Berk");
    linkedList1.add("İsmail");
        System.out.println(linkedList1);
        ll2.retainAll(linkedList1); // ll2 deki tğm elementleri ll1 ile karşılatırıp ll1 de olmayanları siler ortak olanları yazar
        System.out.println("ll2 = " + ll2);


    }
}
