package day44_collections.day44_Tekrar_ListIterator_LinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class C05_LinkedList_QueueDataTuru {
    public static void main(String[] args) {
        Queue<String> ll1 = new LinkedList<>();
        ll1.add("Adem");
        ll1.add("Zeynep");
        ll1.add("Polat");
        ll1.add("Kadir");
         /*
        Queue kuyruk demektir, sira onemlidir
        gelen sona gelir, giden bastan gider
         */
        System.out.println(ll1); //[Adem, Zeynep, Polat, Kadir]
        System.out.println(ll1.remove()); //Adem
        System.out.println(ll1); //[Zeynep, Polat, Kadir]
        System.out.println(ll1.remove("Polat")); //true
        System.out.println(ll1); //[Zeynep, Kadir]

        ll1.offer("Ahmet");
        System.out.println(ll1); //[Zeynep, Kadir, Ahmet]
        System.out.println(ll1.element()); //Zeynep
        System.out.println(ll1.peek()); //Zeynep
        ll1.remove();
        System.out.println(ll1); //[Kadir, Ahmet]
        /*
        Peek ve element silmeden ilk elementi bize dondurur,
        aralarindaki fark bos liste olursa peek null doner,
        element ise exception firlatir.
         */

        Queue<String> ll2 = new LinkedList(); //bos bir liste olusturduk
        // System.out.println(ll2.element()); //NoSuchElementException


    }
}
