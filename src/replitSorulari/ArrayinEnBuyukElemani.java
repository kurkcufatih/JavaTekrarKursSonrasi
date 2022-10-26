package replitSorulari;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayinEnBuyukElemani {
    /*
    Array listesindeki 2. en büyük sayıyı bulan Java Kodunu yazınız.

    Array: [1232,2345,5467,678,3454,2312,3451]
     */
    public static void main(String[] args) {
        int arr[]={1232,2345,5467,678,3454,2312,3451};
        List<Integer> list=new ArrayList<>();

        list.add(1232);
        list.add(2345);
        list.add(5467);
        list.add(678);
        list.add(3454);
        list.add(2312);
        list.add(3451);
        Collections.sort(list);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(5));

    }
}
