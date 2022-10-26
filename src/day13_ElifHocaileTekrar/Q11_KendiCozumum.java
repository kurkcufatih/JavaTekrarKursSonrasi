package day13_ElifHocaileTekrar;

import java.util.Scanner;

public class Q11_KendiCozumum {
    /*
    not hesaplayici
            A => 90 ~100
            B => 80 ~ 89
            C => 70 ~ 79
            D => 60 ~ 69
            F =>  0 ~ 59
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz : ");

        int sayi= 85;
        boolean gecerliNot = sayi>= 0 && sayi<=100;

        if (sayi >= 90 && sayi <= 100) {
            System.out.println("A");
        } else if (sayi < 89 && sayi >= 80) {
            System.out.println("B");
        } else if (sayi < 79 && sayi >= 70) {
            System.out.println("C");
        } else if (sayi < 69 && sayi >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
