package day46_collections.day46_Tekrar;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class C02_RetainAll {
    public static void main(String[] args) {
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Ali");
        linkedHashSet.add("Mehmet Ali");
        linkedHashSet.add("Hasan");
        linkedHashSet.add("Kutlu");

        Set<String> linkedHashSet2 = new LinkedHashSet<>();
        linkedHashSet2.add("Ali");
        linkedHashSet2.add("Mehmet Ali");
        linkedHashSet2.add("Filiz");

        System.out.println(linkedHashSet2.retainAll(linkedHashSet)); //true
        System.out.println(linkedHashSet); //[Ali, Mehmet Ali, Hasan, Kutlu]
        System.out.println(linkedHashSet2); //[Ali, Mehmet Ali]
        //Farkli olanlari silip ortak olanlari birakti


        Set<String> letters1 = new HashSet<>();
        letters1.add("A");
        letters1.add("B");
        letters1.add("C");
        letters1.add("D");
        letters1.add("E");

        System.out.println("Before retainAll(): " + letters1); //Before retainAll(): [A, B, C, D, E]

        Set<String> letters2 = new HashSet<>();
        letters2.add("A");
        letters2.add("B");
        letters2.add("C");

        letters1.retainAll(letters2);  // retain elements from letters2

        System.out.println("After retainAll():  " + letters1); //After retainAll():  [A, B, C]

    }
}
