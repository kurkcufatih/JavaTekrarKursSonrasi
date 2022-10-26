package day18_While_doWhileLoop;

import java.util.Scanner;

public class C06_DoWhileLoop {

    /*
Kullanicidan toplamak uzere pozitif sayilar isteyin,
islemi bitirmek icin 0’a basmasini soyleyin.
Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin
ve “Negatif sayi giremezsiniz” yazdirip basa donun
Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini,
yanlislikla kac negative sayi girdigini ve
girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.
*/


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sayi = 0;
        int pozSayiAdedi = 0;
        int negSayiAdedi = 0;
        int PozSayilarTop = 0;
        do {
            System.out.println("Lutfen toplamak uzere pozitif tamsayi giriniz");
            sayi= scan.nextInt();
            if (sayi > 0) {
                PozSayilarTop += sayi;
                pozSayiAdedi++;
            } else if (sayi < 0) {

                System.out.println("Negatif sayi giremezsiniz");

            }
        } while (sayi != 0);
        System.out.println(pozSayiAdedi + " adet pozitif sayi girdiniz, toplamlari :" + PozSayilarTop);
        System.out.println(negSayiAdedi + " adet negatif sayi girdiniz, ancak onlar toplama dahil edilmedi");
    }
}