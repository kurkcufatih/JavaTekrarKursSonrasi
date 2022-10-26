package day14_MethodCreation;

import java.util.Scanner;

public class C05_KendiCalismam {
    public static void main(String[] args) {
        //kullanicidan sehir ismini ve dogum tarihini alip
        //bunlari programda kullanacagimiz formatta bize
        //donduren bir method olusturun
        //sehir ismini programimizda buyuk harf olarak
        //tarihi ise 2022-06-30 seklinde kullanmak istiyoruz

        String sehir = sehirAl();
        String tarih = tarihAl();

        System.out.println("Girdiginiz sehir :"+ sehir);
        System.out.println("Girdiginiz tarih :"+ tarih);
    }

    private static String sehirAl() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen sehir adini giriniz");
        String sehir = scan.next().toUpperCase();

    return sehir;
    }


    private static String tarihAl() {
        Scanner scan = new Scanner(System.in);
        String tarih = " ";
        System.out.println("Lutfen yil giriniz");
        int yil = scan.nextInt();
        if (yil > 1900 || yil < 2100) {
            tarih = yil + "-";
        } else {
            System.out.println("Yil icin gecerli bir sayi yazmalisiniz (1900-2100)");
        }
        System.out.println("Lutfen kacinci ay oldugunu tam sayi olarak yaziniz");
        int ay = scan.nextInt();
        if (ay <= 0 || ay > 12) {
            System.out.println("Ay icin gecerli bir sayi yazmalisiniz (1-12)");
        } else if (ay < 10) {
            tarih = tarih + "0" + ay + "-";
        } else {
            tarih = tarih + ay + "-";
        }
        System.out.println("Lutfen ayin kacinci gunu oldugunu yaziniz");
        int gun = scan.nextInt();
        if (gun <= 0 || gun > 31) {
            System.out.println("Gun icin gecerli bir sayi yazmalisiniz (1-31)");
        } else if (gun < 10) {
            tarih = tarih + "0" + gun;
        } else {
            tarih = tarih + gun;
        }
        return tarih;
    }
}

