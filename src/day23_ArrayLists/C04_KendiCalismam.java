package day23_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C04_KendiCalismam {
    public static void main(String[] args) {
        List<String> urunler = new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        System.out.println(urunler); //[Nutella, Ikram, Cekirdek, Cay]
        urunler.remove("Cekirdek");
        System.out.println(urunler); //[Nutella, Ikram, Cay]
        urunler.remove("Nutella");
        System.out.println(urunler); //[Ikram, Cay]


    }
}
