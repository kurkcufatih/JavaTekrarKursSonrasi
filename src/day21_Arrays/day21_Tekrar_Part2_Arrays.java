package day21_Arrays;

import java.util.Arrays;

public class day21_Tekrar_Part2_Arrays {
    public static void main(String[] args) {


        //Array'de split() methodunu kullanma

        String str = "Java ne kadar guzel";

        //  str.split(" "); // bu bana string bir array donecek, nasil gorebilirim?
        //  bir atama veya sout yapmam gerekiyor.

        String[] kelimeler = str.split(" ");
        System.out.println(Arrays.toString(kelimeler)); //[Java, ne, kadar, guzel]

        String[] kelimelerNe = str.split("ne");
        System.out.println(Arrays.toString(kelimelerNe)); //[Java ,  kadar guzel]

        String[] kelimelerE = str.split("e");
        System.out.println(Arrays.toString(kelimelerE)); //[Java n,  kadar guz, l]

        String[] karakterler = str.split("");
        System.out.println(Arrays.toString(karakterler));
        //[J, a, v, a,  , n, e,  , k, a, d, a, r,  , g, u, z, e, l]


        //==== Array'e element ekleme ====


        /*
        Soru 5- Verilen bir array’e yeni
        bir element ekleyen method olusturun
        */

        String[] sinifListesi = {"Ali Can", "Nida Yucedal", "Musa Yaman"};
        String eklenecekIsim = "Murat Babayigit";

        sinifListesi = elemanEkle(sinifListesi, eklenecekIsim);
        System.out.println(Arrays.toString(sinifListesi));

        //==== Array'de short() methodunu kullanma ====

        int[] sayilar = {5, 7, 1, 6, 4, 3, 9};
        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));

        //==== Array'de binarySearch() methodunu kullanma ====

        String[] harfler = {"Y", "B", "D", "G", "O", "A"};
        String arananHarf = "Y";
        Arrays.sort(harfler);
        System.out.println(Arrays.toString(harfler)); //[A, B, D, G, O, Y]
        System.out.println(Arrays.binarySearch(harfler, arananHarf)); //5

        //==== Array'in elemanlarini toplama

        // Soru 2: Verilen bir array'in tum elemanlarini
        // toplayan bir program yazalim.

        int arr[] = {3, 5, 8, 5, 2, 4};
        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {
            toplam += arr[i];
        }
        System.out.println(toplam); //27
    }

    private static String[] elemanEkle(String[] sinifListesi, String eklenecekIsim) {

        String[] yeniSinifListesi = new String[sinifListesi.length + 1];

        for (int i = 0; i < sinifListesi.length; i++) {
            yeniSinifListesi[i] = sinifListesi[i];
        }

        yeniSinifListesi[yeniSinifListesi.length - 1] = eklenecekIsim;
        return yeniSinifListesi;

    }
}
