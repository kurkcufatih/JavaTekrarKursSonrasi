package day23_ArrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C02_KendiCalismam {
    public static void main(String[] args) {
         /*
          elimizde urunlerin bulundugu bir liste var
          urun listesindeki istenen siradaki urunu
          istegimiz yeni urunle degistirip
           eski urunu, varolan eski urunler listesine ekleyelim
         */

        List<String> urunler=new ArrayList<>();
        urunler.add("Biskrem");
        urunler.add("Cizi");
        urunler.add("EtiFistikliCikolata");
        urunler.add("Cay");

        String temp=urunler.get(2);
        System.out.println("Degistirilen urun : " + temp);

        List<String>eskiUrun=new ArrayList<>();
        eskiUrun.add(temp);
        System.out.println("Eski urunler : " + eskiUrun);

        List<String> istenenUrun=new ArrayList<>();
         urunler.remove(2);
         urunler.add("Eticin");
         istenenUrun= Collections.singletonList(urunler.get(3));
        System.out.println("Yeni urun : " + istenenUrun);
        System.out.println("Mevcut urunler: " + urunler);



    }
}
