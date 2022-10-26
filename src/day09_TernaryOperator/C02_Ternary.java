package day09_TernaryOperator;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        double sayi= scan.nextDouble();
        // Eger  ternary icinde sonuclar farkli data turlerinde ise
        //atama yapmayiz, sadece yazdirabilirz.
        //Double sonuc=sayi>0? "sayi pozitif" : (sayi*sayi);
        System.out.println(sayi>0?"sayi pozitif" :(sayi*sayi));

    }
}
