package day46_collections.day46_Tekrar;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C01_HashSet {
    public static void main(String[] args) {
        // Verilen bir Array'deki tekrar eden sayilari silip
        // unique degerlerden olusan bir array olusturun


        int arr[] = {3, 4, 6, 4, 2, 4, 6, 8, 6, 5, 3, 1, 2, 4, 6, 7};

        Set<Integer> tekrarsizSet = new HashSet<>();
        for (Integer each : arr) {
            tekrarsizSet.add(each);
        }
        System.out.println(tekrarsizSet); //[1, 2, 3, 4, 5, 6, 7, 8]

        Object[] tekrarsizArr = tekrarsizSet.toArray();
        System.out.println(Arrays.toString(tekrarsizArr)); //[1, 2, 3, 4, 5, 6, 7, 8]
    }
}
