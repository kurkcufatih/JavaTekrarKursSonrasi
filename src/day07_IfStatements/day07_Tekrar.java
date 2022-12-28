package day07_IfStatements;

import java.util.Scanner;

public class day07_Tekrar {
    public static void main(String[] args) {
        //========= IF =========

        /*
		 * Soru 2) Kullanicidan gun isimlerinden birinin ilk harfini isteyin
		 * ve o harfle baslayan gun isimlerini yazdirin
			Ornek: 	ilkHarf=P output = �Pazar, Pazartesi veya Persembe�
			ilkHarf=S output = �Sali�
		 *** Buyuk kucuk harf problem olmamasi icin toUpperCase methodunu kullanin


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun isimlerinden birinin ilk harfini giriniz");
        char ilkHarf = scan.next().toUpperCase().charAt(0);

        if (ilkHarf == 'P') {
            System.out.println("Pazar, Pazartesi veya Persembe");
        }
        if (ilkHarf == 'S') {
            System.out.println("Sali");
        }
        if (ilkHarf == 'C') {
            System.out.println("Carsamba, Cuma veya Cumartesi");
        }
        if (ilkHarf != 'P' && ilkHarf != 'S' && ilkHarf != 'C') {
            System.out.println("Gecersiz harf girdiniz, Lutfen gun isimlerinden birinin bas harfini giriniz");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = scanner.nextInt();

        if (sayi % 2 == 0) {
            System.out.println("Girdiginiz sayi cift sayidir");
        }
        if (sayi % 2 == 1) {
            System.out.println("Girdiginiz sayi tek sayidir");
        }

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");
        String gun = scan2.next().toLowerCase();

        if (gun.equals("pazar") || gun.equals("cumartesi")){
            System.out.println("Haftasonu");
        }
        if (gun.equals("pazartesi") || gun.equals("sali") || gun.equals("carsamba") || gun.equals("persembe") || gun.equals("cuma")){
            System.out.println("Haftaici");
        }
*/
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");

        char harf = scanner2.next().charAt(0);
        if ((harf >= 'a' && harf <= 'z') || (harf >= 'A' && harf <= 'Z')) {
            System.out.println("Girilen karakter bir harf");
        } else {
            System.out.println("Girilen karakter bir harf degil");
        }
    }
}
