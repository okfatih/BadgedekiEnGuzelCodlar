import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_ZorSoruIstenemyenElemaniSil {
    public static void main(String[] args) {
        String cities[] = {"Istanbul", "Amsterdam", "Konya","Kastamonu"};
        String istenmeyenHarf = "m";
        List<String> kalanlar = new ArrayList<>();
        for (int i = 0; i <cities.length ; i++) {
            if (!cities[i].contains(istenmeyenHarf)){
                kalanlar.add(cities[i]); //İstanbul Konya kalanlar listesine eklendiler
            }

        }
        //Loop bittiğinde istenmeyen harf içermeyen şehirler listeye eklenmiş olacaklar
        System.out.println(kalanlar);
        // yenib bir array oluşturp listeyi ona aktaralım
        String kalanlarArray[] = new String[kalanlar.size()];
        for (int i = 0; i <kalanlarArray.length ; i++) {
            kalanlarArray[i]=kalanlar.get(i);

        }
        // cities arrayinin yeni değerini atayalım
        cities =kalanlarArray;
        System.out.println("Şehirler Arrayinin son hali: "+ Arrays.toString(cities));
    }
}
/*

// Soru 4) Verilen bir array'de istenmeyen harf iceren kelimeleri silip,
// kalan elementleri yeni bir array yapin
 */