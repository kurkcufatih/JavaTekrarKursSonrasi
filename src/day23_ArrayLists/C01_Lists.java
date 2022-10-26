package day23_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C01_Lists {
    public static void main(String[] args) {
        List<Integer> sayilar1 = new ArrayList<>();
        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(2);

        System.out.println("Listenin boyutu: " + sayilar1.size());
        sayilar1.add(2);
        sayilar1.addAll(sayilar1);
        System.out.println(sayilar1);

        System.out.println("Listenin boyutu: " + sayilar1.size());
        //size boyutu getirir bize, yukarida 3 tane var biz ona
        // 1 tane daha ekledik ve uzerine hepsini ekle dedi
        // toplamda 8 boyutunu ve rakamlari yazdi

        sayilar1.set(2, 8);
        //indexi 2 olan rakamin yerine 8 yapar.
        //Buradaki 2 indextir, 8 ise yeni rakam,
        // eklenecek rakamdir.
        System.out.println(sayilar1); // [5, 3, 8, 2, 5, 3, 2, 2]
        System.out.println(sayilar1.set(0,12)); //5
        System.out.println(sayilar1); //[12, 3, 8, 2, 5, 3, 2, 2]
        //0'inci indexteki 5'i 12 yaptik.

        /*
        set method'u istenen index'deki eski elementi silip,
        yerine verdigimiz yeni elementi set eder.


        Eger eski elementi silmek istemiyorsak;
        add method'unu kullaniriz -> add(index,deger)

        set() method'u sildigi eski elementi bize dondurur.
         */


    }
}
