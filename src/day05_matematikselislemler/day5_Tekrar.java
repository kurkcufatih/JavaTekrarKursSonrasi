package day05_matematikselislemler;

import java.util.Scanner;

public class day5_Tekrar {
    public static void main(String[] args) {
/*
        //======MODULUS KONUSU======

        // kullanicidan 3 basamakli bir sayi alip
        // rakamlar toplamini yazdiran
        // bir program yaziniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 3 basamakli bir sayi giriniz");
        int sayi = scan.nextInt();
        int rakamlarToplami = 0;

        int rakam = sayi % 10; //3
        rakamlarToplami += rakam;

        sayi /= 10;
        rakam = sayi % 10;
        rakamlarToplami += rakam; //10

        sayi /= 10;

        rakam = sayi % 10;
        rakamlarToplami += rakam; //15

        System.out.println("Girdiginiz 3 basamakli sayisinin rakamlar toplami : " + rakamlarToplami + "'dir");

        //======Kullanicidan 4 basamakli bir sayi alin, aldiginiz sayisinin rakamlar toplamini yazdirin
*/
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli bir sayi giriniz");
        int say1 = scan2.nextInt();

        int rakamlarToplami2 = 0;
        int rakam = 0;
        rakam = say1 % 10;
        rakamlarToplami2 += rakam;
        say1 /= 10;

        rakam = say1 % 10;
        rakamlarToplami2 += rakam;
        say1 /= 10;

        rakam = say1 % 10;
        rakamlarToplami2 += rakam;
        say1 /= 10;

        rakam = say1 % 10;
        rakamlarToplami2 += rakam;
        say1 /= 10;

        System.out.println("Girdiginiz 4 basamakli sayinin rakamlar toplami : " + rakamlarToplami2);


    }
}
