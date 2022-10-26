package GrupCalismalari;

import java.util.Scanner;

public class Q05_Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen C01_I,b, ve c sayilarini giriniz");
        int a= scan.nextInt();
        int b= scan.nextInt();
        int c= scan.nextInt();

        double sonuc=(double)((a*a)-(b*b))/(3*c);
        System.out.println("C01_I sayisini giriniz : " +a);
        System.out.println("b sayisini giriniz :" +b);
        System.out.println("c sayisini giriniz : " +c);
        System.out.println("sonuc :" +sonuc);

    }
}
