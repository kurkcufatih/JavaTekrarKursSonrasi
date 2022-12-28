package day25_arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class day25_Tekrar_ArrayList {
    public static void main(String[] args) {
        // verilen bir sayidan,
        // kucuk fibonacci sayilarini bir list olarak kaydedelim

        /*
        Fibonacci : her sayının kendisinden bir önceki sayı ile toplanması
        ile elde edilen sayılar serisidir.
         */

        int sinir = 90;
        List<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(1);
        fibonacci.add(1);

        int sayi = 0;

        while (sayi < 90) {
            sayi = fibonacci.get(fibonacci.size() - 2) + fibonacci.get(fibonacci.size() - 1);
            fibonacci.add(sayi);
        }
        System.out.println(fibonacci); //[1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144]

        fibonacci.remove(fibonacci.size() - 1);

        System.out.println(fibonacci); //[1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89]


        //==== sort mehthodu ====
        List<String> isimler = new ArrayList<>();
        isimler.add("Ahmet");
        isimler.add("Mehmet");
        isimler.add("Ali");

        System.out.println(isimler); //[Ahmet, Mehmet, Ali]
        //oldugu gibi yazdirdi

        Collections.sort(isimler);
        System.out.println(isimler); //[Ahmet, Ali, Mehmet]
        //Natural order(alfabeye) gore yazdirdi


    }
}
