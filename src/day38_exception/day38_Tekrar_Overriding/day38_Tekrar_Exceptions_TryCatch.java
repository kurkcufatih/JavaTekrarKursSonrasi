package day38_exception.day38_Tekrar_Overriding;

import java.util.Scanner;

public class day38_Tekrar_Exceptions_TryCatch {
    public static void main(String[] args) {

        try {
            String[] urunler = {"Nutella", "Cokokrem", "Sut", "Cay", "Findik"};
            System.out.println(urunler[6]);
        } catch (Exception e) {
            System.out.println("Lutfen var olan urun sayisina gore bir sayi giriniz"); //Lutfen var olan urun sayisina gore bir sayi giriniz
            System.out.println(e); //ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 5
        }






    }
}
