package day13_ElifHocaileTekrar;

import java.util.Scanner;

public class Q10_KendiCozumum {
    public static void main(String[] args) {
        /*
         * Kullanicidan Y/N ikilisinden birisini girdiginde girdigi degeri
         * ekrana yazdiran java kodunu yaziniz.
         * INPUT : Y ,  N
         * OUTPUT : YES ; NO
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Eger Yes ise y harfi, No ise n harfi giriniz");
        char karakter=scan.next().charAt(0);
        if (karakter== 'y' || karakter=='Y') {
            System.out.println("Yes");
        } else if (karakter == 'n' || karakter== 'N') {
            System.out.println("No");
        } else {
            System.out.println("Yanlis giris yaptiniz, lutfen Y/N ikilisinden birini giriniz");
        }

    }
}
