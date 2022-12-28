package day21_Arrays;

import java.util.Scanner;

public class day21_Tekrar_Arrays {
    public static void main(String[] args) {

        //==== Array'deki en buyuk sayiyi yazdirma

        ArrayIleMaxSayiyiBulma();


        int sayilar[] = {10, 36, 28, 93, 2};
        int maxSayi = sayilar[0]; //ilk degeri maximumSayiya atadik
        for (int i = 1; i < sayilar.length; i++) { // zaten 0'inci elemani ustte atadigimiz icin int i'yi 1 den baslattik.
            if (maxSayi < sayilar[i]) {
                maxSayi = sayilar[i];
            }
        }
        System.out.println(maxSayi); //93


        //==== Array icerisinde contains() ile arama yapma

        /*Soru 3- Kullanicidan alinan bir ismin,
        verilen Array'de olup olmadigini kontrol edip bize
        bize true veya false sonucu donen bir method olusturun.
        */

        String[] names = {"Basak", "Nurullah", "Fatih", "Adem", "Enes"};
        Scanner scan = new Scanner(System.in);
        System.out.println("Aradiginiz ismi giriniz");
        String arananIsim = scan.next();

        boolean sonuc = contains(names, arananIsim);
        if (sonuc) {
            System.out.println("Girilen isim listede var");
        } else {
            System.out.println("Girilen isim listede yok");
        }


        //==== Array'deki en uzun ve en kisa kelimeyi yazdirma

        /*Soru 2- Verilen String bir array’de en uzun ve en
        kisa String’leri yazdiran bir method olusturun
        */

        String[] isimler = {"Erdal", "Onur", "Mehmet", "Hayrullah", "Mihrican"};
        enUzunVeKisIsim(isimler);

    }
    private static void enUzunVeKisIsim(String[] isimler) {
        String uzunKelime = "";
        String kisaKelime = "";
        uzunKelime = isimler[0];
        kisaKelime = isimler[0];
        for (int i = 1; i < isimler.length; i++) {
            if (uzunKelime.length() < isimler[i].length()) {
                uzunKelime = isimler[i];
            }
            if (kisaKelime.length() > isimler[i].length()) {
                kisaKelime = isimler[i];
            }
        }
        System.out.println(uzunKelime); //Hayrullah
        System.out.println(kisaKelime); //Onur

    }
    private static boolean contains(String[] names, String arananIsim) {
        boolean sonucMethod = false;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(arananIsim)) {
                sonucMethod = true;
            }
        }
        return sonucMethod;
    }
    public static void ArrayIleMaxSayiyiBulma() {
        int sayilar[] = {20, 93, 75, 88, 192, 22};
        int maxSayi = sayilar[0];
        for (int i = 1; i < sayilar.length; i++) {
            if (maxSayi < sayilar[i]) {
                maxSayi = sayilar[i];
            }
        }
        System.out.println(maxSayi); //192
    }
}
