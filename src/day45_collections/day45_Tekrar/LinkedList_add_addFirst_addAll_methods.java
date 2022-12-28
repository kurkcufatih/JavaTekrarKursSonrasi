package day45_collections.day45_Tekrar;

import java.util.LinkedList;

public class LinkedList_add_addFirst_addAll_methods {
    public static void main(String[] args) {


        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(2);
        linkedList.add(4);
        linkedList.add(6);
        linkedList.add(8);
        linkedList.add(1);
        linkedList.add(3);
        linkedList.add(5);
        System.out.println(linkedList); //[2, 4, 6, 8, 1, 3, 5]


        linkedList.add(0, 10);
        System.out.println(linkedList); //[10, 2, 4, 6, 8, 1, 3, 5]
        linkedList.addFirst(11);
        System.out.println(linkedList); //[11, 10, 2, 4, 6, 8, 1, 3, 5]


        LinkedList<Integer> linkedList2 = new LinkedList<>();
        linkedList2.add(2);
        linkedList2.add(4);
        linkedList2.add(6);
        linkedList2.addAll(linkedList);
        System.out.println(linkedList2); //[2, 4, 6, 11, 10, 2, 4, 6, 8, 1, 3, 5] linklist1'i linklist2'nin sonuna ekledi
        System.out.println(linkedList); //[11, 10, 2, 4, 6, 8, 1, 3, 5]



    }
}