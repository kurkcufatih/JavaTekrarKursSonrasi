package day03_scanner;

import java.util.Scanner;

public class C04_KendiDenemem {
    public static void main(String[] args) {
        //kullanicidan ismini isteyip, girilen ismi, ismini:... seklinde yazdirin//
        //insanlarin dunyasindan kod'larimizin bulndugu klasa deger almak icin scanner class'ini kullaniriz.//
        //1-scanner objesi olusturalim//
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim=scan.next();
        System.out.println(("Kullanici ismi :" +isim));


    }
}
