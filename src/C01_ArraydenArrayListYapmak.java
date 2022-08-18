import java.util.Arrays;
import java.util.List;

public class C01_ArraydenArrayListYapmak {
    public static void main(String[] args) {
        String classList[]={"David","Emerson","Kaka","Thomas"};
        /*
        Uzun listeler oluşturmamız gerektiğinde tek
        tek eklemek yerine array oluşturup,  bunları
        liste çevirmek daha pratik olabilir.
        1.Loop ile array'deki tüm elementleri list'e atabiliriz
        2. Arrays classından asList methodu ile ki bunun yan etkileri vardı
            a. Arrays classı kullanılıdığı için array özellikleri geçerli olur
            dolayısıyla da liste olan add, remove gibi size'ı değiştiren methodlar
            bu şekilde oluşturulan listlerde kullanılamaz
            b. Kaynak olan array ile ürün olan list özdeşleştirilir
            birinde yapılan değişiklik otomatik olarak diğerine de işlenir
         */
        List<String> sinifList = Arrays.asList(classList);
        System.out.println(sinifList); // array döndürüyor fakat burda list methodlarını kullanamam deneyelim
        //sinifList.add("Erdi");
        //sinifList.remove(1);

         // 2. yan etki
        classList[1]="Jason";
        System.out.println("Değişim sonrası Array: " + Arrays.toString(classList));
        System.out.println("Arrayi değiştirince list: " + sinifList);

        sinifList.set(0,"Utku");
        System.out.println("Listi değiştirince List" + sinifList);
        System.out.println("Listi değitirince Array" + Arrays.toString(classList));

    }
}
