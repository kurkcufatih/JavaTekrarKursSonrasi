package day40;

import java.util.InputMismatchException;
import java.util.Scanner;

public class day40_Tekrar_Exception {
    public static void main(String[] args) {
        int a = 20;
        int b = 0;
        try {
            System.out.println("sayilarin bolumu : " + a / b);
        } catch (ArithmeticException e) {
            System.out.println("sifira bolum yapilamaz"); //sifira bolum yapilamaz
            System.out.println(e.getMessage()); /// by zero
            e.printStackTrace();
        }
        System.out.println("gorev tamamlandi"); //gorev tamamlandi


        // Verilen bir int array icin
        // kullanicidan sayi isteyin ve girilen sayiyi index olarak kabul edip
        // o index'deki elementi yazdirin


        int arr[] = {2, 3, 5, 6, 2, 7, 9, 1};
        // ArrayIndexOutOfBoundsException
        // InputMismatchException
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("lutfen elementi yazdirmak icin index giriniz");
            int index = scan.nextInt();

            System.out.println("girdiginiz indexdeki element : " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("girdiginiz index array'de yok");

        } catch (InputMismatchException e) {
            System.out.println("Girdiginiz index pozitif tam sayi olmali");

        }

        // Soru: Kullanicidan yasini girmesini isteyin.
        // Kodunuzu kullanici sifirdan kucuk bir sayi girerse Exception verecek sekilde yazin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen konsola gormek icin yasinizi giriniz");
        int yas = scan.nextInt();
        try{
            if (yas<0){
                throw new IllegalArgumentException();
            }else {
                System.out.println(yas);
            }
        } catch (IllegalArgumentException e){
            System.out.println(e);
            System.out.println("yas 0'dan buyuk olmali");
        }


    }

}
