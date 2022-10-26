package replitSorulari;

import java.util.Scanner;

public class GirilenSayidanSonrakiAsalSayilar {
    public static void main(String[] args) {
        // kullanicinin girdigi sayidan sonraki 10 tane asal sayiyi yazdiriniz
        Scanner scan = new Scanner(System.in);
        System.out.println("sayi giriniz");
        int sayi = scan.nextInt();
        int sayac = 0;
        for (int i = sayi; i < sayi * 2; i++) {
            boolean durum = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    durum = false;
                    break;
                }
            }
            if (durum == true) {
                System.out.println(i);
                sayac++;
                if (sayac == 10) {
                    break;
                }
            }
        }
    }
}

