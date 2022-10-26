package day44_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C05_LinkedList_QueueDataTuru {
    public static void main(String[] args) {
        Queue<String> ll3 = new LinkedList();
        ll3.add("Adem");
        ll3.add("Zeynep");
        ll3.add("HPolat");
        ll3.add("Kadir");
        /*
        Queue kuyruk demektir, sira onemlidir
        gelen sona gelir, giden bastan gider
         */
        System.out.println(ll3); //[Adem, Zeynep, HPolat, Kadir]

        System.out.println(ll3.remove()); //Adem

        System.out.println(ll3); //[Zeynep, HPolat, Kadir]

        System.out.println(ll3.remove("HPolat")); //true

        System.out.println(ll3); //[Zeynep, Kadir]

        System.out.println(ll3.element()); //Zeynep
        System.out.println(ll3.peek()); //Zeynep

        Queue<String> ll4 = new LinkedList(); //bos bir liste olusturduk
        // System.out.println(ll4.element()); //NoSuchElementException
        /*
        Peek ve element silmeden ilk elementi bize dondurur,
        aralarindaki fark bos liste olursa peek null doner,
        element ise exception firlatir.
         */

        ll3.offer("Ahmet");
        System.out.println(ll3); //[Zeynep, Kadir, Ahmet]

        System.out.println(ll3.poll()); //Zeynep
        System.out.println(ll4.remove()); //remove bos listede exception veriyor
        System.out.println(ll4.poll()); //poll ise exception degil de null veriyor.


    }
}
