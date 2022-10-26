package day18_While_doWhileLoop;

import java.util.Scanner;

public class C01_KendiCalismam {
    /*
       Kullanicidan baslangic ve bitis harflerini alin
       ve baslangic harfinden baslayip bitis harfinde biten
       tum harfleri buyuk harf olarak ekrana yazdirin
       Kullanicinin hata yapmadigini farz edin
        */
    public static void main(String[] args) {
        char ilkharf='a';
        char sonharf='z';
        String tumHarfler="";

        while (ilkharf<=sonharf){
            tumHarfler=(ilkharf+"").toUpperCase();
            System.out.println(tumHarfler + " ");
            ilkharf++;
        }


    }
}
