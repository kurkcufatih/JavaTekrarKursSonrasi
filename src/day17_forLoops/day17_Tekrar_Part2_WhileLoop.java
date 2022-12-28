package day17_forLoops;

import java.util.Scanner;

public class day17_Tekrar_Part2_WhileLoop {
    public static void main(String[] args) {

        //==== WHILE LOOP ====

        //20'den 50'ye kadar cift sayilari yazdiralim

        int bas = 20;
        int bitis = 50;
        while (bas <= bitis) {
            if (bas % 2 == 0) {
                System.out.print(bas + " ");
            }
            bas++; //eger bas++ yapmazsak sonsuz donguye giriyor
        }




        /*
        Kullanicidan toplamak uzere sayilar alin
        sayiarin toplami 500'u gecince (500 dahil)
        sayilarin ve kac sayi toplandigini
        su sekilde yazdirin;
        13 sayi girdiniz ve toplami 567
         */

        int toplam = 0;
        int sayiMiktari = 0;
        int sayi = 0;

        Scanner scan = new Scanner(System.in);
        while (toplam < 500) {
            System.out.println("Lutfen sayi giriniz");
            sayi = scan.nextInt();
            toplam += sayi;
            sayiMiktari++;
        }
        System.out.println("Toplamda " + sayiMiktari + " sayi girdiniz ve girdiginiz sayilarin toplami " + toplam);


        /*
        Kullanicidan bir sifre girmesini isteyin.
        Asagidaki sartlari sagliyorsa
        “Sifre basari ile tanimlandi”,
        sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        ve basarili sifre girinceye kadar tekrar sifre girmesini isteyin
        - Ilk harf buyuk harf olmali
        - Son harf kucuk harf olmali
        - Sifre bosluk icermemeli
        - Sifre uzunlugu en az 8 karakter olmali
         */

        Scanner scan2 = new Scanner(System.in);
        String sifre = "";
        boolean sifreBasariliMi = false;
        int kontrol = 0;
        while (!sifreBasariliMi) {
            System.out.println("Lutfen bir sifre giriniz");
            sifre = scan2.nextLine();

            if (sifre.charAt(0) >= 'A' && sifre.charAt(0) <= 'Z') {
                kontrol++;
            } else {
                System.out.println("Ilk harf buyuk olmali");
            }
            if (sifre.charAt(sifre.length() - 1) >= 'a' && sifre.charAt(sifre.length() - 1)<= 'z') {
                kontrol++;
            } else {
                System.out.println("Son harf kucuk olmali");
            }
            if (sifre.contains(" ")) {
                System.out.println("Sifre bosluk icermemeli");
            } else {
                kontrol++;
            }
            if (sifre.length() >= 8) {
                kontrol++;
            } else {
                System.out.println("Sifre en az 8 karakterden olusmali");
            }
            if (kontrol == 4) {
                System.out.println("Sifre basarili sekilde olusturuldu");
                sifreBasariliMi = true;
            } else {
                System.out.println("Sifre basarisiz");
                kontrol = 0;
            }

        }
    }
}
