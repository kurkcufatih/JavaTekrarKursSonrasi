package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        /*
        kullanicidan ismini soyismini ve yasini alip girilen bilgiler = seyfi capar 34 seklinde yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        String isim=scan.nextLine();
        System.out.println("lutfen soyisminizi giriniz");
        String soyisim=scan.nextLine();
        System.out.println("lutfen yasinizi giriniz");
        double yas=scan.nextDouble();
        System.out.println("girilen bilgiler = "+isim+" "+soyisim+" "+yas);
    }
}
