package day23_ArrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C08_KendiCalismam {
    public static void main(String[] args) {

        List<String> urunler = new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");


        List<String> urunler2 = new ArrayList<>();
        urunler2.add("Ikram");
        urunler2.add("Nutella");
        urunler2.add("Cay");
        urunler2.add("Cekirdek");

        System.out.println(urunler); //[Nutella, Ikram, Cekirdek, Cay]
        System.out.println(urunler2); //[Ikram, Nutella, Cay, Cekirdek]

        System.out.println(urunler.equals(urunler2)); //false
        urunler.addAll(urunler2);
        System.out.println(urunler); //[Nutella, Ikram, Cekirdek, Cay, Ikram, Nutella, Cay, Cekirdek]

        Collections.sort(urunler);
        System.out.println(urunler); //[Cay, Cay, Cekirdek, Cekirdek, Ikram, Ikram, Nutella, Nutella]

    }
}
