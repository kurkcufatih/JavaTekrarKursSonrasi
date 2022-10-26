package day03_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        //kullanicidan iki syai alip sayilarin carpimini yazdirin//
        //1.adim- scanner olusturma
        Scanner scan=new Scanner(System.in);
        //2.adim- bilgi vermek
        System.out.println("lutfen ilk sayiyi girin");
       double sayi1= scan.nextDouble();
        System.out.println("lutfen ikinci sayiyi giriniz");
        double sayi2= scan.nextDouble();
        System.out.println("girilen sayilarin carpimi: "+sayi1*sayi2);

    }
}
