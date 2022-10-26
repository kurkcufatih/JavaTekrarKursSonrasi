package GrupCalismalari;

import java.util.Scanner;
public class diamond {
    public static void main(String[] args) {
        // 5-----Aşağıdaki elmas deseni görüntüsünü çizen java kodunu yazınız.
        /*  Beklenen Çıktı:
         *
         ***
         *****
         *******
         *********
         ***********
         *************
         ***********
         *********
         *******
         *****
         ***
         *
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi= scan.nextInt();
        for (int i = 1; i <=sayi ; i++) {
            for (int j = sayi; j >i ; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <=2*i-1 ; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i = sayi-1; i >=1 ; i--) {
            for (int j = sayi; j >i ; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <=2*i-1 ; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}