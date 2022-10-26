package day20_Arrays;

import java.util.Arrays;

public class C02_KendiCalismam {

    public static void main(String[] args) {
        int sayilar[]={3,4,5};
        sayilar[0]=4;
        sayilar[1]=5;
        sayilar[2]=6;
        System.out.println(Arrays.toString(sayilar));


        String sinifList[]={"Ahmet", "Mehmet", "Ayse", "Hayriye"};
        sinifList[3]="Fatma";
        System.out.println(Arrays.toString(sinifList));
        System.out.println(sinifList[2]);

    }
}
