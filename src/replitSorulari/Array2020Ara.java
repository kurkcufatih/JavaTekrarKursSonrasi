package replitSorulari;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array2020Ara {
    /*Yazılan değerin array içerisinde arayan Java Kodu yazınız.

    Array: [1551,1223,1443,1267,1789,1023,2020]

    Aranan Değer:2020
    Beklenen Çıktı:**True**
    Aranan Değer:2010
    Beklenen Çıktı :**False**
     */

    public static void main(String[] args) {

     /*   int[] arr = {1551, 1223, 1443, 1267, 1789, 1023, 2020};
        int aranansayi = 2020;
        boolean sonuc1 = Arrays.binarySearch(arr, aranansayi) > 0;
        System.out.println("Beklenen Çıktı :"+"**"+sonuc1+"**");
        boolean sonuc2 = Arrays.binarySearch(arr, 2010) > 0;
        System.out.println("Beklenen Çıktı :"+"**"+sonuc2+"**");

      */


        int[] arrayim={20, 30, 25, 35, -16, 60, -100 };
        int toplam=0;
        double  sonuc=0;

        for(int each:arrayim){
            toplam=toplam+each;
            System.out.println(toplam);
        }
        sonuc=toplam/(arrayim.length);
        System.out.println("Array Sayilarinin ortalamasi :"+ sonuc);
    }
}


