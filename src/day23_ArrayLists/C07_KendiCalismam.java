package day23_ArrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C07_KendiCalismam {
    public static void main(String[] args) {
        List<String> urunler= new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        Collections.sort(urunler);
        System.out.println(urunler); //[Cay, Cekirdek, Ikram, Nutella] sort yaptigimiz icin alfabetik siralama yapti.


    }
}
