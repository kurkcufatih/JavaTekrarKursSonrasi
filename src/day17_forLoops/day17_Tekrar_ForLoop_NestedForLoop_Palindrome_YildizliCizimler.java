package day17_forLoops;

import java.util.Scanner;

public class day17_Tekrar_ForLoop_NestedForLoop_Palindrome_YildizliCizimler {
    public static void main(String[] args) {

        //==== FAKTORYEL =====

        //Kullanicidan 10'dan kucuk bir  tamsayi isteyin
        //ve girilen sayinin faktoryel'ini bulun.

        Scanner scan = new Scanner(System.in);
        System.out.println("Faktoryel hesaplamak icin 10dan kucuk tamsayi giriniz");
        int sayi = scan.nextInt();
        int faktoryel = 1;
        for (int i = sayi; i > 1; i--) {
            faktoryel *= i;
        }

        System.out.println("girilen sayinin faktoryeli : " + faktoryel);

        //==== HARFLERI TEKRARSIZ YAZDIRMA VE SAYISINI HESAPLAMA

        //verilen String'deki kullanilan harfleri
        //tekrarsiz olarak yazdirip
        //kelimede kullanilan farkli harf sayisini veren bir method yaziniz

        String input = "Java her zaman guzel";
        tekrarsizInput(input);


        //==== PALINDROME ====

        //Kullanicinin girdigi String'in palindrome
        //olup olmadigini kontrol eden bir program yazin.

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Lutfen bir yazi girin"); //kayak
        String str = scan2.nextLine();

        if (str.equals(tersineCevir(str))) {
            System.out.println("Girdiginiz String palindrome");
        } else {
            System.out.println("Girdiginiz String palindrome degil");
        }
        scan2.close();


        //==== CARPIM TABLOSU OLUSTURMA ====

        //Verilen sayiya gore carpim tablosu olusturun
        /*
        deger 3
        1 2 3
        2 4 6
        3 6 9
         */
        int deger = 3;
        for (int i = 1; i <= deger; i++) {
            for (int j = 1; j <= deger; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println("");
        }

        //==== YILDIZLARDAN DIKDORTGEN VE UCGEN CIZME - NESTED FOR LOOP ====

        /*Verilen en ve boy degerine gore
        *'lardan olusan bir dikdortgen olusturalim

        yukseklik :3  boy:4

        ****
        ****
        ****
        */

        int yukseklik = 3;
        int genislik = 4;
        for (int i = 1; i <= yukseklik; i++) {
            for (int j = 1; j <= genislik; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        /*
        Verilen input'a gore *'lardan
        olusan bir ucgen olusturun
        ornek input=4 ise

        *
        * *
        * * *
        * * * *

        */
        int veri = 4;

        for (int i = 1; i <= veri; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        /*
        verilen input'a gore *'lardan olusan
        asagidaki sekli olusturun

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * *
         * * *
         * *
         *

         */
        int data = 5;
        for (int i = 1; i <= data; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        for (int i = data; i >= 1; i--) {
            for (int j = i; j > 1; j--) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        /*
        Verilen String'i asagidaki gibi yazdiram bir
        program yazin

        input= Deniz

        D
        De
        Den
        Deni
        Deniz
         */
        String deniz = "Deniz";
        for (int i = 1; i <= deniz.length(); i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(deniz.substring(j - 1, j)); //ilk harf icin substring(0,1) olmali
            }
            System.out.println("");

        }

    }


    private static void tekrarsizInput(String input) {
        //kullanilan harfler (j,a,v,h,e,r,z,m,n,g,u,l)
        String benzersizInput = "";
        String islenecekKelime = input.replaceAll("\\W", "");

        for (int i = 0; i < islenecekKelime.length(); i++) {
            if (!benzersizInput.contains(islenecekKelime.substring(i, i + 1))) {
                benzersizInput += islenecekKelime.substring(i, i + 1);
            }
        }
        System.out.println("input : " + input);
        System.out.println("benzersiz input : " + benzersizInput);

    }


    private static String tersineCevir(String str) {
        String tersSTR = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            tersSTR += str.substring(i, i + 1);
        }
        return tersSTR;
    }


}
