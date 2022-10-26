package lamda_functional_programming1;

import jdk.jshell.execution.Util;

import javax.management.ListenerNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FunctionalProgramming03 {
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

        buyukHarfleYazdir(liste);
        System.out.println();
        // buyukHarfleYazdir02(liste);
        // System.out.println();
        uzunlugunaGoreYazdir(liste);
        System.out.println();
        uzunlugaGoreTersYazdir(liste);
        System.out.println();
        sonKaraktereGoreTekrarsizSirala(liste);
        System.out.println();
        uzunlukVeIlkHarfeGoreSiralaYazdir(liste);
        System.out.println();
        //bestenBuyukleriSil(liste);
        //System.out.println();
        //baslangiciAyadaSonuNolaniSil(liste);
        //System.out.println();
        //baslangiciAyadaSonuNolaniSil02(liste);
        //System.out.println();
        uzunlugu8ile10arasiveoilebiteniSil(liste);
        System.out.println();
        System.out.println("uzunlugu12denAzmi : "+ uzunlugu12denAzmi(liste));
        System.out.println();
        System.out.println("xileBasliyorMu" +xileBaslamiyorMu(liste));
        System.out.println();
        System.out.println("rileBitenVarMi "+rileBitenVarMi(liste));
    }

    //1) Tüm elemanları büyük harf ile yazdıran bir method oluşturun.
    public static void buyukHarfleYazdir(List<String> list) {

        list.stream().map(String::toUpperCase).forEach(Utils::ayniSatirdaBosluklaYazdir);
        //ALI ALI MARK AMANDA CHRISTOPHER JACKSON MARIANO ALBERTO TUCKER BENJAMIN
    }

    //2.YOL
   /* public static void buyukHarfleYazdir02(List<String> list) {
        list.replaceAll(String::toUpperCase);
        System.out.println(list); //[ALI, ALI, MARK, AMANDA, CHRISTOPHER, JACKSON, MARIANO, ALBERTO, TUCKER, BENJAMIN]
        //bu methoda dikkat edilmesi gerekiyor cunku listin kendisini degistirdi.
    }*/

    //2) Elemanları uzunluklarına göre sıralayıp yazdıran bir method oluşturun.

    public static void uzunlugunaGoreYazdir(List<String> list) {
        list.stream().sorted(Comparator.comparing(String::length)).forEach(Utils::ayniSatirdaBosluklaYazdir); //Comparator.comparing siralama kosulunu belirtmek icin kullanilir.
        //ALI ALI MARK AMANDA TUCKER JACKSON MARIANO ALBERTO BENJAMIN CHRISTOPHER
    }

    //3) Elemanları uzunluklarına göre ters sıralayıp yazdıran bir method oluşturun.
    public static void uzunlugaGoreTersYazdir(List<String> list) {
        list.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(Utils::ayniSatirdaBosluklaYazdir); //Comparator.comparing siralama kosulunu belirtmek icin kullanilir.
        //CHRISTOPHER BENJAMIN JACKSON MARIANO ALBERTO AMANDA TUCKER MARK ALI ALI

    }

    //4) Elemanları son karakterlerine göre sıralayıp tekrarsız yazdıran bir method oluşturun.
    public static void sonKaraktereGoreTekrarsizSirala(List<String> list) {
        list.stream().distinct().sorted(Comparator.comparing(Utils::sonKarakter)).forEach(Utils::ayniSatirdaBosluklaYazdir);

    }

    //5) Elemanları önce uzunluklarına göre ve sonra ilk karakterine göre sıralayıp yazdıran bir method oluşturun.
    public static void uzunlukVeIlkHarfeGoreSiralaYazdir(List<String> list) {
//Ilk once uzunluga gore siraladik, sonra da son harfe dore siraladik.
        list.stream().
                sorted(Comparator.comparing(String::length).
                        thenComparing(Utils::ilkKarakter)). //siralama
                forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    //6) Uzunluğu 5'ten büyük olan elemanları silen bir method oluşturun.

    /*public static void bestenBuyukleriSil(List<String> list) {
        list.removeIf(t -> t.length() > 5);
        System.out.println(list); //[Ali, Ali, Mark]
    } */
    //7) ‘A’, ‘a’ ile başlayan yada ‘N’, ‘n’ ile biten elemanları silen bir method oluşturun.

    /*public static void baslangiciAyadaSonuNolaniSil(List<String> list) {
        list.removeIf(t -> t.charAt(0) == 'A' || t.charAt(0) == 'a' || t.charAt(t.length() - 1 )== 'N' || t.charAt(t.length() - 1 )== 'n');
        System.out.println(list); //[Mark, Christopher, Mariano, Tucker]
    }
    //2.YOL
    public static void baslangiciAyadaSonuNolaniSil02(List<String> list) {
        list.removeIf(t->t.startsWith("A")||t.startsWith("a")||t.endsWith("N")||t.endsWith("n"));
        System.out.println(list);//[Mark, Christopher, Mariano, Tucker]
    */
    //8) Uzunluğu 8 ile 10 arası olan yada 'o' ile biten elemanları yazdıran bir method oluşturun.
public static void uzunlugu8ile10arasiveoilebiteniSil(List<String>list){
        list.removeIf(t->(t.length()>7 && t.length()<11) ||t.endsWith("o"));
    System.out.println(list); //[Ali, Ali, Mark, Amanda, Christopher, Jackson, Tucker]

}
//9) Tüm elemanların uzunluklarının 12'den az olup olmadığını kontrol eden bir method oluşturun.

    public static boolean uzunlugu12denAzmi(List<String>list){
return list.stream().allMatch(t-> t.length()<12); //true
    }
//10) Hiçbir elemanın 'X' ile başlamadığını kontrol eden bir method oluşturun.
  public static boolean xileBaslamiyorMu(List<String>list){

    return list.stream().noneMatch(t-> t.startsWith("X")); //true , hic biri x ile baslamiyor
  }
//11) Herhangi bir elemanın 'r' ile bitip bitmediğini kontrol eden bir method oluşturun.
public static boolean rileBitenVarMi(List<String>list){
    return list.stream().anyMatch(t->t.endsWith("r")); //true
}
}
