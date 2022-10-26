package GrupCalismalari;

import java.util.Scanner;

public class replitBMIhesaplama {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen kilonuzu kg olarak giriniz");
        int kilo=scan.nextInt();
        System.out.println("Lutfen boyunuzu m olarak yaziniz");
        double boy=scan.nextDouble();
        double BMI= (kilo/(boy*boy));
        if (BMI<18.5){
            System.out.println(BMI + " Zayifsiniz");
        } else if (BMI>18.5 && BMI<25){
            System.out.println(BMI + " kilonuz idealdir");
        } else if (BMI>25 && BMI<30){
            System.out.println(BMI + " şişmansınız");
        }else
            System.out.println(BMI + " Obezsiniz");
    }
}