package day18_While_doWhileLoop;

import java.util.Scanner;

public class C02_KendiCalismam {
    /*
   Kullanicidan bir sayi alin ve bu sayinin
   rakamlari toplamini yazdirin
    */
    public static void main(String[] args) {

        int sayi=55;

        int rakamlarToplami = 0;
        int birlerbasamagi = 0;
        int temp=sayi;

        while (temp > 0) {
            birlerbasamagi= temp % 10;
            rakamlarToplami+= birlerbasamagi;
            temp/=10;
        }
        System.out.println("Girilen sayinin rakamlar toplami: " + rakamlarToplami);
    }
}
