package day22_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class day22_Tekrar_Part2_Lists {
    public static void main(String[] args) {

        //==== LIST add() methodu ====

        List<String> isimler = new ArrayList<>();
        isimler.add("Fatih");
        System.out.println(isimler); //[Fatih]

        isimler.add("Kurkcu");
        System.out.println(isimler); //[Fatih, Kurkcu]

        //Sadece add yaptigimizda her ekledigimiz sona eklenir
        //Fakat eger index kullanarak nereye koyacagimizi belirtirsek
        //oraya eklemis oluruz.

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(2);
        sayilar.add(3);

        System.out.println(sayilar); //[1, 2, 3]

        sayilar.add(0, 0); //sifirinci indexe 0 ekledik.
        System.out.println(sayilar); //[0, 1, 2, 3]

        //====LIST addAll() methodu

        List<Integer> sayilar2 = new ArrayList<>();
        sayilar2.add(10);
        sayilar2.add(15);
        sayilar2.add(16);
        sayilar2.add(20);

        sayilar.addAll(0, sayilar2);
        System.out.println(sayilar); //[10, 15, 16, 20, 0, 1, 2, 3]
        //0.indexe addAll() methodu ile sayilar2 listini eklemis olduk.

        //==== LIST get() methodu ====

        List<String> ogrenciler = new ArrayList<>();
        ogrenciler.add("Ahmet");
        ogrenciler.add("Mehmet");
        ogrenciler.add("Hakan");
        ogrenciler.add("Selim");

        System.out.println(ogrenciler.get(0)); //Ahmet

            }
}
