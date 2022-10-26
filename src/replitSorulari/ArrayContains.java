package replitSorulari;

import java.util.ArrayList;
import java.util.List;

public class ArrayContains {
    public static void main(String[] args) {
        /*
    Aranan değerin Array içerisinde kaçıncı eleman olduğunu bulan Java Kodu yazınız.

    Array: [12,15,43,23,56,76,78,90,77,43]

    Aranan değer:56
    Beklenen Çıktı:
    56 sayısı arrayin 4. elemanı
         */

        int arr[] = {12, 15, 43, 23, 56, 76, 78, 90, 77, 43};
        List<Integer> list = new ArrayList<>();
list.add(12);
list.add(15);
list.add(43);
list.add(23);
list.add(56);
list.add(76);
list.add(78);
list.add(90);
list.add(77);
list.add(43);
        int index=list.indexOf(56);
        if (list.contains(56)){
            System.out.println("56 sayısı arrayin " +index +" . elemanı");
        }
    }
}