package day21_Arrays;

import java.util.Arrays;

public class C08_binarySearch {
    public static void main(String[] args) {

        String[] harfler= {"Y", "B", "D", "G", "O","A"};
        String arananHarf="Y";
        Arrays.sort(harfler);
        System.out.println(Arrays.toString(harfler));
        System.out.println(Arrays.binarySearch(harfler,arananHarf));

    }
}
