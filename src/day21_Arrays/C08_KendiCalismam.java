package day21_Arrays;

import java.util.Arrays;

public class C08_KendiCalismam {
    public static void main(String[] args) {
    /*
         Binary search java da eleman aramanin kisa yoludur
         Ancak binary searc'un calismasi icin once
         array'in sirali hale getirilmesi gerekir
         Eger siralama yapmadan binarySearch yaparsaniz
         sonucu bulamayabilir veya yanlis bulabilir
         */
        String[] harfler = {"Y", "B", "D", "G", "O", "A"};
        String arananHarf = "Y";

        Arrays.sort(harfler);
        System.out.println(Arrays.toString(harfler));
        System.out.println(Arrays.binarySearch(harfler,arananHarf));
        System.out.println(harfler[5]);
    }
}