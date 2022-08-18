package day40_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorileElementSonunaXekleme {
    public static void main(String[] args) {
        List<String> harfler = new ArrayList<>();
       String abc[] = {"A","B","C"};

        for (String e:abc
             ) {
            harfler.add(e);
        }
        System.out.println(harfler);



List<String> list = new ArrayList<>();
list.add("a");
list.add("b");
list.add("c");
        System.out.println(list);
        ListIterator<String>li1= list.listIterator();
        while (li1.hasNext()){
            String str = li1.next();

            li1.set(str+"x");
        }
        System.out.println(list);
        List<Integer>numbers1 = new ArrayList<>();
        numbers1.add(1);
        numbers1.add(2);
        numbers1.add(30);
        numbers1.add(4);


        ListIterator<Integer>ll2 = numbers1.listIterator();
        int start  =20;
        int end = 40;

        while (ll2.hasNext()){
            Integer n = ll2.next();
            ll2.set(n+20);
            if (ll2.next()<start || ll2.next() > end){
                ll2.remove();
            }
        }
        System.out.println(numbers1);
        //sondan başa yazdıralım
        List<String>isimler = new ArrayList<>();
        isimler.add("Ali");
        isimler.add("Veli");
        isimler.add("Rami");
        isimler.add("Hagi");
        ListIterator li5 = isimler.listIterator();
        while (li5.hasNext()){
            System.out.print( li5.next()+ " ");

        }
        System.out.println();
        System.out.println("************************");
        while (li5.hasPrevious()){
            System.out.print( li5.previous()+ " ");
        }

    }







}
