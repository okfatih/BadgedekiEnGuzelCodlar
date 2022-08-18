package day40_collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkliLinkedListPratik {
    public static void main(String[] args) {


        LinkedList<String>ll1 =  new LinkedList<>();

        Queue<String> ll3 = new LinkedList<>();

        Deque<String >ll4 = new LinkedList<>();




        List<String> isimler = new LinkedList<>();

        isimler.add("Remzi");
        isimler.add("Kaan");
        isimler.add("Ceyhun");
        isimler.add("Cavidan");

        System.out.println(isimler);
        isimler.remove("Ceyhun");//object sildik
        System.out.println(isimler);
        System.out.println(isimler.remove(1)); //1.elemanı silip sana getirir
        System.out.println(isimler);
        System.out.println( isimler.isEmpty());
        isimler.set(0,"Seher");
        System.out.println(isimler);


        ll1.add("Seher");
        ll1.add("İsmail");
        System.out.println(ll1);
        isimler.retainAll(ll1); //isimlerdeki tüm elementleri ll1 ile karşılaştırır
        // isimlerde olmayanalrı siler ortak olanları bırakır gerisini siler
        System.out.println(isimler);//[Seher]
        System.out.println(isimler.hashCode());
        isimler.add("Fatih");
        System.out.println("isimler.hashCode() = " + isimler.hashCode());
    }
}
