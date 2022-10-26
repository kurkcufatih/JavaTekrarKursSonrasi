package replitSorulari;

import java.util.ArrayList;
import java.util.List;

public class ArrayKacTaneTekCIftSayiVarBul {
    /*
    Array içerisindeki tek ve çift sayıların kaçar tane olduğunu bulan Java Kodu yazınız.

    Array: [1,2,3,4,5,6,7,8,9]

    Beklenen Çıktı:
    Tek Sayilar: 5
    Cift Sayilar: 4
     */
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        List<Integer> TekSayilar = new ArrayList<>();

        for (int i = 1; i < list.size()+1; i++) {
            if (i % 2 == 1) {
                TekSayilar.add(i);
            }
        }
        System.out.println("Tek Sayilar: " +TekSayilar.size());


        List<Integer> CiftSayilar = new ArrayList<>();
        for (int i = 1; i < list.size()+1; i++) {
            if (i % 2 == 0) {
                CiftSayilar.add(i);
            }
        }
        System.out.println("Cift Sayilar: " +CiftSayilar.size());
    }
}