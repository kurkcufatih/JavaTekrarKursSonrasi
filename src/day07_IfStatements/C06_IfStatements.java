package day07_IfStatements;

import java.util.Scanner;

public class C06_IfStatements {
    public static void main(String[] args) {
        //Kullaniciya yasini sorun, eger yas 65’den kucuk ise
        // “emekli olamazsin, calismalisin”,
        // 65’e esit veya buyukse “Emekli olabilirsin” yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas = scan.nextInt();
        if (yas < 0){
            System.out.println("lutfen gecerli bir yas giriniz");
        } else if (yas<65){
        System.out.println("Emekli olamazsin, " + (65 - yas) + " yil daha calismalisin");
    } else {
        System.out.println("Emekli olabilirsin");
        }
    }
}