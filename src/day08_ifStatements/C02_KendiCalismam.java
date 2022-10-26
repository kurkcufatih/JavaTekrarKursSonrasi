package day08_ifStatements;

import java.util.Scanner;

public class C02_KendiCalismam {
    public static void main(String[] args) {
        //Kullanicidan 100 uzerinden notunu isteyin.
        // Not'u harf sistemine cevirip yazdirin.
        // 50’den kucukse "D",
        // 50-60 arasi "C",
        // 60-80 arasi "B",
        // 80’nin uzerinde ise "A"
        //geversiz not girildiginde uyari verelim
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 0'dan buyuk, 100'den kucuk bir not giriniz");
        int sayi = scan.nextInt();
        if (sayi >= 0 && sayi < 50) {
            System.out.println("D");
        } else if (sayi >= 50 && sayi < 60) {
            System.out.println("C");
        } else if (sayi >= 60 && sayi < 80) {
            System.out.println("B");
        } else if (sayi >= 80 && sayi <= 100) {
            System.out.println("A");
        } else {
            System.out.println("Lutfen gecerli bir not giriniz");
        }
    }
}
