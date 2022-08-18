import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_ArraydenListOlusturma {
    public static void main(String[] args) {

        tahminRandom();
        /*
        İçinde 200 tane 1000 den küçük pozitif tam sayı olanı bir list
        oluşturun
        Kullanıcıdan bir sayı isteyip listede var olup olmadığını kullanıcıya yazalım
         */
        Random rnd = new Random();
        int sayi = 0;
        List<Integer> sayiListesi = new ArrayList<>();
        while (sayiListesi.size()<200){
            sayi= rnd.nextInt(1000);

            if (!sayiListesi.contains(sayi)){
                sayiListesi.add(sayi);
            }
            //satır 18 deki ilk while ile 200 elemanlı sayı listesinden birbirinden farklı 1000 den küçük sayı atıyoruz
        }
       System.out.println(sayiListesi);
        boolean bildiMi = false;
        int count = 1;
        Scanner scan =new Scanner(System.in);

        while (!bildiMi){  // sadee bildimi olsaydı true false kalacaktı biz false olmadı mı
            System.out.println("Guess a number:  ");
            sayi =scan.nextInt();
            if (sayiListesi.contains(sayi)){
                System.out.println("Congrats " + count + ".tahminizde buldunuz");
                bildiMi = true;
            }else {
                System.out.println(count + ". kez tahmin ettin. Bulamadın");
                count++;
            }

        }


        }
    public static void tahminRandom(){
        Random tut =new Random();
        int number = 0;
        List<Integer>kume = new ArrayList<>();
        while (kume.size()<200){
            number= tut.nextInt(1000);
            if (!kume.contains(number)){
                kume.add(number);
            }
        }
        System.out.println(kume);
        boolean guess = false;
        int count = 1;
        Scanner scan = new Scanner(System.in);
        while (!guess){
            System.out.println("Number: ");
            number=scan.nextInt();
            if (kume.contains(number)){
                System.out.println("Congrats " + count + ".da dogru tahmin" );
                guess=true;
            }else{
                System.out.println(count+ " kez yanlış tahmin ");
                count++;
            }
        }
    }
}
