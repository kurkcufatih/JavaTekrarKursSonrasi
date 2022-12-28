package day21_Arrays;

import java.util.Arrays;

public class C09_binarySearch {
    public static void main(String[] args) {
        /*Bineary Search method'u siralanmis array'de aradigimiz elementin indexini dondurur.
         Ya aradigimiz element array'de yoksa? Aradigimiz element array'de yoksa,
         Java hem olmadigini, hem de olsaydi nerede olacagini bize döndurur.
         Olmadigini ifade icin - (eksi) kullanir. Olsaydi nerede olacagini belirtmek icin
         index degil siralama kullanir. Aradigimiz element array'de varsa index'ini yaziyoruz,
         yoksa index degil, - (eksi) siralamasini yaziyoruz.
         */
        int[]sayilar={3,7,15,4,27,10};
        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));// [3,4,7,10,15,27]
        //varsa index'ini yaziyoruz, yoksa index degil, - (eksi) siralamasini yaziyoruz.
        System.out.println(Arrays.binarySearch(sayilar,4)); //1 array'de var index'i 1
        System.out.println(Arrays.binarySearch(sayilar,15)); //4 array'de var index'i 4
        System.out.println(Arrays.binarySearch(sayilar,11)); //-5 array'de yok olsaydi 5. sirada olacakti.
        System.out.println(Arrays.binarySearch(sayilar,6)); //-3 array'de yok olsaydi 3. sirada olacakti
        System.out.println(Arrays.binarySearch(sayilar,-100)); //-1 array'de yok olsaydi 1.sirada olacakti.



    }
}
