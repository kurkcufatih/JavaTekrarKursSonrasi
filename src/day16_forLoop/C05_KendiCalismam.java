package day16_forLoop;

import java.util.Scanner;

public class C05_KendiCalismam {
    public static void main(String[] args) {
        /*Kullanicidan iki sayi isteyin. Girilen sayilar ve
        aralarindaki tum tamsayilari toplayip, sonucu yazdiran
        bir program yaziniz*/
        Scanner scan=new Scanner(System.in);
        System.out.println("Lufen birinci sayiyi giriniz");
        double sayi1=scan.nextInt();
        System.out.println("Lutfen ikinci sayiyi giriniz");
        double sayi2= scan.nextInt();
sayilarToplami(sayi1,sayi2);
    }

    public static void sayilarToplami(double sayi1, double sayi2) {
        double topla=0;
        if (sayi1<=sayi2){
            for (double i = sayi1; i <=sayi2 ; i++) {
                topla+=i; }
        } else  {
                for (double i = sayi2; i <=sayi1 ; i++) {
                    topla+=i;
                }
            }
        System.out.println("Girdiginiz degeler ve aralarindaki degelerler toplami: " + topla);
        }
    }

