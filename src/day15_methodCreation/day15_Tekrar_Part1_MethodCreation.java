package day15_methodCreation;

import java.util.Scanner;

public class day15_Tekrar_Part1_MethodCreation {
    public static void main(String[] args) {
        // kullanicidan ismini ve soyismini isteyin
        // iki farkli method olusturun methodlardan biri girilen kelimeleri
        //   ilk harf buyuk, digerleri kucuk olacak sekilde birlestirsin
        // Ikinci method Isim ve soyismin ilk harfleri buyuk harf,
        //   kalan harfler * olacak sekilde birlestirsin

        // kullaniciya isminin acik olarak yazilmasi veya gizlenmesi tercihi sorun
        // ve programin kalan ksminda isim ve soyismi kullanicinin istedigi sekilde kullanin


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi ve soyisminizi girin, isimden sonra enter'a basiniz");
        String isim = scan.next();
        String soyisim = scan.next();
        System.out.println("isminizin acik sekilde yazilmasini istiyorsaniz 1" +
                "\nIlk harf haric gizli yazilmasini istiyorsaniz 2'e basiniz");
        int tercih = scan.nextInt();
        String birlesmisIsim = null;
        if (tercih == 1) {
            birlesmisIsim = isimAcik(isim, soyisim);
        } else if (tercih == 2) {
            birlesmisIsim = isimGizle(isim, soyisim);
        } else {
            System.out.println("lutfen 1 veya 2'e basiniz");
        }
        System.out.println("kullanicinin tercihi :" + birlesmisIsim);

    }

    public static String isimGizle(String isim, String soyisim) {
        isim = isim.substring(0, 1).toUpperCase() + isim.substring(1).replaceAll("\\w", "*");
        soyisim = soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).replaceAll("\\w", "*");

        return isim + " " + soyisim;
    }

    public static String isimAcik(String isim, String soyisim) {
        isim = isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase();
        soyisim = soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).toLowerCase();
        return isim + " " + soyisim;

    }
}