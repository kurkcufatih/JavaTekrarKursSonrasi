package day23_ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class day23_Tekrar_List_ArrayList {
    public static void main(String[] args) {

        List<String> ogrenciler = new ArrayList<>();
        ogrenciler.add("Ahmet");
        ogrenciler.add("Mehmet");
        ogrenciler.add("Hakan");
        ogrenciler.add("Selim");

        //==== LIST size() methodu

        System.out.println("ogrenciler.size() = " + ogrenciler.size());
        //ogrenciler.size() = 4


        //==== LIST set() methodu ====

        /*
        Elimizde urunlerin bulundugu bir liste var
        urun listesindeki istenen siradaki urunu
        istegimiz yeni urunle degistirip
        eski urunu, varolan eski urunler listesine ekleyelim
        */
        List<String> urunler = new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        List<String> eskiUrunler = new ArrayList<>();
        // listedeki ikram'in yerine biskrem koyalim,
        // ikram'i da eski urunler listesine ekleyelim
        String yeniUrun = "Biskrem";
        String silinecekUrun = "Ikram";

        int bosListe = urunler.indexOf(silinecekUrun);
        String silinenUrun = urunler.set(bosListe, yeniUrun);

        eskiUrunler.add(silinenUrun);
        System.out.println("Silinen urun : " + silinenUrun); //Ikram
        System.out.println("Yeni urun : " + yeniUrun); //Biskrem
        System.out.println("Yeni urun listesi : " + urunler); //[Nutella, Biskrem, Cekirdek, Cay]
        System.out.println("Eski urun listesi : " + eskiUrunler); //[Ikram]

        //YOL 2
        eskiUrunler.add(urunler.get(0));
        System.out.println(eskiUrunler); //[Ikram, Nutella]
        yeniUrun = "Cokokrem";
        urunler.set(0, yeniUrun);
        System.out.println(urunler); //[Cokokrem, Biskrem, Cekirdek, Cay]

        //==== List- indexOf ve lastIndexOf() methodlari ====

        System.out.println(urunler);
        System.out.println(urunler.indexOf("Biskrem")); // 1
        System.out.println(urunler.lastIndexOf("Biskrem")); //1

        /*
         indexOf method'u bize bilgi donduren bir method'dur
         listemizi degistirmez

         indexOf method'u urunu aramaya 0.index'den,
         lastIndexOf method'u ise aramaya son index'den baslar.
         arama bitip, urun bulundugundugunda,
         ikisi de bulunan urunun index'ini verir

         indexOf bastan kontrol eder ve indexini yazdirir.
         lastIndexOf ta sondan baslar bakmaya ve indexi verir
         (index her zaman bastan sayilir)
         */

        //==== List- remove() methodu ====

        System.out.println(urunler.remove("Biskrem")); //true
        System.out.println(urunler); //[Cokokrem, Cekirdek, Cay]
        System.out.println(urunler.remove("Hobby")); //false
        System.out.println(urunler.remove(1)); //Cekirdek
        //remove'u index ile kullandigimizda sout yapinca
        //cikardigimiz urunu yazdiriyor bize
        System.out.println(urunler); //[Cokokrem, Cay]
        //System.out.println(urunler.remove(3));
        //var olmayan bir index'i girdigimizde
        //IndexOutOfBoundsException verir.

        //==== List- contains ve containsAll methodu ====

        System.out.println(urunler.contains("Cokokrem")); //true

        List<String> urunler2 = new ArrayList<>();
        urunler2.add("Nutella");
        urunler2.add("Ikram");

        urunler.addAll(urunler2);

        System.out.println(urunler); //[Cokokrem, Cay, Nutella, Ikram]

        System.out.println(urunler.containsAll(urunler2)); //true


        //==== List- sort() methodu ====

        /*
        List ile gelen sort method'unda siralama
        ozelligini girmek gerekiyor, bunun yerine collections class'indan
        sort method'unu kullaniyoruz. Bu method listemizi natural
        order'a gore siralar.
         */

        Collections.sort(urunler);
        System.out.println(urunler); //[Cay, Cokokrem, Ikram, Nutella]

        System.out.println(urunler); //[Cay, Cokokrem, Ikram, Nutella]
        System.out.println(urunler2); //[Nutella, Ikram]
        urunler2.remove(0);
        urunler2.add(0, "Cay");
        urunler2.add(1, "Cokokrem");
        urunler2.add(3, "Nutella");
        System.out.println(urunler2); //[Cay, Cokokrem, Ikram, Nutella]

        //==== List - equals methodu ====

        System.out.println(urunler); //[Cay, Cokokrem, Ikram, Nutella]
        System.out.println(urunler2); //[Cay, Cokokrem, Ikram, Nutella]

        System.out.println(urunler.equals(urunler2)); //true

        /*
        Eger siralama farkli olsaydi, once Collections.sort(urunler)
        ve Collection.sort(urunler2) yapmak durumunda olacaktik, sonra
        equals() methodunu kullanacaktik, eger siralama ayni degilse
        equals() methodunun sonucu false olurdu.
         */

        //==== List'e Arrayden deger atama ====

        /*
        List'e bir eleman eklemek icin her defasinda add()
        yapmak durumundayiz.Fakat liste tek tek eleman eklemek yerine,
        bir array olusturup, olusturdugumuz array'i list'e tasiyabiliriz.
        Bunun iki yolu vardir. Birincisi for loop ile
        ikincisi Arrays.asList() methodu ile.
         */

        //For Loop ile List'e Arrayden deger atama

        Integer[] arr = {2, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0};
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            numbers.add(arr[i]);
        }
        System.out.println("For loop ile Array'e deger atama : " + numbers);
        //For loop ile Array'e deger atama : [2, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0]

        //Arrays.asList ile List'e deger atama

        List<Integer> numbers2 = Arrays.asList(arr);
        System.out.println("Arrays.asList ile List'e deger atama : " + numbers2);
        //Arrays.asList ile List'e deger atama : [2, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0]

        numbers.add(5); //bunu direk yazdirirsak true donuyor
        System.out.println("For loop ile deger atadigimiz Array'e add() methodu ile deger atama : " + numbers);
        //For loop ile deger atadigimiz Array'e add() methodu ile deger atama : [2, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0, 5]

        numbers2.add(5);
        System.out.println("Arrays.asList ile deger atadigimiz List'e add() methodu ile deger atama : " + numbers2);
        //UnsupportedOperationException

    }
}
