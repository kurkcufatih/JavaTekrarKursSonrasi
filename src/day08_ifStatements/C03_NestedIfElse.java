package day08_ifStatements;

import java.util.Scanner;

public class C03_NestedIfElse {
    public static void main(String[] args) {
        //Emeklilik kontrolu yapan bir program yaziniz
        //cinsiyet oolarak E (erkek) veya K (Kadin) degiskenlerini kabul etsin
        //farkli bir harf veya sembol girilirse hata mesaji versin
        // EMeklilik icin kadinlarda yas siniri 60, Erkeklerde 65 olsun.
        //negatif yas veya 80'den buyuk yas girilirse hata mesaji versin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz" +
                "\n Kadin icin K Erkek icin E harfini giriniz");
        char cinsiyet = scan.next().toUpperCase().charAt(0);
        System.out.println("lutfen yasinizi giriniz");
        double yas = scan.nextDouble();
        if (cinsiyet == 'E') {
            if (yas < 0 || yas > 80) {
                System.out.println("Gecerli bir yas giriniz");
            } else if (yas < 65) {
                System.out.println("Emekli olamazsiniz");
            } else {
                System.out.println("Emekli olabilirsiniz");
            }

            } else if (cinsiyet == 'K') {
                if (yas < 0 || yas > 80) {
                    System.out.println("Gecerli bir yas giriniz");
                } else if (yas < 60) {
                    System.out.println("Emekli olamazsiniz");
                } else {
                    System.out.println("Emekli olabilirsiniz");
                }
            } else {
                System.out.println("Gecerli bir tercih giriniz");
            }
        }
    }
