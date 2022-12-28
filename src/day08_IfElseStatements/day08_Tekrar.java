package day08_IfElseStatements;

import java.util.Scanner;

public class day08_Tekrar {
    public static void main(String[] args) {
   /*
        // Soru 4) Kullanicidan bir ucgenin uc kenar uzunlugunu alin
        //			eger uc kenar uzunlugu birbirine esit ise ekrana �Eskenar ucgen� yazdirin.
        //			Diger durumlarda ekrana  �Eskenar degil� yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenar uzunluklarini yaziniz, ilk kenar uzunlugunu girdikten sonra diger kenar uzunluklarini girmek icin enter'a basiniz");

        double kenar1 = scan.nextDouble();
        double kenar2 = scan.nextDouble();
        double kenar3 = scan.nextDouble();

        if (kenar1==kenar2 && kenar2==kenar3){
            System.out.println("Eskenar ucgen");
        }else System.out.println("Eskenar ucgen degil");


        // Soru 7) Kullanicidan 100 uzerinden notunu isteyin.
        //			Not�u harf sistemine cevirip yazdirin.
        //			50�den kucukse �D�,
        //			50 ye esit ve buyuk  ve 60 dan kucuk ise �C�,
        //			60 a esit ve buyuk  ve 80 dan kucuk ise �B�,
        //			80 ve uzerinde ise �A�


        Scanner scan2 = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");

        double not = scan2.nextDouble();
        if (not >= 80 && not<=100) {
            System.out.println("notunuz A ");
        }
        if (not >= 60 && not < 80) {
            System.out.println("notunuz B ");
        }
        if (not >= 50 && not < 60) {
            System.out.println("notunuz C ");
        }
        if (not < 50 && not >= 0) {
            System.out.println("notunuz D ");
        }
        if (not < 0 || not > 100) {
            System.out.println("Lutfen 0 ile 100 arasinda bir not giriniz");
        }
        */

        // Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
        // calisan erkekse 65 yasindan buyukse emekli olabilir


        Scanner scan3 = new Scanner(System.in);
        System.out.println(" Lutfen cinsiyetinizi giriniz, Erkek icin E kadin icin K");
        char cinsiyet = scan3.next().toUpperCase().charAt(0);

        System.out.println("Lutfen yasiniiz giriniz");
        double yas = scan3.nextDouble();

        if (cinsiyet=='K'){
            if (yas>=60){
                System.out.println("Emekli olabilir");
            } else System.out.println("Emekli olmaniz icin "+(60-yas)+" daha beklemeniz gerekiyor");
        }
        if (cinsiyet=='E'){
            if (yas>=65){
                System.out.println("Emekli olabilir");
            }else System.out.println("Emekli olmaniz icin "+(65-yas)+" yil daha beklemeniz gerekiyor");
        }

    }
}

