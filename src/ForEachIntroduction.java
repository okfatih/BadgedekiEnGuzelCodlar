import java.util.Arrays;

public class ForEachIntroduction {
    public static void main(String[] args) {
        int[] numbers = {2,3,4,1,5,7,8};
        int [] arr = new int[numbers.length];
        for (int i = 0; i <numbers.length ; i++) {
            arr[i]=numbers[i]*2;


        }
        System.out.println(Arrays.toString(arr));
       int index = 0;
        for (int each:numbers) {
         arr[index]=each*2;
         index++;

        }
        System.out.println(Arrays.toString(arr));
    }

}
