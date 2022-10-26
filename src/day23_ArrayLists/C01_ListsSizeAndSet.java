package day23_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C01_ListsSizeAndSet {
    public static void main(String[] args) {
        List<Integer> sayilar1 = new ArrayList<>();
        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(2);



        sayilar1.size();
        sayilar1.set(0,1);
        System.out.println(sayilar1.size());
        System.out.println(sayilar1);
        sayilar1.addAll(sayilar1);
        System.out.println(sayilar1);
        sayilar1.size();
        System.out.println(sayilar1.size());
    }
}
