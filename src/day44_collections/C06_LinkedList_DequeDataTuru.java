package day44_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C06_LinkedList_DequeDataTuru {
    public static void main(String[] args) {
        Deque<String> ll4=new LinkedList();
        ll4.add("Cavidan");
        ll4.add("Mesut");
        ll4.add("Selim");
        ll4.add("Tevfik");
        ll4.add("Selim");

        ll4.removeLastOccurrence("Selim");
        System.out.println(ll4); //[Cavidan, Mesut, Selim, Tevfik] sondaki Selimi sildi.
        System.out.println(ll4.pop());
        //pop LinkedListteki ilk objeyi silip bize yazdiriyor, removefirst ile ayni.
        ll4.remove();
        ll4.removeFirst();
        ll4.removeLast();
// Deque iki tarafli queue demektir, dolayisiyla her method'un first ve last'i var

    }
}
