package day18_While_doWhileLoop;

import java.util.Scanner;

public class C06_KendiCalismam {
    public static void main(String[] args) {
           /*
Kullanicidan toplamak uzere pozitif sayilar isteyin,
islemi bitirmek icin 0’C01_I basmasini soyleyin.
Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin
ve “Negatif sayi giremezsiniz” yazdirip basa donun
Kullanici 0’C01_I bastiginda toplam kac pozitif sayi girdigini,
yanlislikla kac negative sayi girdigini ve
girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.
*/
        Scanner scan = new Scanner(System.in);
        int sayi = 0;
        int pozSayAdedi = 0;
        int negSayAdedi = 0;
        int pozSayTop = 0;

        do {
            System.out.println("Lutfen sayi giriniz");
            sayi = scan.nextInt();
            if (sayi > 0) {
                pozSayTop += sayi;
                pozSayAdedi++;
            } else if (sayi < 0) {
                System.out.println("Negatif sayi giremezsiniz");
                negSayAdedi++;
            }
        } while (sayi != 0);
                System.out.println("Girilen pozitif sayi : " + pozSayAdedi + ", " + " ve toplamlari: " + pozSayTop);
                System.out.println("Girilen negatif sayi : " + negSayAdedi);
            }
    }
