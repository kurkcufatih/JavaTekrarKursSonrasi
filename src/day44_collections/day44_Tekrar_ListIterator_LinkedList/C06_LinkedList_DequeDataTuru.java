package day44_collections.day44_Tekrar_ListIterator_LinkedList;

import java.util.Deque;
import java.util.LinkedList;

public class C06_LinkedList_DequeDataTuru {
    public static void main(String[] args) {
        Deque<String> ll1 = new LinkedList<>();
        ll1.add("Cavidan");
        ll1.add("Mesut");
        ll1.add("Selim"); //selim 1
        ll1.add("Tevfik");
        ll1.add("Selim"); //selim 2

        ll1.removeLastOccurrence("Selim");
        System.out.println(ll1); //[Cavidan, Mesut, Selim, Tevfik]
        //sonuncu selim silindi

        System.out.println(ll1.pop()); //Cavidan
        //pop LinkedListteki ilk objeyi silip bize yazdiriyor,
        //removefirst ile ayni.
        System.out.println(ll1); //[Mesut, Selim, Tevfik]

        ll1.remove(); //bastakini siler
        System.out.println(ll1); //[Selim, Tevfik]

        ll1.removeFirst(); //bastakini siler
        System.out.println(ll1); //[Tevfik]

        ll1.removeLast(); //sondakini siler
        System.out.println(ll1); //[]
        // Deque iki tarafli queue demektir,
        // dolayisiyla her method'un first ve last'i var
    }
}
