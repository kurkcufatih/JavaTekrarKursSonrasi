package day07_IfStatements;

import java.util.Scanner;

public class C05_IfStatements {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir karakter giriniz");
        char harf=scan.next().charAt(0);
        if ((harf>='a' && harf<='z') || (harf>='A' && harf<='Z')){
            System.out.println("Girilen karakter bir harf");
        } else {
            System.out.println("Girilen karakter bir harf degil");
        }
    }
}
