package day22_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C09_KendiCalismam {
    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(1);
        sayilar.add(4);
        sayilar.add(5);
        sayilar.add(3);

        List<String> isimler=new ArrayList<>();
        isimler.add("Fatih");
        isimler.add("Kubra");
        isimler.add("Ibrahim");
        isimler.add("Yavuz");

        System.out.println(isimler.get(3)+ "'un yeni yasi " + sayilar.get(0)); //Yavuz'un yeni yasi 1
    }
}
