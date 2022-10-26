package lamda_functional_programming1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class KendiDenemem03 {
    public static void main(String[] args) {
        List<String> liste = new ArrayList<>();
        liste.add("Ali");
        liste.add("Ali");
        liste.add("Mark");
        liste.add("Amanda");
        liste.add("Christopher");
        liste.add("Jackson");
        liste.add("Mariano");
        liste.add("Alberto");
        liste.add("Tucker");
        liste.add("Benjamin");
        System.out.println(liste);
        buyukHarfileYazdir(liste);
        System.out.println();
        uzunluklarinaGoreSirala(liste);
        System.out.println();
        uzunluklarinaGoreTerstenSirala(liste);
        System.out.println();
        sonKarakterlerineGoreSirala(liste);
        System.out.println();
        uzunluklarinaVeIlkKarakterlerineGoreSirala(liste);
        System.out.println();
        //uzunluguBestenBuyukOlanlariSil(liste);
        //System.out.println();
        //aileBaslayanNileBitenleriSil(liste);
        //System.out.println();
        uzunluguSekizileOnarasiOlanYadaOileBiten(liste);
        System.out.println();
        System.out.println("uzunlugu12denAzmi : " + onIkidenKisaMu(liste));
        System.out.println();
        System.out.println("xIleBasliyorMu : " + xIleBaslamiyorMu(liste));
        System.out.println();
        System.out.println("rIleBitiyorMu : " + rIleBitiyorMu(liste));
    }

    //1) Tüm elemanları büyük harf ile yazdıran bir method oluşturun.
    public static void buyukHarfileYazdir(List<String> list) {
        list.stream().map(String::toUpperCase).forEach(KendiCalismam_Utils::ayniSatirdaBosluklaYazdir);
        //ALI ALI MARK AMANDA CHRISTOPHER JACKSON MARIANO ALBERTO TUCKER BENJAMIN
    }

    //2) Elemanları uzunluklarına göre sıralayıp yazdıran bir method oluşturun.
    public static void uzunluklarinaGoreSirala(List<String> list) {
        list.stream().sorted(Comparator.comparing(String::length)).forEach(KendiCalismam_Utils::ayniSatirdaBosluklaYazdir);
        //Ali Ali Mark Amanda Tucker Jackson Mariano Alberto Benjamin Christopher
    }

    //3) Elemanları uzunluklarına göre ters sıralayıp yazdıran bir method oluşturun.
    public static void uzunluklarinaGoreTerstenSirala(List<String> list) {

        list.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(KendiCalismam_Utils::ayniSatirdaBosluklaYazdir);
        //Christopher Benjamin Jackson Mariano Alberto Amanda Tucker Mark Ali Ali
    }

    //4) Elemanları son karakterlerine göre sıralayıp tekrarsız yazdıran bir method oluşturun.
    public static void sonKarakterlerineGoreSirala(List<String> list) {
        list.stream().distinct().sorted(Comparator.comparing(KendiCalismam_Utils::sonElaman)).forEach(KendiCalismam_Utils::ayniSatirdaBosluklaYazdir);
        //Amanda Ali Mark Jackson Benjamin Mariano Alberto Christopher Tucker
    }

    //5) Elemanları önce uzunluklarına göre ve sonra ilk karakterine göre sıralayıp yazdıran bir method oluşturun.
    public static void uzunluklarinaVeIlkKarakterlerineGoreSirala(List<String> list) {
        list.stream().sorted(Comparator.comparing(String::length)).sorted(Comparator.comparing(KendiCalismam_Utils::ilkEleman)).forEach(KendiCalismam_Utils::ayniSatirdaBosluklaYazdir);
        //Ali Ali Amanda Alberto Benjamin Christopher Jackson Mark Mariano Tucker
    }
/*
    //6) Uzunluğu 5'ten büyük olan elemanları silen bir method oluşturun.
    public static void uzunluguBestenBuyukOlanlariSil(List<String> list) {
        list.removeIf(t -> t.length() > 5);
        System.out.println(list); //[Ali, Ali, Mark]
*/

    /*    //7) ‘A’, ‘a’ ile başlayan yada ‘N’, ‘n’ ile biten elemanları silen bir method oluşturun.

        public static void aileBaslayanNileBitenleriSil(List<String> list) {
            list.removeIf(t -> t.startsWith("a") || t.startsWith("A") || t.endsWith("n") || t.endsWith("N"));
            System.out.println(list); //[Mark, Christopher, Mariano, Tucker]
    */
    //8) Uzunluğu 8 ile 10 arası olan yada 'o' ile biten elemanları yazdıran bir method oluşturun.
    public static void uzunluguSekizileOnarasiOlanYadaOileBiten(List<String> list) {
        list.stream().filter(t -> t.length() >= 8 && t.length() <= 10 || t.endsWith("o")).forEach(KendiCalismam_Utils::ayniSatirdaBosluklaYazdir);
        //Mariano Alberto Benjamin
    }

    //9) Tüm elemanların uzunluklarının 12'den az olup olmadığını kontrol eden bir method oluşturun.
    public static boolean onIkidenKisaMu(List<String> list) {
        return list.stream().allMatch(t -> t.length() < 12);
        //uzunlugu12denAzmi : true
    }

    //10) Hiçbir elemanın 'X' ile başlamadığını kontrol eden bir method oluşturun.
    public static boolean xIleBaslamiyorMu(List<String> list) {
        return list.stream().noneMatch(t -> t.startsWith("X") || t.startsWith("x"));
        //xIleBasliyorMu : true
    }

    //11) Herhangi bir elemanın 'r' ile bitip bitmediğini kontrol eden bir method oluşturun.
    public static boolean rIleBitiyorMu(List<String> list) {
        return list.stream().anyMatch(t -> t.endsWith("R") || t.endsWith("r"));
        //rIleBitiyorMu : true

    }

}