package day13_MethodCreation;

import java.util.Scanner;

public class day13_Tekrar {
    public static void main(String[] args) {
        // Soru 1) String methodlarini kullanarak  "  Java ogrenmek123 Cok guzel@  "
        // String'ini "JAVA OGRENMEK COK GUZEL" sekline getirin.

        String cumle = "  Java ogrenmek123 Cok guzel@  ";

        cumle = cumle.trim();
        System.out.println(cumle); //Java ogrenmek123 Cok guzel@

        cumle = cumle.replaceAll("\\s", "x");
        System.out.println(cumle); //Javaxogrenmek123xCokxguzel@

        cumle = cumle.replaceAll("\\W", "");
        System.out.println(cumle); //Javaxogrenmek123xCokxguzel

        cumle = cumle.replaceAll("\\d", "");
        System.out.println(cumle); //JavaxogrenmekxCokxguzel

        cumle = cumle.replace("x", " ");
        System.out.println(cumle); //Java ogrenmek Cok guzel

        cumle = cumle.toUpperCase();
        System.out.println(cumle); //JAVA OGRENMEK COK GUZEL


        // Soru 2) String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
        //		String str1 = "$13.99"
        //		String str2 = "$10.55"
        //		ipucu : Double.parseDouble() methodunu kullanabilirsiniz.

        String str1 = "$13.99";
        String str2 = "$10.55";

        str1 = str1.replaceAll("\\W", "");
        System.out.println(str1);

        str2 = str2.replaceAll("\\W", "");
        System.out.println(str2);

        double sayi1 = Double.parseDouble(str1) / 100;
        System.out.println(sayi1);
        double sayi2 = Double.parseDouble(str2) / 100;
        System.out.println(sayi2);

        System.out.println("girilen iki sayinin toplami : $" + (sayi1 + sayi2)); //$24.54


        // Soru 5) Kullanicidan 4 harfli bir kelime isteyin
        // ve girilen kelimeyi tersten yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen dort harfli bir kelime giriniz");
        String kelime = scan.next();

        if (kelime.length() != 4) {
            System.out.println("Lutfen dort harfli bir kelime giriniz");
        } else {
            String tersKelime = kelime.substring(3, 4);
            tersKelime += kelime.substring(2, 3);
            tersKelime += kelime.substring(1, 2);
            tersKelime += kelime.substring(0, 1);
            System.out.println(tersKelime);
        }


        //Method creation

        int input1 = 10;
        int input2 = 20;

        topla(input1, input2);
    }

    private static void topla(int input1, int input2) {
        System.out.println("girilen iki sayinin toplami : " + (input1 + input2));
    }


}

