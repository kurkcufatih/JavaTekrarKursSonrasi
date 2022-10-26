package GrupCalismalari;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

    public class sesliHarfler {
        public static void main(String[] args) {
       /* Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
                değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
        1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
        Sesli harfler: C01_I,e,i,o,u
        Test Data:
        C01_I
        Beklenen Çıktı:
        C01_I harfi sesli harfdir.
        Test Data:
        d
        Beklenen Çıktı:
        d harfi sesiz harftir.
        Test Data:
        we  yada %
        Beklenen Çıktı:
        Yanlis karakter girdiniz!
        */
            Scanner scan =new Scanner (System.in);
            System.out.println("lutfen bir harf giriniz");
            char harf=scan.next().charAt(0);
            List<Character> sesliharfler=new ArrayList<>();
            sesliharfler.addAll(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
            if(sesliharfler.contains(harf)){
                System.out.println("girdiginiz harf sesli harftir");
            } else if(harf>='a' && harf<='z'){
                System.out.println("girdiginiz harf sessiz harftir");
            } else if (harf>='A'&& harf<='Z'){
                System.out.println("girdiginiz harf sessiz harftir");
            } else
                System.out.println("gecersiz karakter girdiniz");
        }
    }

