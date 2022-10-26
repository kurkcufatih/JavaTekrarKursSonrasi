package GrupCalismalari;

public class ArrayMaxSayiyiYazdir {
     /* Soru 1- Verilen bir int array’deki en
    buyuk sayiyi yazdiran bir method olusturun.
     */

    public static void main(String[] args) {
        int[] sayilar = {3, 5, 7, 1, 4, 9, 5, 2};
        int ilkSayi = 3;
        for (int i = 3; i < sayilar.length; i++) {
            if (sayilar[i] > ilkSayi) {
                ilkSayi = sayilar[i];
            }
        }
        System.out.println("Arraydeki max sayi : " +ilkSayi);

    }
}