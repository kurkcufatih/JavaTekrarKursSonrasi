package day09_TernaryOperator;

import java.util.Scanner;

public class C03_KendiCalismam {
    //kullanicidan bir sayi isteyin eger sayi pozitif ise
    // sayiyi yazdirin,sayi sifir veya negatif ise, bir sayi daha isteyin ve ikisinin carpimini yazdirin

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        double sayi = scan.nextDouble();


        if (sayi >= 0) {
            System.out.println(sayi);
        } else{
            System.out.println("Lutfen bir sayi giriniz");
            double sayi2 = scan.nextDouble();
            System.out.println(sayi * sayi2);
        }
    }
}
