package day13_ElifHocaileTekrar;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Q04_KendiCozumum {
    public static void main(String[] args) {
        /*
         * Kullanicidan alacaginiz vize2 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Vize 1, Vize 2 ve Final notunuzu giriniz");
        int vize1= scan.nextInt();
        int vize2= scan.nextInt();
        int sonSinav=scan.nextInt();
        int sonNot=((vize1+vize2)*30/100) + (sonSinav*70/100);
        System.out.println(sonNot);
    }
}
