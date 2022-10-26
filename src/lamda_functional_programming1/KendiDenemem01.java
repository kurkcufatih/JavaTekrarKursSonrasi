package lamda_functional_programming1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static lamda_functional_programming1.FunctionalProgramming01.listElemanlariniYazdirStructured;

public class KendiDenemem01 {
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
        System.out.println(liste); //[8, 9, 131, 10, 9, 10, 2, 8]

        listElemanlariniYazdirStructured(liste);
        System.out.println();
        listElemanlariniYazdirFunctional(liste);
        System.out.println();
        ciftElemanlariYazdirStructured(liste);
        System.out.println();
        ciftElemanlariYazdirFunctional(liste);
        System.out.println();
        tekRlemanlarinKareleriniYazdirFunctional(liste);
        System.out.println();
        tekElemanlarinKupleriniTekrarsizYazdir(liste);
        System.out.println();
        tekrarsizCiftElemanlarinKareleriToplaminiYazdir(liste);
        System.out.println();
        tekrarsizCiftElemanlarinKuplerininCarpimi(liste);
        System.out.println();
        enBuyukDeger(liste);
        System.out.println();
        enKucukDeger(liste);
        System.out.println();
        yedidenBuyukCiftenKucukDeger(liste);
        System.out.println();
        tersSiralamaIleTekrarsizBestenBuyukElemanlarinYariDegerleri(liste);
        System.out.println();
    }

//1) Ardışık list elementlerini aynı satırda aralarında
// boşluk bırakarak yazdıran bir method oluşturun.(Structured)

    public static void listElemanlariniYazdirStructured(List<Integer> list) {
        for (Integer w : list) {
            System.out.print(w + " "); //8 9 131 10 9 10 2 8
        }
    }
//1) Ardışık list elementlerini aynı satırda aralarında
// boşluk bırakarak yazdıran bir method oluşturun.(Functional)


    public static void listElemanlariniYazdirFunctional(List<Integer> list) {

        list.stream().forEach(t -> System.out.print(t + " "));
//8 9 131 10 9 10 2 8

    }
//2)çift sayi olan list elementlerini aynı satırda aralarında
// boşluk bırakarak yazdıran bir method oluşturun.(Structured)

    public static void ciftElemanlariYazdirStructured(List<Integer> list) {

        for (Integer w : list) {
            if (w % 2 == 0) {
                System.out.print(w + " "); //8 10 10 2 8

            }
        }
    }

    public static void ciftElemanlariYazdirFunctional(List<Integer> list) {
        list.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.print(t + " ")); //8 10 10 2 8
    }

//3) Ardışık tek list elementlerinin karelerini aynı satırda
// aralarında boşluk bırakarak yazdıran bir method oluşturun.
// (Functional)

    public static void tekRlemanlarinKareleriniYazdirFunctional(List<Integer> list) {
        list.stream().filter(t -> t % 2 == 1).map(t -> t * t).forEach(t -> System.out.print(t + " ")); //81 17161 81
    }

//4) Ardışık tek list elementlerinin küplerini tekrarsız olarak aynı
// satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.

    public static void tekElemanlarinKupleriniTekrarsizYazdir(List<Integer> list) {

        list.stream().distinct().filter(t -> t % 2 == 1).map(t -> t * t * t).forEach(t -> System.out.print(t + " "));
        //729 2248091
    }

    //5) Tekrarsız çift elementlerin karelerinin toplamını
// hesaplayan bir method oluşturun.
    public static void tekrarsizCiftElemanlarinKareleriToplaminiYazdir(List<Integer> list) {

        Integer toplam = list.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(0, (t, u) -> t + u);
        System.out.print(toplam); //168
    }

    //6) Tekrarsız çift elemanların küpünün çarpımını hesaplayan bir method oluşturun.
    public static void tekrarsizCiftElemanlarinKuplerininCarpimi(List<Integer> list) {

        Integer carpim = list.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t * t).reduce(1, (t, u) -> t * u);
        System.out.print(carpim); //4096000
    }

//7) List elemanları arasından en büyük değeri bulan bir method oluşturun.

    public static void enBuyukDeger(List<Integer> list) {

        //1.YOL
        Integer enBuyuk = list.stream().distinct().reduce(list.get(0), (t, u) -> t > u ? t : u);
        System.out.print(enBuyuk); //131

        //2.YOL
        Integer maxSayi = list.stream().distinct().sorted().reduce(Integer.MIN_VALUE, (t, u) -> u);
        System.out.print(maxSayi); //131
    }
//8)List elemanları arasından en küçük değeri bulan bir method oluşturun

    public static void enKucukDeger(List<Integer> list) {
        Integer enKucuk = list.stream().distinct().reduce(list.get(0), (t, u) -> t < u ? t : u);
        System.out.print(enKucuk); //2
    }
//9) List elemanları arasından 7'den büyük, çift, en küçük değeri bulan bir method oluşturun.

    public static void yedidenBuyukCiftenKucukDeger(List<Integer> list) {
        //1.YOL
        Integer yedidenKucukCift = list.stream().distinct().filter(t -> t % 2 == 0).filter(t -> t > 7).reduce(Integer.MAX_VALUE, (t, u) -> t < u ? t : u);
        System.out.print(yedidenKucukCift); //8
        // 2.YOL
        Integer min = list.stream().distinct().filter(t -> t % 2 == 0).filter(t -> t > 7).sorted().findFirst().get();
        System.out.print(min); //8
    }

//10) Ters sıralama ile tekrarsız ve 5'ten büyük elemanların yarı değerlerini(elamanın ikiye bölüm sonucunu) bulan bir method oluşturun.

    public static void tersSiralamaIleTekrarsizBestenBuyukElemanlarinYariDegerleri(List<Integer> list) {

        List<Double> sonuc = list.stream().distinct().filter(t -> t > 5).map(t -> t / 2.0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.print(sonuc); //[65.5, 5.0, 4.5, 4.0]


    }


}


