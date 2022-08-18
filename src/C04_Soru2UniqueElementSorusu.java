import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_Soru2UniqueElementSorusu {
    public static void main(String[] args) {
        int[] arr = {2,3,5, 6,3,5,1,9,6,3,5,5,9};
        int[] uniqueArray= uniqueArrayolustur(arr);
        System.out.println(Arrays.toString(uniqueArray));

    }

   public static int[] uniqueArrayolustur(int[] arr) {
       Arrays.sort(arr);
       List<Integer>tekrarsizList = new ArrayList<>();
       for (int i = 0; i <arr.length -1 ; i++) {
           if (arr[i]!=arr[i+1]){ // bu loop bittiğinde benzersizListemiz oluşacak bize array lazım
               tekrarsizList.add(arr[i]);
           }

       }
       if (!tekrarsizList.contains(arr[arr.length-1])){
           tekrarsizList.add(arr[arr.length-1]);
       }
       //tekrarsizList oluştu
       // tekrarsız listenin size bilgisini kullanarak array oluşturduk
       int[] tekrarsizArr= new int[tekrarsizList.size()];
     //benzersiz listedeki tüm elemanları yeni array'a atadık
       for (int i = 0; i <tekrarsizArr.length ; i++) {
           tekrarsizArr[i]=tekrarsizList.get(i);

       }
       //oluşturduğumuz yeni arrayi tekrarsizArr a aktardık
       return tekrarsizArr;
    }
}
/*

Soru 2) Verilen bir array’deki tekrar eden  elementleri tek bir defa barındıran yeni bir
 array olarak donduren bir method olusturun
 */