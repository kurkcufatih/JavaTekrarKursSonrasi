package day13_ElifHocaileTekrar;

import java.util.Scanner;

public class Q1_KendiCozumum {
    /*
     *  Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
     *
     *   Ex :
     *   input  : 12345
     *   output : 12
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen dort basamakli bir sayi giriniz");
        int sayi= scan.nextInt();
        int ilkIki=sayi/1000;
        int sonIki=sayi%100;
        int ilkIkiTop=(ilkIki/10)+(ilkIki%10);
        System.out.println("IlkIkiTop = " + ilkIkiTop);
        int sonIkiTop=(sonIki/10)+(sonIki%10);
        System.out.println("SonIkiTop = " + sonIkiTop);
        int Toplamlari=(ilkIkiTop+sonIkiTop);
        System.out.println("Toplamlari =" + Toplamlari);

    }



}



