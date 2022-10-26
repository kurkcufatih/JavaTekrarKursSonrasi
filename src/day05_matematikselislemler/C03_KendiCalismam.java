package day05_matematikselislemler;

import java.util.Scanner;

public class C03_KendiCalismam {
    //kullanicida dort basamakli bir sayi alin ve rakamlar toplamini bulup yazdirin
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen uc haneli bir sayi giriniz");
        int sayi= scan.nextInt();
        int birlerbasamagi=0;
        int toplam=0;
        int ilksayi=sayi;

        birlerbasamagi=sayi%10;
        toplam+=birlerbasamagi;
        sayi/=10;

        birlerbasamagi=sayi%10;
        toplam+=birlerbasamagi;
        sayi/=10;

        birlerbasamagi=sayi%10;
        toplam+=birlerbasamagi;
        sayi/=10;

        System.out.println(ilksayi +" sayisinin rakamlar toplami : " +toplam + "'dir");

    }
}
