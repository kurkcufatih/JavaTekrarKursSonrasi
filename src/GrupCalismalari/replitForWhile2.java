package GrupCalismalari;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class replitForWhile2 {
    /* Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak Bölen) ve LCM'yi (En Küçük Ortak Kat) bulmasını isteyin.

    Input :

            30

            40

    Beklenen Cikti:
            30 ve 40 icin GCD = 10

30 ve 40 icin LCM = 120
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        List<Integer> ortakBolenler = new ArrayList<>();

        for (int i = 1; i < 30; i++) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ortakBolenler.add(i);
            }
        }
        int GCD = ortakBolenler.get(3);
        System.out.println("30 ve 40 icin GCD = " + GCD);


        List<Integer> enKucukOrtakKat = new ArrayList<>();
        for (int i = sayi1; i < sayi1 * sayi2; i++) {
            if (i % sayi1 == 0 && i % sayi2 == 0){
                enKucukOrtakKat.add(i);
        }
    }
        System.out.println("30 ve 40 icin LCM = "+enKucukOrtakKat.get(0));
}
}
