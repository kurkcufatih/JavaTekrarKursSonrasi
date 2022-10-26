package day22_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C06_List {
    public static void main(String[] args) {

        //genelde arraylist denmez list denir.
        /*Array'i array yapan sembol [] idi
        arraylist de ise <> diamond kullaniriz.
         */

        List<String> isimler=new ArrayList<>();
        //birinci kisim list ikinci kisim arraylist olmali,
        // sadece array yazarsak ikinci kismı kabul etmez.

        System.out.println(isimler); // []

        //bir List'e eleman eklemek istersek
        isimler.add("Basak");
        System.out.println(isimler.add("Ayse")); //true doner


        /*
        String'de bir metod calistirdigimiz
        assign yapmazsak String degismiyordu
        String isim="Suleyman";
        isim.toUpperCase(); //SULEYMAN
        sout(isim)--> Suleyman

         */

        System.out.println(isimler); //[Basak, Ayse]
        /*
        List'in tek kotu tarafi array altyapisini kullandigi icin
        elemanlari birer birer eklemek zorunda olmamizdir.
         */







    }
}
