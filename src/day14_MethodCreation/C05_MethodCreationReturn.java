package day14_MethodCreation;

import java.util.Scanner;

public class C05_MethodCreationReturn {
    public static void main(String[] args) {

        /*Eger bir class'in icerisinde herhangi bir hesaplama yapip
        bunu da kalici olarak saklamak istersek kodumuzu sade ve
        anlasilir tutmak icin islemi bir metod'da yapip sonucunu main
        method'C01_I donusturebiliriz.
        Bu durumda return type'i void olamayan bir metodun sonucunu main
        method'da bir variable'C01_I atama yaparsak programin geri kalaninda
        bu yeni degeri kullanma sansimiz olur
         */
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

    public static String tarihAl() {
        String tarih = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("yil giriniz");
        int yil = scan.nextInt();
        if (yil > 1900 || yil < 2100) {
            tarih = yil + "-";
        } else {
            System.out.println("yil icin gecerli bir sayi yazmalisiniz (1900-2100)");
        }
        System.out.println("kacinci ay oldugunu tam sayi olarak yaziniz");
        int ay = scan.nextInt();
        if (ay <= 0 || ay > 12) {
            System.out.println("Ay no 1-12 arasinda olmali");
        } else if (ay < 10) {
            tarih = tarih + "0" + ay + "-";
        } else {
            tarih = tarih + ay + "-";
        }
        System.out.println("lutfen ayin kacinci gunu oldugunu tam sayi olarrak gitiniz");
        int gun = scan.nextInt();
        if (gun <= 0 || gun > 31) {
            System.out.println("gun no olarak 1-30 arasinda sayi girilmelidir");
        } else if (gun < 10) {
            tarih = tarih + "0" + gun;
        } else {
            tarih = tarih + gun;
        }
        return tarih;
    }


    static String sehirAl() {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen sehir adi giriniz");
        String sahirAdi=scan.next().toUpperCase();
        return sahirAdi;
    }
}
