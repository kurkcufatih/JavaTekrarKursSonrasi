package day23_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C05_KendiCalismam {
    public static void main(String[] args) {
        List<Integer> sayilar1 = new ArrayList<>();
        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(2);

        System.out.println(sayilar1); // [5, 3, 2]
        sayilar1.remove(sayilar1.indexOf(2)); //ikinci indexteki rakami cikardi
        System.out.println(sayilar1); //[5, 3]
        sayilar1.remove(0); // 0. indexteki rakami cikardi
        System.out.println(sayilar1); // [3]




    }
}
