package lamda_functional_programming1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalProgramming02 {
    /*

    1) t-> "Logic" , (t,u)-> "Logic"
    Bu yapiya "Lambda Expression" denir

    2) Functional programming kapsaminda "Lambda Expression"
    kullanilabilir ama onerilmez. "Lambda Expression" yerine
    "Method Reference" tercih edilir.

    3) "Method Reference" kullanimi "Class Name::Method Name"
    Ayni zamanda kendi class'larinizi da kullabilirsiniz. Ornegin;
    Bir animal class'iniz var ve bu class "eat()" methoduna sahip.
    "Animal::eat"

     */


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
        System.out.println(liste);
        listElemanlariniYazdirFunctional(liste);
        System.out.println();
        ciftElemanlariYazdirFunctional(liste);
        System.out.println();
        tekElemanlarinKareleriniYazdir(liste);
        System.out.println();
        tekrarsizTekElamanlarinKupunuYazdir(liste);
        System.out.println();
        tekrarsizCiftElemanlarinKareToplami(liste);
        System.out.println();
        tekrarsizCiftElemanlarinKareToplami03(liste);
        System.out.println();
        tekrarsizCiftElemanrinKuplerininCarpimi(liste);
        System.out.println();
        getMaximumEleman(liste);
        System.out.println();
        yedidenBuyukCiftMin(liste);
    }

    //1) Ardışık list elemanlarını aynı satırda aralarında boşluk
    // bırakarak yazdıran bir method oluşturun.
    // (Functional ve method reference)
    public static void listElemanlariniYazdirFunctional(List<Integer> list) {

        list.stream().forEach(Utils::ayniSatirdaBosluklaYazdir);
        //8 9 131 10 9 10 2 8
    }


    //2)Ardışık çift list elementlerini aynı satırda aralarında
    // boşluk bırakarak yazdıran bir method oluşturun.(Functional)

    public static void ciftElemanlariYazdirFunctional(List<Integer> list) {
        list.stream().filter(Utils::ciftElemanlariSec).forEach(Utils::ayniSatirdaBosluklaYazdir);
        //8 10 10 2 8
    }

    //3) Ardışık tek list elemanlarının karelerini aynı satırda
    // aralarında boşluk bırakarak yazdıran bir method oluşturun.
    // (Functional)

    public static void tekElemanlarinKareleriniYazdir(List<Integer> list) {
        list.stream().filter(Utils::tekElemanlariSec).map(Utils::karesiniAl).forEach(Utils::ayniSatirdaBosluklaYazdir);
        //81 17161 81

    }

    //4) Ardışık tek list elemanlarının küplerini tekrarsız
    // olarak aynı satırda aralarında boşluk bırakarak
    // yazdıran bir method oluşturun.
    public static void tekrarsizTekElamanlarinKupunuYazdir(List<Integer> list) {
        list.stream().distinct().filter(Utils::tekElemanlariSec).map(Utils::kupunuAl).forEach(Utils::ayniSatirdaBosluklaYazdir);
        //729 2248091
    }

    //5) Tekrarsız çift elemanların karelerinin toplamını hesaplayan bir method oluşturun.

    public static void tekrarsizCiftElemanlarinKareToplami(List<Integer> list) {

        //1.YOL
        Integer toplam = list.stream().distinct().filter(Utils::ciftElemanlariSec).map(Utils::karesiniAl).reduce(Math::addExact).get();
        System.out.println(toplam); //168

        //2.YOL
        Integer toplam2 = list.stream().distinct().filter(Utils::ciftElemanlariSec).map(Utils::karesiniAl).reduce(0, Math::addExact);
        System.out.println(toplam2); //168
    }

    //3.YOL
    public static void tekrarsizCiftElemanlarinKareToplami03(List<Integer> list) {

        Integer toplam = list.stream().distinct().filter(Utils::ciftElemanlariSec).map(Utils::karesiniAl).reduce(0, Integer::sum);
        System.out.println(toplam); //168

    }

    //6) Tekrarsız çift elemanların küpünün çarpımını hesaplayan bir method oluşturun.
    public static void tekrarsizCiftElemanrinKuplerininCarpimi(List<Integer> list) {
        Integer carpim = list.stream().distinct().filter(Utils::ciftElemanlariSec).map(Utils::kupunuAl).reduce(1, Math::multiplyExact);
        System.out.println(carpim); //4096000

    }

    //7) List elemanları arasından en büyük değeri bulan bir method oluşturun.

    public static void getMaximumEleman(List<Integer> list) {
        Integer max = list.stream().distinct().reduce(Math::max).get();
        System.out.println(max); //131
    }

    //8) 7'den buyuk en kucuk cift sayiyi bulun
    public static void yedidenBuyukCiftMin(List<Integer> list) {
        Integer sonuc = list.stream().distinct().filter(t -> t > 7).filter(Utils::ciftElemanlariSec).reduce(Math::min).get();
        System.out.println(sonuc); //8
    }

    //10) Ters sıralama ile tekrarsız ve 5'ten büyük elemanların yarı değerlerini(elamanın ikiye bölüm sonucunu) bulan bir method oluşturun.
    public static void tersSiralamaylaTekrarsizElemanlarinYarisi(List<Integer> list) {
        List<Double> sonuc = list.
                stream(). //Gerekli methodlari kullanmamizi daglar
                distinct(). //Tekrarli olanlari almaz
                filter(t -> t > 5). //Kosula gore filtreleme yapar
                map(Utils::yarisiniAl). //Herbir elemanin degerini degistirmeye yarar
                sorted(Comparator.reverseOrder()). //Siralama yapar
                collect(Collectors.toList()); //Elemanlari collection'a cevirir.
        System.out.println(sonuc);
    }


}