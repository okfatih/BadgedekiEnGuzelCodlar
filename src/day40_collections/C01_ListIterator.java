package day40_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C01_ListIterator {
    /*
    oru 3) Bir listedeki istenen sayi araliginda olmayan elementleri silen bir program yaziniz …                                         (2. liste olusturmadan, gecerli liste uzerinde islem yapiniz)
 Orn : [2,13,56,23,45,14,40] istenen aralik 20 ile 40 arasi (sinirlar dahil)
 output: [23,40]
     */


    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        int arr[] = {2,13,56,23,45,14,40};
        for (Integer e:arr
             ) {
            numbers.add(e);

        }
        System.out.println(numbers);
        ListIterator li1 = numbers.listIterator();
        int start = 20;
        int finish = 40;
        while (li1.hasNext()){
            Integer temp = (Integer)li1.next();
           if (temp<start||temp>finish){
               li1.remove();
           }

        }
        System.out.println(numbers);
    }

}
