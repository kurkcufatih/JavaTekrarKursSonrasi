package day23_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C05_remove {
    public static void main(String[] args) {
        List<Integer> sayilar1 = new ArrayList<>();
        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(2);

        System.out.println(sayilar1); //[5, 3, 2]
        sayilar1.remove(1);
        /*
        Sayilardan olusan bir list varsa,
        Java remove method'unda sayi yazdigimizda
        direk index olarak kabul eder.
         */
        System.out.println(sayilar1); // [5, 2]
        //illa da 5'i silsin dersek

        Integer sil=5;
        sayilar1.remove(sil);
        System.out.println(sayilar1);

        //veya indexOf method'undan yardim alabilirim
        sayilar1.remove(sayilar1.indexOf(2));
        //2 yi silmek icin 2'nin index'ini bulup
        //onu remove'C01_I yazdirabiliriz
        System.out.println(sayilar1);//[1]
    }
}
