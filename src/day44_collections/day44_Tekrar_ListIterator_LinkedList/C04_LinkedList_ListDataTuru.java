package day44_collections.day44_Tekrar_ListIterator_LinkedList;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C04_LinkedList_ListDataTuru {
    public static void main(String[] args) {

        LinkedList<String> ll1 = new LinkedList<>();
        List<String> ll2 = new LinkedList<>();

        ll2.add("Berk");
        ll2.add("Done");
        ll2.add("Enes");
        ll2.add("Ayse");
        System.out.println(ll2);

        ll2.remove(3); //iki remove secenegi vardi biz indexli olani
        //sectik ve index numarasini yazdik ve Ayse'yi sildik.
        //Eger listemiz integer elementlerden olusuyorsa
        //direk sayi yazarsak index olarak kabul eder
        //bir variable'a atama yapar ve remove'da o variable'in
        //ismini yazarsak obje olarak kabul eder.

        System.out.println(ll2.remove("Kemal")); //false
        System.out.println(ll2.isEmpty()); //false

        ll2.set(1, "Serap");
        System.out.println(ll2); //[Berk, Serap, Enes]

        ll1.add("Berk");
        ll1.add("Ismail");
        System.out.println(ll1);

        ll2.retainAll(ll1); //[Berk, Ismail]
        //ll2'deki tum elementleri ll1 ile karsilastirir.
        //ll1'de olmayanlari siler.

        System.out.println(ll1); //[Berk, Ismail]
        System.out.println(ll2); //[Berk]


    }
}
