package day22_multiDimensionalArrays;

import java.util.Arrays;

public class C01_MDA {
    /*
    tek katli arraylerde array'i direk yazdiramiyoruz
    cunku array non-pirimitive data turudur ve her
    non-primitive data direk yazdirilamayabilir

    Ancak array'in icerisindeki elementleri direk
    yazdirabiliyorduk cunku genelde primitive data turu veya String
    elementler kullaniyordu.

    Multi-dimensional array'lerde en dikkat edecegimiz
    konu ulasmak istedigimiz elementin bir array mi yoksa
    primitive data mi oldugudur.
     */
    public static void main(String[] args) {
        int [][] sayilar={{1,2,3,4,5},{3,4}};
        /*Burada sayilar arayinin icinde 2 tane inner array var..
        Dolayisiyla sayilar [0] dedigimizde bunun karsiligi
        java bize [1,2,3,4,5] verir.

        ancak en icerdeki elementlere ulasabilirsek direk yazdirabiliriz

         */

        System.out.println(sayilar[0]); //[I@7699a589 -> array'i direk yazdiramayiz
        System.out.println(Arrays.toString(sayilar[0]));
        System.out.println(sayilar[0][1]); //sifirinci inner arayin (index ile) birinci array'i // 2 yazdirir
        System.out.println(sayilar[1][0]); //ikinci inner arrayin 0'inci idexi //3 yazdirir
        System.out.println(Arrays.toString(sayilar)); //tum arrayi yazdirirsak inner arraylerin referanslarini verir sadece //[[I@7699a589, [I@58372a00]
        System.out.println(Arrays.deepToString(sayilar)); // deeptoString dedigimizde tum arrayleri verir -> [[1, 2, 3, 4, 5], [3, 4]]
 /*
 Array'i iki sekilde declare edebiliyorduk,
 1- elemanlari direk yazabiliriz
 int[][] sayilar={{1,2,3,4},{3,4}
 2-outer ve inner arraylerin uzunluklarini
 belirterek olusturabiliriz
 int[][]sayilar=new int[3][4];

 ancak 2. yontemle yaptigimizda inner arraylerin farkli uzunlukta olma ihtimali
 kalmaz bu ornek icin outer array'in 3 tane inner array'i vardir
 her bir inner array'in ise 4'er elemani vardir.
  */

    }
}
