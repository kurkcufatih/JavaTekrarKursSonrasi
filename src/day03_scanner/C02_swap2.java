package day03_scanner;

import java.util.Scanner;

public class C02_swap2 {
    public static void main(String[] args) {
        //bir onceki swap sorusunu bos kova kullanmadan yapin.
       int sayi1=10;
       int sayi2=20;
       // scan yardimci objedir.
        sayi1=sayi1+sayi1;
        sayi2=sayi2-sayi1;

        System.out.println("sayi 2'in degeri :" +sayi2);
    }
}
