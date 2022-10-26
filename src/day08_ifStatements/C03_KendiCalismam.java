package day08_ifStatements;

import java.util.Scanner;

public class C03_KendiCalismam {
    //Emeklilik kontrolu yapan bir program yaziniz
    //cinsiyet oolarak E (erkek) veya K (Kadin) degiskenlerini kabul etsin
    //farkli bir harf veya sembol girilirse hata mesaji versin
    // Emeklilik icin kadinlarda yas siniri 60, Erkeklerde 65 olsun.
    //negatif yas veya 80'den buyuk yas girilirse hata mesaji versin

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi K (kadin) ve E (erkek) harflerinden biri ile ifade ediniz");
        char cinsiyet = scan.next().toUpperCase().charAt(0);

        System.out.println("Lutfen yasinizi giriniz");
        int yas = scan.nextInt();


        if (cinsiyet == 'E') {
            if (yas < 0 && yas > 80) {
                System.out.println("Gecerli bir yas giriniz");
            } else if (yas > 65) {
                System.out.println("Emekli olabilirsiniz");
            } else {
                System.out.println(65 - yas + " yil daha calismalisiniz");
            }
        }
        if (cinsiyet == 'K') {
            if (yas < 0 && yas > 80) {
                System.out.println("Lutfen gecerli bir yas giriniz");
            } else if (yas > 60) {
                System.out.println("Emekli olabilirsiniz");
            } else {
                System.out.println(60 - yas + " yil daha calismalisiniz");
            }
        }
    }
}