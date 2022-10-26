package day21_Arrays;

public class C01_Array_MaxSayiyiBulma {
    /* Soru 1- Verilen bir int array’deki en
    buyuk sayiyi yazdiran bir method olusturun.
     */

    public static void main(String[] args) {
        int [] sayilar={3,5,7,1,4,9,5,2};
        maxSayiyiYazdir(sayilar);
    }

    public static void maxSayiyiYazdir(int[] sayilar) {
        int maxSayi=sayilar[0]; //maximum sayiya deger atamak icin ilk indexi atadik. Ilk elemani deger olarak atatik, yani 3'u.
        for (int i = 1; i <sayilar.length ; i++) {
           // zaten 0'inci elemani ustte atadigimiz icin int i'yi 1 den baslattik.
           if (sayilar[i]>maxSayi){
               maxSayi=sayilar[i];
           }
        }

        System.out.println("Array'deki en buyuk sayi: " + maxSayi);
    }

}
