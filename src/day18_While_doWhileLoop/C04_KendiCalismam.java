package day18_While_doWhileLoop;

import java.util.Scanner;

public class C04_KendiCalismam {
    /*
       Kullanicida tam sayilar alin
       kullanici cift sayi girdigi
       muddecte sayilari yazdirin
       tek sayi girdiginde islemi bitirin
        */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi = 0;

        while (sayi % 2 == 0) {
            System.out.println("Lutfen bir tam sayi giriniz");
            sayi=scan.nextInt();
            if ((sayi % 2 == 0)) {
                System.out.println("Girilen sayi cift sayi: " + sayi);
            } else {
                System.out.println("Girilen tek sayi");
            }
        }

        do{
            System.out.println("Lutfen bir sayi giriniz");
            sayi= scan.nextInt();
            if (sayi%2==0){
                System.out.println("girilen sayi cift: " + sayi);
            } else {
                System.out.println("Girilen sayi tek");
            }
        }while(sayi%2==0);

    }
}