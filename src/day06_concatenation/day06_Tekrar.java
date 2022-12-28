package day06_concatenation;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class day06_Tekrar {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Guzeldir";
        int sayi1 = 5;
        int sayi2 = 4;

        System.out.println(str1 + " " + str2); //Java Guzeldir
        System.out.println(str1 + " " + sayi1 + sayi2 + " " + str2); //Java 54 Guzeldir
        System.out.println(str1 + " " + str2 + " " + sayi1 + sayi2); //Java Guzeldir 54
        System.out.println(sayi1 + " " + str1 + " " + str2 + " " + sayi2); //5 Java Guzeldir 4

        // & yavas
        // && hizli

        System.out.println(5 + 3 == 8 || 6 + 5 == 10 || 7 - 2 == 3);// true

        System.out.println(5 + 3 == 8 && 6 + 5 == 10 && 7 - 2 == 3);// false

        int a = 10;
        int b = 20;
        int c = 30;

        boolean sonuc = a > b || b > c || a + b >= c;

        System.out.println(sonuc); // true

        int d = 10;
        int e = 15;
        int f = 20;

        System.out.println(d > 0 && e < 20 && f >= e);    //And operatoru ile baglandigi icin true and true and true oldgu icin sonuc true olur.//
        // true   true    true
        System.out.println(d < 0 && e < 20 && f >= e);   // And operatoru ile baglandigi icin bir tane bile false olsa sonuc false oldugundan false tur//
        // false  true    true

        //Java And operatoru konusunda bize iki seccenek sunar, eger && kullanirsak, ilk false buldugunda artik sonucun false olacagini bilir ve geriye kalan sartlari incelemez. Ama tek & kullanirsak butun asamalari kontrol eder sonra sonucu belirler, bu calisma usulunden dolayi && operatorunden daha yavas olabilir.

        System.out.println(d < 0 & e < 20 & f >= e);     // bir tane & bile koysaniz sonuc yine false olur, java bir defa and gorur ve false ise sonuc false tur. Tek & olunca daha yavas calisi cunku hepsine tek tek bakar//


    }
}