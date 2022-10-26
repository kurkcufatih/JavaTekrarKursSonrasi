package day14_MethodCreation;

public class C03_KendiCalismam {
    //Input olarak verilen isim ve soyismi
    //ilk harfi buyuk geriye kalan harfler *
    //olacak sekilde I***** K**** seklinde yazdiran
    //bir method olusturun.
    public static void main(String[] args) {
    String isim= "Fatih";
    String soyisim= "Kurkcu";

    isimGizlee(isim, soyisim);
}

    private static void isimGizlee(String isim, String soyisim) {
    isim=isim.substring(0,1) + isim.substring(1).replaceAll("\\w","*");
    soyisim=soyisim.substring(0,1) + isim.substring(1).replaceAll("\\w", "*");
        System.out.println(isim +" "+ soyisim);



    }
}
