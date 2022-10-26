package day24_ArrayLists_ForEachLoop;

import java.util.Arrays;
import java.util.List;

public class C01_ArraydenArrayListYapmak {
    public static void main(String[] args) {
        String[] arr={"Ismail","Nurullah","Fatih"};
        /*
        Uzun listeler olusturmamiz gerektiginde,
        tek tek eklemek yerine array olusturup, bunlari
        List'e cevirmek daha pratik olabilir.
        1-Loop ile array'deki tum elementleri List'e atabiliriz
        2-Arrays.asList() kullanabiliriz
        Ancak bu method'un 2 tane kotu yan etkisi var
         - Array class'i kullanildigi icin, array ozellikleri
         gecerli olur. Dolayisiyla da list'te olan add, remove gibi
         size'i degistiren method'lar bu sekilde olusturulan list'lerde
         kullanilamaz.
         - Kaynak olan array ile urun olan list ozdeslestirilir.
         Birinde yapilan degisiklik, otomatik olarak digerine de islenir.
         */

        List<String>sinifList= Arrays.asList(arr);
        System.out.println(sinifList);

        List<Integer>sayilar=Arrays.asList(new Integer[5]);

        //1.yan etki
        //sinifList.add("Erdi"); //UnsupportedOperationException
        //sinifList.remove(1); //UnsupportedOperationException

        //2.yan etki

        arr[1]="Emre";
        System.out.println("Degisim sonrayi array: " + Arrays.toString(arr)); // [Ismail, Emre, Fatih]
        System.out.println("Array'i degistirince List: " + sinifList); // [Ismail, Emre, Fatih]
        sinifList.set(0,"Utku");
        System.out.println("List'i degistirince List: " +sinifList); // [Utku, Emre, Fatih]
        System.out.println("List'i degistirince array: " + Arrays.toString(arr)); // [Utku, Emre, Fatih]

    }
}
