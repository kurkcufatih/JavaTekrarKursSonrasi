package day23_ArrayLists;
import java.util.ArrayList;
import java.util.List;
        public class C03_indexOf {
            public static void main(String[] args) {
                List<String> urunler= new ArrayList<>();
                urunler.add("Nutella");
                urunler.add("Ikram");
                urunler.add("Cekirdek");
                urunler.add("Cay");
                System.out.println(urunler);
                System.out.println(urunler.indexOf("Ikram")); // 1
                System.out.println(urunler); // [Nutella, Ikram, Cekirdek, Cay]
                System.out.println(urunler.lastIndexOf("Ikram")); //1

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
                urunler.add("Ikram");
                System.out.println(urunler);//  [Nutella, Ikram, Cekirdek, Cay, Ikram]
                System.out.println(urunler.indexOf("Ikram")); // 1
                System.out.println(urunler.lastIndexOf("Ikram")); // 4
                System.out.println(urunler.indexOf("Hobby")); // -1
                System.out.println(urunler.lastIndexOf("Hobby")); // -1
            }
        }