package day44_collections.day44_Tekrar_ListIterator_LinkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C02_ListIterator {
    public static void main(String[] args) {
        // Soru 4) Bir listedeki elementleri iterator kullanarak
        // sondan basa dogru yazdirin

        List<Integer> liste = new ArrayList<>();
        liste.add(2);
        liste.add(13);
        liste.add(56);
        liste.add(23);
        liste.add(45);
        liste.add(14);
        liste.add(40);
        System.out.println(liste); //[2, 13, 56, 23, 45, 14, 40]

        ListIterator listIterator = liste.listIterator();
        while (listIterator.hasNext()) {
            listIterator.next();
        } //bu loop bizi sona goturur
        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous()+ " "); //40 14 45 23 56 13 2
        }
    }
}
