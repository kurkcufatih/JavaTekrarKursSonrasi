package replitSorulari;

import java.util.ArrayList;
import java.util.List;


public class ciftSayilariYazdir {

    /*100'den 0'C01_I kadar çift sayıları yazdırın, ancak decrement(i--) kullanmayın.

    OUTPUT : 100 98 96 94 92 … … … … 2 0
     */

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int cift = 0;
        for (int i = 0; i <= 100; i += 2) {
            list.add(i);
        }
        System.out.println(list.size() - 1);
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            cift = list.get((list.size() - 1) - i);
            System.out.print(cift + "  ");
        }
    }
}



