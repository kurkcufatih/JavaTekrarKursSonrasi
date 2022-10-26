package day22_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C08_KendiCalismam {
    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(1);
        sayilar.add(4);
        sayilar.add(5);
        sayilar.add(3);

        List<Integer> sayilar2=new ArrayList<>();
        sayilar2.add(2);
        sayilar2.add(0);
        sayilar2.add(2);
        sayilar2.add(2);

        sayilar.addAll(sayilar2);
        System.out.println(sayilar); //[1, 4, 5, 3, 2, 0, 2, 2]

    }
}
