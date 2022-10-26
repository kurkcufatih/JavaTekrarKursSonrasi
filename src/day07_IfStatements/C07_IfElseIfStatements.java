package day07_IfStatements;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class C07_IfElseIfStatements {
    public static void main(String[] args) {
        // bir onceki soruda kullanici negatif deger girerse uyaralim
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");
        int yas=scan.nextInt();
        if (yas<0){
            System.out.println("Lutfen gecerli bir yas yaziniz");
        }
     else if (yas<65){
        System.out.println("emekli olamazsin, "+(65-yas)+" yil daha calismalisin");
    }
     else {
        System.out.println("Emekli olabilirsin");
    }
    }
}
