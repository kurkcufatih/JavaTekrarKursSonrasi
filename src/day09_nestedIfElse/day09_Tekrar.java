package day09_nestedIfElse;

import java.util.Scanner;

public class day09_Tekrar {
    public static void main(String[] args) {
/*
        //==== NESTED IF ELSE ====

        // Soru 11) Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
        // Kullanicidan bir sifre girmesini isteyin
        // Eger ilk harf buyuk harf ise
        // �A� olup olmadigini kontrol edin.
        // Ilk harf A ise 	�Gecerli Sifre� degilse �Gecersiz Sifre� yazdirin.
        // Eger ilk harf kucuk harf ise �z� olup olmadigini kontrol edin.
        // Ilk harf z ise 	�Gecerli Sifre� 	degilse �Gecersiz Sifre� yazdirin.

        System.out.println("Lutfen bir sifre giriniz");
        Scanner scan = new Scanner(System.in);

        char ilkHarf = scan.next().charAt(0);
        if (ilkHarf >= 'A' && ilkHarf <= 'Z') {
            if (ilkHarf == 'A') {
                System.out.println("Gecerli sifre");
            } else System.out.println("Gecersiz sifre");
        } else if (ilkHarf >= 'a' && ilkHarf <= 'z') {
            if (ilkHarf == 'z') {
                System.out.println("Sifre gecerli");
            } else System.out.println("sifre gefcersiz");
        } else {
            System.out.println("Gecerli sifre olmasi icin harf ile baslayiniz");
        }


        // Soru12)Kullan�c�dan 4 basamakli bir sayi girmesini isteyin.
        // Girdi�i sayi 5�e b�l�n�yorsa son rakam�n� kontrol edin.
        // Son rakam� 0 ise ekrana �5�e b�l�nen �ift say�� yazd�r�n.
        // Son rakam� 0 de�il ise �5�e b�l�nen tek say�� yazd�r�n.
        // Girdi�i password 5�e b�l�nm�yorsa ekrana �Tekrar deneyin� yazd�r�n.

        System.out.println("Lutfen 4 basamakli bir sayi giriniz");
        Scanner scan2 = new Scanner(System.in);

        int sayi = scan2.nextInt();
        if (sayi < 1000 || sayi > 9999) {
            System.out.println("4 basamakli pozitif bir sayi girmelisiniz");
        } else {
            if (sayi % 5 == 0) {
                if (sayi % 10 == 0) {
                    System.out.println("5'e bolunen cift sayi");
                } else {
                    System.out.println("5'e bolunen tek sayi");
                }
            } else {
                System.out.println("Tekrar deneyin");
            }

        }


        //==== TERNARY OPERATORS ====

        int x = 5;
        String tekMiCiftMi = x % 2 == 0 ? "cift sayi" : "tek sayi";

        // ternary iki turlu kullanilabilir
        // ya donen sonuca gore bir variable olusturup assign ederiz
        // veya direk syso icine yazip sonucu yazdiririz

        System.out.println(tekMiCiftMi);
        System.out.println(x % 2 == 0 ? "cift sayi" : "tek sayi");

        // eger ternary de donecek sonuclar ayni data turunden degilse
        // atama yapamayiz, sadece sout ile yazdirabiliriz

        System.out.println(x > 5 ? "Aferin" : 4);

        //Kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin.

        Scanner scan3 = new Scanner(System.in);
        System.out.println("Lutfenn bir sayi giriniz");
        double sayii = scan3.nextDouble();
        System.out.println(sayii >= 0 ? sayii : (-1 * sayii));

        //kullanicidan bir sayi isteyin eger sayi pozitif ise
        // sayiyi yazdirin,sayi sifir veya negatif ise, bir sayi daha isteyin ve ikisinin carpimini yazdirin

        Scanner scan4 = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        double sayiii = scan4.nextDouble();
        if (sayiii > 0) {
            System.out.println(sayiii);
        }
        if (sayiii <= 0) {
            System.out.println("Lutfen bir sayi daha giriniz");
            double sayi2 = scan4.nextDouble();
            System.out.println("Girdiginiz iki sayinin carpimi : "+sayiii * sayi2);
        }
        */

        //==== SWITCH CASE ====

        /* Kullanicidan gun numarasini alip
        1 ise pazartesi,
        ...
        7 ise pazar yazdiralim
         */

        Scanner scan5 = new Scanner(System.in);
        System.out.println("Lutfen kacinci gun oldugunu giriniz");
        int gunNo = scan5.nextInt();

        switch (gunNo) {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Sali");
                break;
            case 3:
                System.out.println("Carsamba");
                break;
            case 4:
                System.out.println("Persembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Lutfen gecerli bir gun sayisi giriniz (1-7 arasi)");
        }
    }
}

