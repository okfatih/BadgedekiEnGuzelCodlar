import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_Soru1ArraydentekrarlayanElemanBulma {
    public static void main(String[] args) {
        /*
        Verilen bir arraydeki tekrar eden elementleri yazdırın
         */
        int[] arr = {3,3,5,5,4,2,1,2,3,5,9,8};
        Arrays.sort(arr);
        List<Integer>tekrarEdenler = new ArrayList<>();

        for (int i = 0; i <arr.length-1; i++) {
            if (arr[i]==arr[i+1]&&!tekrarEdenler.contains(arr[i])){
                System.out.print(arr[i] + " ");
                tekrarEdenler.add(arr[i]);
            }

        }
        System.out.println(tekrarEdenler);
        int arr2[] = {10,20,10,12,3,4,5,6,5};
        Arrays.sort(arr2);
        List<Integer>tekraaar = new ArrayList<>();
        for (int i = 0; i <arr2.length-1 ; i++) {
          if (arr2[i]==arr2[i+1]&& !tekraaar.contains(arr2[i])){
              tekraaar.add(arr2[i]);

            }

        }
        System.out.println("tekraar listesi: " + tekraaar);

        }


    }

