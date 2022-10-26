package day03_scanner;

import java.util.Scanner;

public class C07_KendiDenemem {
    public static void main(String[] args) {
        /* bir onceki soruyu tek seferde kullanicidan alarak yapiniz*/
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isim, soyisim, ve yasinizi giriniz");
        String isim= scan.next();
        String soyisim= scan.next();
        int yas= scan.nextInt();
        System.out.println("Kullanici bilgileri :" +isim+ " " +soyisim+ " " +yas);
    }
}
