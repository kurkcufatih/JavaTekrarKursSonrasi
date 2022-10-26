package day21_Arrays;

import java.util.Arrays;

public class C01_KendiCalismam {
    public static void main(String[] args) {

         /* Soru 1- Verilen bir int array’deki en
    buyuk sayiyi yazdiran bir method olusturun.
     */

        int[] sayilar = {3, 5, 7, 1, 4, 9, 5, 2};
int enKucukSayi=sayilar[0];
int enBuyukSayi=sayilar[0];
        for (int i = 1; i <sayilar.length ; i++) {
            if (sayilar[i]<enKucukSayi){
                enKucukSayi=sayilar[i];
            }
            if (sayilar[i]>enBuyukSayi){
                enBuyukSayi=sayilar[i];
            }
        }System.out.println(enKucukSayi);
        System.out.println(enBuyukSayi);
    }
}