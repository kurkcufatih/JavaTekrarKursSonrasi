package lamda_functional_programming1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class KendiDenemem02 {
    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();
        liste.add(8);
        liste.add(9);
        liste.add(131);
        liste.add(10);
        liste.add(9);
        liste.add(10);
        liste.add(2);
        liste.add(8);
        listElemanlariniYazdir(liste);
        System.out.println();
        ciftElemanlariYazdir(liste);
        System.out.println();
        tekElamanlarinKareleri(liste);
        System.out.println();
        tekElemanlarinKupleri(liste);
        System.out.println();
        ciftElemanlarinKareleriToplami(liste);
        System.out.println();
        ciftElemanlarinKuplerCarpimi(liste);
        System.out.println();
        enBuyukDegeriBul(liste);
        System.out.println();
        yedidenBuyukEnKucukCiftSayi(liste);
        System.out.println();
        tersSiraliTekrarsizBestenBuyukElemanlarinYarisi(liste);
    }

    //1) Ardışık list elemanlarını aynı satırda aralarında boşluk
    // bırakarak yazdıran bir method oluşturun.
    // (Functional ve method reference)

    public static void listElemanlariniYazdir(List<Integer> list) {
        list.stream().forEach(KendiCalismam_Utils::ayniSatirdaBosluklaYazdir);
        //8 9 131 10 9 10 2 8
    }

    //2)Ardışık çift list elementlerini aynı satırda aralarında
    // boşluk bırakarak yazdıran bir method oluşturun.(Functional)

    public static void ciftElemanlariYazdir(List<Integer> list) {
        list.stream().filter(KendiCalismam_Utils::ciftElemanlariYazdir).forEach(KendiCalismam_Utils::ayniSatirdaBosluklaYazdir);
        //8 10 10 2 8
    }
    //3) Ardışık tek list elemanlarının karelerini aynı satırda
    // aralarında boşluk bırakarak yazdıran bir method oluşturun.
    // (Functional)

    public static void tekElamanlarinKareleri(List<Integer> list) {
        list.stream().filter(KendiCalismam_Utils::tekElemanlariYazdir).map(KendiCalismam_Utils::kareleriniAl).forEach(KendiCalismam_Utils::ayniSatirdaBosluklaYazdir);
        //81 17161 81
    }

    //4) Ardışık tek list elemanlarının küplerini tekrarsız
    // olarak aynı satırda aralarında boşluk bırakarak
    // yazdıran bir method oluşturun.
    public static void tekElemanlarinKupleri(List<Integer> list) {
        list.stream().distinct().filter(KendiCalismam_Utils::tekElemanlariYazdir).map(KendiCalismam_Utils::kupleriniAl).forEach(KendiCalismam_Utils::ayniSatirdaBosluklaYazdir);
        //729 2248091
    }

    //5) Tekrarsız çift elemanların karelerinin toplamını hesaplayan bir method oluşturun.
    public static void ciftElemanlarinKareleriToplami(List<Integer> list) {
        Integer toplam = list.stream().distinct().filter(KendiCalismam_Utils::ciftElemanlariYazdir).map(KendiCalismam_Utils::kareleriniAl).reduce(Math::addExact).get();
        System.out.println(toplam); //168
    }

    //6) Tekrarsız çift elemanların küpünün çarpımını hesaplayan bir method oluşturun.
    public static void ciftElemanlarinKuplerCarpimi(List<Integer> list) {
        Integer carpim = list.stream().distinct().filter(KendiCalismam_Utils::ciftElemanlariYazdir).map(KendiCalismam_Utils::kupleriniAl).reduce(1, Math::multiplyExact);
        System.out.println(carpim);//4096000
    }

    //7) List elemanları arasından en büyük değeri bulan bir method oluşturun.
    public static void enBuyukDegeriBul(List<Integer> list) {
        Integer max = list.stream().distinct().reduce(Math::max).get();
        System.out.println(max);//131
    }

    //8) 7'den buyuk en kucuk cift sayiyi bulun
    public static void yedidenBuyukEnKucukCiftSayi(List<Integer> list) {
        Integer sonuc = list.stream().distinct().filter(t -> t > 7).filter(KendiCalismam_Utils::ciftElemanlariYazdir).reduce(Math::min).get();
        System.out.println(sonuc);//8
    }

    //10) Ters sıralama ile tekrarsız ve 5'ten büyük elemanların yarı değerlerini(elamanın ikiye bölüm sonucunu) bulan bir method oluşturun.
    public static void tersSiraliTekrarsizBestenBuyukElemanlarinYarisi(List<Integer> list) {
        List<Integer> bestenBuyuk = list.stream().distinct().filter(t -> t > 5).map(KendiCalismam_Utils::elemanlarinYarisi).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(bestenBuyuk); //[65, 5, 4, 4]

    }

}
