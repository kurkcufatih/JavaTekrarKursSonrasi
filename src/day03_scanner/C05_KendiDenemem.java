package day03_scanner;

import java.util.Scanner;

public class C05_KendiDenemem {
    public static void main(String[] args) {
        //kullanicidan iki syai alip sayilarin carpimini yazdirin//
    Scanner scan=new Scanner(System.in);
        System.out.println("Birinci sayiyi giriniz");
        double sayi1= scan.nextDouble();
        System.out.println("Ikinci sayiyi giriniz");
        double sayi2=scan.nextDouble();
        System.out.println("Iki sayinin carpimi :" +sayi1*sayi2);
    }
}
