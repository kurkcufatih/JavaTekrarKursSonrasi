package GrupCalismalari;

import java.util.Scanner;

public class Q03_IBM {
    public static void main(String[] args) {
        /*
     Kullanicidan kilosunu ve boyunu alip
     Vucut kitle indeksini hesaplayan bir program yaziniz.
     Ipucu : Vucut
     Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)
     ORNEK:
     INPUT      : Kilo: 71
                  Boy: 1,72
     OUTPUT  : Vucut Kitle Indeksiniz : 23
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Boyunuzu ve kilonuzu giriniz");
        double boy= scan.nextDouble();
        double kilo= scan.nextDouble();
        double vki=(kilo/(boy*boy));

        if (vki>0 && vki<=20) {
          System.out.println("oldukca zayifsiniz");
        } else if (vki>20 && vki<=25) {
            System.out.println("normal sinirlardasiniz");
        } else if (vki>25 && vki<=30) {
            System.out.println("sisman kategorisindesiniz");
        } else if (vki>30) {
            System.out.println("Obez grubundasiniz");
        }

}
}
