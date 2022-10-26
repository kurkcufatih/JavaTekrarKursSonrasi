package day21_Arrays;

import java.util.Arrays;

public class C09_binarySearch {
    public static void main(String[] args) {
        /*BinearySearch method'u siralanmis array'de
        aradigimiz elementin indexini dondurur.
        Ya aradigimiz element array'de yoksa?
        Aradigimiz element array'de yoksa Java hem olmadigini, hem de olsaydi
        nerede olacagini bize dondurur.
        Olmadigini ifade icin - (eksi) kullanir. Olsaydi nerede olacagini
        belirtmek icin index degil siralama kullanir.
        (String'de indexOf() bize olmayan elementler
        icin -1 donduruyordu.
         */
        int[]sayilar={3,7,15,4,27,10};
        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));// [3,4,7,10,15,27] -> bu rakamlara gore asagidaki hesabin sonucunu yaina not aldik.
        //varsa index'ini yaziyoruz, yoksa index degil, - (eksi) siralamasini yaziyoruz.
        System.out.println(Arrays.binarySearch(sayilar,4)); //1
        System.out.println(Arrays.binarySearch(sayilar,15)); //4
        System.out.println(Arrays.binarySearch(sayilar,11)); //-5
        System.out.println(Arrays.binarySearch(sayilar,6)); //-3
        System.out.println(Arrays.binarySearch(sayilar,-100)); //-1



    }
}
