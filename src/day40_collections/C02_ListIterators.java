package day40_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C02_ListIterators {
    /*
    soru 4  Bir listedeki elementleri iteratır kullanarak
    sondan başa doğru yazdırın
     */
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        int arr[] = {2, 13, 56, 23, 45, 14, 40};
        for (Integer e : arr
        ) {
            numbers.add(e);

        }
        System.out.println(numbers);
        ListIterator li1 = numbers.listIterator();
        while (li1.hasNext()){
            li1.next();
        }
        while (li1.hasPrevious()){
            System.out.print( li1.previous()+ " ");

        }

    }
}
