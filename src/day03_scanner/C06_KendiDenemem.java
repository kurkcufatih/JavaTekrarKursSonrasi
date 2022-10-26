package day03_scanner;

import java.util.Scanner;

public class C06_KendiDenemem {
    public static void main(String[] args) {
      //kullanicidan ismini soyismini ve yasini alip girilen bilgiler = seyfi capar 34 seklinde yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String kullaniciIsmi= scan.next();
        System.out.println("Lutfen soyisminizi giriniz");
        String kullaniciSoyismi= scan.next();
        System.out.println("Lutfen yasinizi giriniz");
        int yas= scan.nextInt();
        System.out.println(kullaniciIsmi+ " " +kullaniciSoyismi+ " " +yas);
    }
}
