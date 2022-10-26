package day03_scanner;

import java.util.Scanner;

public class C08_KendiDenemem {
    public static void main(String[] args) {
        //kullanicidan ismini alip ilk harfini buyuk harf olarak yazdirin//
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim= scan.next();
        System.out.println(isim.toUpperCase().charAt(0));

        /* 2. Yontem
        char isminIlkharfi=scan.next().toUpperCase().charAt(0);
        System.out.println(isminIlkharfi);
         */

    }
}
