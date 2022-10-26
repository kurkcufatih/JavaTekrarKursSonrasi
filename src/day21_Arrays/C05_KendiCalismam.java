package day21_Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class C05_KendiCalismam {
    public static void main(String[] args) {
        /*Soru 5- Verilen bir array’e
yeni bir element ekleyen method olusturun
 */

        String[] sinifListesi = {"Ali Can", "Nida Yucedal", "Musa Yaman"};
        String eklenecekIsim = "Murat Babayigit";

        yeniEleman(sinifListesi, eklenecekIsim);
    }

    private static void yeniEleman(String[] sinifListesi, String eklenecekIsim) {

        String yeniArray[] = new String[sinifListesi.length + 1];
        for (int i = 0; i < sinifListesi.length ; i++) {
            yeniArray[i]=sinifListesi[i];
        }
        yeniArray[yeniArray.length-1] = eklenecekIsim;
        System.out.println(Arrays.toString(yeniArray));

    }
}
