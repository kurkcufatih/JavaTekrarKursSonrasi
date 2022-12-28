package day21_Arrays;

import java.util.Arrays;

public class C10_split {
    /*
    split () methodu bir array metodu degil bir string
    methodudur, ama array dondurdugu icin bu konuda anlatiyoruz.

     split () ile herhangi bir String'i istedigimiz sekilde
     parcalara bolup bir array haline getiriyoruz.

     */
    public static void main(String[] args) {
        String str="Java ne kadar guzel";
      //  str.split(" "); // bu bana string bir array donecek, nasil gorebilirim?
        //  bir atama veya sout yapmam gerekiyor.

        String[]kelimeler=str.split(" ");
        System.out.println(Arrays.toString(kelimeler));

        String[]kelimelerNe=str.split("ne");
        System.out.println(Arrays.toString(kelimelerNe));

        String[]kelimelerE=str.split("e");
        System.out.println(Arrays.toString(kelimelerE));

        String[]karakterler =str.split("");
        System.out.println(Arrays.toString(karakterler));
    }


}
