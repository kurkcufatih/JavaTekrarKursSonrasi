package day44_collections.day44_Tekrar_ListIterator_LinkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C01_ListIterator {
    public static void main(String[] args) {
        /*
        Bir listedeki istenen sayi araliginda olmayan elementleri silen
        bir program yaziniz … (2. liste olusturmadan, gecerli liste
        uzerinde islem yapiniz)

        Orn : [2,13,56,23,45,14,40] istenen aralik 20 ile 40 arasi
        (sinirlar dahil)

        Output: [23,40]
        */

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

        int bas = 20;
        int son = 40;
        while (listIterator.hasNext()) {
            Integer temp = (Integer) listIterator.next();
            if (temp < bas || temp > son) {
                listIterator.remove();
            }
        }
        System.out.println(liste); //[23, 40]
    }
}
