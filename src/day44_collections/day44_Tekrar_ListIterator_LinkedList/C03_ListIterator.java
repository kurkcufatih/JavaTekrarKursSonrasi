package day44_collections.day44_Tekrar_ListIterator_LinkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C03_ListIterator {
    public static void main(String[] args) {
         /*
     Soru 5) (iterator ile index kullanimina ornek)
      Bir listedeki ilk n elemani iterator kullanarak 5 artirin.
      Orn :  list : [2,13,56,23,45,14,40]
      artirilmasi istenen eleman sayisi : 3
      output: [7,18,61,23,45,14,40]
      */
        int[] arr = {2, 13, 56, 23, 45, 14, 40};
        List<Integer> liste = new ArrayList<>();
        for (Integer each : arr) {
            liste.add(each);
        }
        System.out.println(liste);

        ListIterator listIterator = liste.listIterator();
        int n = 3;
        for (int i = 0; i < n; i++) {
            liste.set(i, liste.get(i) + 5);
            listIterator.next();
        }
        System.out.println(liste); //[7, 18, 61, 23, 45, 14, 40]
    }
}
