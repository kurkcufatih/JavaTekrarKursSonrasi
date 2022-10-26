package GrupCalismalari;

import java.util.Scanner;

public class replitDakikaYilGun {
    public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            System.out.println("Lutfen dakika giriniz");
            int minute=scan.nextInt();
            int yil=525960; //dakika
            int gun=1440; //dakika
            int kalan=((minute/yil)/gun);
            System.out.println(minute + " dakika yaklaşık " +(minute/yil) +" yil "+ kalan + " gündür");
        }
    }
