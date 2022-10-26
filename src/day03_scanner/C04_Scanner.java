package day03_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        //kullanicidan ismini isteyip, girilen ismi, ismini:... seklinde yazdirin//
        //insanlarin dunyasindan kod'larimizin bulndugu klasa deger almak icin scanner class'ini kullaniriz.//
        //1-scanner objesi olusturalim//
        Scanner scan=new Scanner(System.in);
        //2-kullaniciya ne istedigimizi soyleyelim//
        System.out.println("lutfen isminizi giriniz");
        //3-olusturdugumuz scan objesi ile kullanicinin girdigi degeri alip olsuturdugumuz uygun variablea atayalim
        String kullaniciIsmi= scan.next();
        System.out.println("isminiz:" + kullaniciIsmi);


    }
}
