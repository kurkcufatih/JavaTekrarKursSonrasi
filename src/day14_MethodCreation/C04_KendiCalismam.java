package day14_MethodCreation;

import org.w3c.dom.ls.LSOutput;

public class C04_KendiCalismam {
    //verilen isim ve soyismi ilk harfi buyuk
    //geriye kalanlari * olacak sekilde degistirip
    //bize bu halini donduren bir method olusturun.
    //NOT: programin ilerleyen kisimlarinda isim ve soyismi
    //bu sekilde kullanmak istiyoruz.
    public static void main(String[] args) {
        String isim = "Fatih";
        String soyisim = "Kurkcu";
        String gizemliIsim = gizliIsim(isim, soyisim);
        System.out.println(isim + " " + soyisim);
        System.out.println(gizemliIsim);



    }

    public static String gizliIsim(String isim, String soyisim) {
        isim = isim.substring(0, 1).toUpperCase() + isim.substring(1).replaceAll("\\w", "*");
        soyisim = soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).replaceAll("\\w", "*");
    return isim + " " + soyisim;
    }
}