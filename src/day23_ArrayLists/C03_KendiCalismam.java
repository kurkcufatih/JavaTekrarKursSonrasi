package day23_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C03_KendiCalismam {
    public static void main(String[] args) {
        List<String> urunler= new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");


        urunler.add("Pasta");
        System.out.println(urunler);
        System.out.println(urunler.indexOf("Cekirdek")); //bastan bakmaya baslar, bastan sayarak indexi verir.
        System.out.println(urunler.lastIndexOf("Cekirdek")); //sondan bakmaya baslar, bastan sayarak indexi verir.
    }
}
