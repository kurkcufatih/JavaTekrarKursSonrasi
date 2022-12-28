package day29_passByValue_immutable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class day29_Tekrar_PassByValue {
    public static void main(String[] args) {


        //==== PASS by Value Methodu ====


        /*
          Birden fazla element iceren array ve arrayList gibi yapilarda da
          passByValue gecerlidir.
          Eger method'da array veya list'in kendisi degistirilirse
          passByValue ozelligi sebebiyle Java degisen degeri degil
          array veya list'in orijinal degerini alir
          Ancak array veya list degistirilmeden
          sadece icindeki elemanlar degistirilirse
          Java obje degismedigi icin(referans ayni),
          ayni array veya list'i bize dondurur
          ancak icindeki elementler degismis olacaktir.
         */

        int[] arr = {3, 5, 7, 9};
        System.out.println(Arrays.toString(arr)); //[3, 5, 7, 9]

        sayilariDegistir(arr);


        //PASSBYVALUE KONUSU INTERVIEW'LERDE SORULAN BIR KONU, NE OLDUGU ILE ILGILI.
        //TESTER ARKADASLAR ICIN AZ ONEMLI AMA DEVELOPERLAR ICIN COK ONEMLI BIR KONU.

        /*
          bir list olusturalim
          iki ayri method'dan birinde
          sadece elemanlari degistirelim
          digerinde yeni bir list atayip,
          ayni sayida yeni eleman ekleyelim
          ve her iki method call'dan sonra kendi listemizi
          main method icerisinde kontrol edelim
         */
        List<String> list = new ArrayList<>();
        list.add("Ahmet");
        list.add("Mehmet");
        list.add("Ali");
        list.add("Kamil");
        System.out.println(list); //[Ahmet, Mehmet, Ali, Kamil]

        elemanlariDegistir(list);
        System.out.println(list); //[Oguz, Berk, Eren, Caner]
        listDegistir(list);
        System.out.println(list); //[Oguz, Berk, Eren, Caner]


        //==== Mutable and immutable classes

        String str = "Yildiz Bank";
        System.out.println(str.toUpperCase());

        str.toLowerCase(); //bu satiri yazdirinca kucultur
        //ustteki satiri gecince artik orjinaline doner.
        //Gecici olarak bir kopya olusturduk kullanirsak kullaniriz
        //kullanmazsak cope gider.

        System.out.println(str);
        str.substring(3, 5);//di sout olmadigi icin yazdirmaz
        //Istedigimiz kadar degisiklik yaparsak yapalim onlari hep kopyalara koyar
        //Orjinali degistirmez cunku String immutable'dir.

        //Java'da String gibi metin ifadelerde kullanabilecegimiz
        //mutable StringBuilder class'i da vardir.


        StringBuilder sb = new StringBuilder("Java Bank");
        System.out.println(sb);
        sb.reverse();
        System.out.println("sb = " + sb); //sb = knaB avaJ

        sb.append(".");
        System.out.println(sb);

        for (int i = sb.length() - 1; i > 0; i--) {
        }
        System.out.println(sb);

        //Immutable class'lar degismiyor.
        //Mutable'lar degisiyor.

        //***String immutable***
        //***StringBuilder mutable***


        //==========
        // Main method'dan diger method'lara veya diger method'lardan main method'a
        // bir variable gonderirseniz Java orjinal variable'lari degil
        // onlarin degerlerini(value) goturur, orjinal variable'in degeri degismez

        int fiyat = 100;
        indirimli10(fiyat);
        indirimli25(fiyat);
        System.out.println(fiyat); //100
        System.out.println(indirimli10(fiyat)); //90
        System.out.println(indirimli25(fiyat)); //75

    }

    private static int indirimli25(int fiyat) {
        fiyat *= 0.75;
        return fiyat;
    }

    private static int indirimli10(int fiyat) {
        fiyat *= 0.90;
        return fiyat;
    }

    private static void listDegistir(List<String> list) {
        list = new ArrayList<>();
        list.add("Ayse");
        list.add("Fatma");
        list.add("Zehra");
        list.add("Hande");
    }

    private static void elemanlariDegistir(List<String> list) {
        list.set(0, "Oguz");
        list.set(1, "Berk");
        list.set(2, "Eren");
        list.set(3, "Caner");
    }

    private static void sayilariDegistir(int[] arr) {
        Random random = new Random();
        arr[1] = random.nextInt(100);
        arr[3] = random.nextInt(100);
        System.out.println(Arrays.toString(arr)); //[3, 18, 7, 63]
    }
}
