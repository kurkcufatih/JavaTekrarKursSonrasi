package day05_matematikselislemler;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C03_RakamlarToplami {
    public static void main(String[] args) {
        //kullanicida dort basamakli bir sayi alin ve rakamlar toplamini bulup yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 4 basamakli pozitif bir tamsayi giriniz");
        int sayi= scan.nextInt(); // kullanicinin 5267 sayisini girdigini varsayalim
        int birlerBasamagi=0;
        int rakamlarToplami=0;
        int ilkGirilenSayi=sayi;
        // suanda sayi 5367 birler basamagi=0, rakamlar toplami=0
        birlerBasamagi=sayi%10; // 7
        rakamlarToplami += birlerBasamagi;
        sayi /=10;
        // suanda sayi 526, birlerbasamagi 7, rakamlar toplami 7
        birlerBasamagi=sayi%10; // 6
        rakamlarToplami +=birlerBasamagi;
        sayi /=10;
        // suanda sayi 52, birlerbasamagi 5, rakamlartoplami 13
        birlerBasamagi= sayi%10; //2
        rakamlarToplami +=birlerBasamagi; //7+6+2
        sayi /=10; //5
        // suanda sayi 5, birlerbasamagi 2, rakamlar toplami 15,
        birlerBasamagi = sayi%10; //5
        rakamlarToplami +=birlerBasamagi; //20
        sayi/=10; // 0
        // suanda sayi 0, birlerbasamagi 5, rakamlar toplaminin son degeri 20.
        System.out.println(ilkGirilenSayi + " sayisinin rakamlar toplami :" +rakamlarToplami);
    // eger 5 basamakli rakam yazarsak son 4 rakami toplar, eger 4 basamaktan az yazarsak sikinti olmaz dogru sonuc verir.

    }
}
