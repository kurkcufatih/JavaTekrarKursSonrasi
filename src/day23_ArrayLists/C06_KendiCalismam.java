package day23_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C06_KendiCalismam {
    public static void main(String[] args) {
        List<String> urunler = new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

   urunler.contains("Nutella");
        System.out.println(urunler.contains("Nutella")); //true
        urunler.contains("Hobby");
        System.out.println(urunler.contains("Hobby")); //false

        urunler.addAll(urunler);
        System.out.println(urunler); //[Nutella, Ikram, Cekirdek, Cay, Nutella, Ikram, Cekirdek, Cay]
        System.out.println(urunler.contains("Nutella")); //true




    }
}
