package day23_ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09_ArraydenListYapmak {
    public static void main(String[] args) {
        /*
        List ile calisirken en kotu ozelligi,
        elemanlari tek tek eklemek. Fakat Java'da
        bir cozum var. Ama tavsiye etmiyorum.
         */

        Integer [] arr = {2, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0};
    /*
    Bu kadar cok elemanli bir listeyi tek tek eleman
    olarak girmek yerine, array olusturup, for loop ile
    olusturdugumuz list'e tasiyabiliriz.
     */

        List<Integer> sayilar = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            sayilar.add(arr[i]);
        }
        System.out.println(sayilar); //[2, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0]

        /*
        Bu islemi yapmasi icin Java'nin olusturdugu
        bir method'da var ancak bu yontemin cok
        yan etkisi var.
        1-bu sekilde olusturual listede add, remove gibi size'i degistiren
        2-asList method'u ile olusturula liste ve kaynak olan array
        birbiri ile ilisik olarak hayatlarina devam ederler. Birine yaptigimiz degisiklik
        digerine de isler
         */
        List<Integer> sayilar2 = Arrays.asList(arr);
        System.out.println(sayilar2); //[2, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0]

        sayilar.add(5);
        System.out.println(sayilar); //[2, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0, 5]

        /*
        sayilar2.add(5);
        System.out.println(sayilar2); //UnsupportedOperationException
        */

        arr[0]=20;
        System.out.println(Arrays.toString(arr)); //[20, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0]
        System.out.println();


    }
}
