package day05_matematikselislemler;

import java.util.Scanner;

public class C03_KendiDenemem {
    public static void main(String[] args) {
        //kullanicida dort basamakli bir sayi alin ve rakamlar toplamini bulup yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen dort basamakli bir rakam giriniz");
        int rakam = scan.nextInt();
        int birlerBasamagi = 0;
        int rakamlarToplami = 0;
        int ilkGirilenSayi = rakam;
        birlerBasamagi = rakam % 10;
        rakamlarToplami += birlerBasamagi;
        rakam /= 10;

        birlerBasamagi = rakam % 10;
        rakamlarToplami += birlerBasamagi;
        rakam /= 10;

        birlerBasamagi = rakam % 10;
        rakamlarToplami += birlerBasamagi;
        rakam /= 10;

        birlerBasamagi = rakam % 10;
        rakamlarToplami += birlerBasamagi;
        rakam /= 10;
        System.out.println(ilkGirilenSayi+ "sayisinin rakamlar toplami" +rakamlarToplami);

    }
}
