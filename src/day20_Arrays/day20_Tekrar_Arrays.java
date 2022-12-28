package day20_Arrays;

import java.util.Arrays;

public class day20_Tekrar_Arrays {
    public static void main(String[] args) {

        //==== Arrays ====
        //toString() methodu

        int sayilar[] = new int[3];
        System.out.println(sayilar); //[I@58372a00
        System.out.println(Arrays.toString(sayilar)); //[0, 0, 0]

        sayilar[0] = 3;
        sayilar[1] = 5;
        sayilar[2] = 7;

        System.out.println(Arrays.toString(sayilar)); //[3, 5, 7]

        String sinifList[] = {"Ali", "Veli", "Deli"};

        System.out.println(sinifList[1]); //Veli

        System.out.println(Arrays.toString(sinifList)); //[Ali, Veli, Deli]

        sinifList[2] = "Kirk Dokuz Elli";
        System.out.println(Arrays.toString(sinifList)); //[Ali, Veli, Kirk Dokuz Elli]

        //Array'in iki sekilde olusturulusu

        int numbers[] = new int[4]; //degerler girilmemis, sonrdan atanacak, uzunlugu 4 olarak belirtilmis
        int numbers2[] = {1, 2, 3, 4}; //degerleri girilerek olusturulmus bir array

        String leters[] = new String[4]; //degerler girilmemis, sonrdan atanacak, uzunlugu 4 olarak belirtilmis
        String letters2[] = {"a", "b", "c", "d"}; //degerleri girilerek olusturulmus bir array


        //Bir array'in uzunlugunu yazdirma
        System.out.println(numbers2.length); //4

        //Array'in tum elemanlarini for loop ile yazdirma

        for (int i = 0; i < numbers2.length; i++) {
            System.out.print(numbers2[i] + " "); //1 2 3 4
        }


        //==== Array'in elemanlarinin sirasiini degistirme ====

        //Verilen 3 elemanli bir aaray'in
        //tum elemanlarini bir soldaki konuma tasiyacak
        // bir program yazin
        //Ornek; array[1,2,3] ise output [2,3,1] olacak

        int arr[] = {1, 2, 3, 4, 5};
        int temp = arr[0]; // => temp'e 1 degerini vermis

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;
        System.out.println(Arrays.toString(arr));


    }
}
