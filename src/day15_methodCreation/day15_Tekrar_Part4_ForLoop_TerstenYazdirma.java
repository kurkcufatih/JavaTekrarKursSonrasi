package day15_methodCreation;

import java.util.Scanner;

public class day15_Tekrar_Part4_ForLoop_TerstenYazdirma {
    public static void main(String[] args) {

        //==== FOR LOOP ====

        //1'den 5'e kadar (5 dahil) olan tamsayilari toplayalim
        int toplam = 0;
        for (int i = 1; i <= 5; i++) {
            toplam += i;
        }
        System.out.println("1-5 arasi toplami : " + toplam);

        /*sout loop'un icine yazilirsa hepsini ayri ayri yazdirir,
        o yuzden for parantezinin disinda yazdir yaptirmamiz gerekiyor*/

        //10 dahil-20 dahil arasindaki sayilari toplayalim
        toplam = 0;
        for (int i = 10; i <= 20; i++) {
            toplam += i;
        }
        System.out.println("10-20 arasi toplami : " + toplam);

        // 30 dahil-50 dahil, arasindaki cift sayilari toplayin
        toplam = 0;
        for (int i = 30; i <= 50; i++) {
            if (i % 2 == 0) {
                toplam += i;
            }
        }
        System.out.println("30-50 arasindaki 2'ye tam bolunebilen sayilarin toplami :" + toplam);

        //1500 ile 1600 (sinirlar dahil) arasinda 7 ile bolunebilen sayilarin toplami
        toplam = 0;
        for (int i = 1500; i <= 1600; i++) {
            if (i % 7 == 0) {
                toplam += i;
            }
        }
        System.out.println("1500-1600 arasindaki 7'ye tam bolunebilen sayilarin toplami : " + toplam);

        //100'den bire kadar(sinirlar dahil)
        // 8 ile bolunebilen sayilari ve bu sayilarin toplamini yazdirin
        toplam = 0;
        for (int i = 100; i >= 1; i--) {
            if (i % 8 == 0) {
                System.out.print(i + " ");
                toplam += i;
            }
        }
        System.out.println("\n" + "==============");
        System.out.println("100-1 arasinda 8'e tam bolunebilen sayilarin toplami : " + toplam);

        //==== FOR LOOP ILE TERSTEN YAZDIRMA ====

        //input olarak verilen String'i
        //terse cevirip yazdiran bir method olusturun.
        //For loop kullanin

        String str = "Java gun gectikce guzellesiyor";
        terstenYazdir(str);

    }

    private static void terstenYazdir(String str) {
        String tersSTR = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            tersSTR += str.substring(i, i + 1);
        }
        System.out.println(tersSTR);


        //==== FOR LOOP ILE FAKTORYEL HESAPLAMA
        /*
        input olarak verilen bir tamsayi icin faktoriyel
        hesaplayip yazdiran bir method olusturun, verilen sayi  negatif
        veya 20'den buyuk olursa "Girilen sayinin faktoryeli hesaplanamaz"
        uyarisi yazdirin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 1-20 arasinda bir sayi giriniz");
        int sayi = scan.nextInt();
        faktoryelHesapla(sayi);

    }

    private static void faktoryelHesapla(int sayi) {
        int faktoryel = 1;
        if (sayi<0 || sayi>20){
            System.out.println("Girilen sayinin faktoryeli hesaplanamaz");
        } else if (sayi==0) {
            System.out.println("0!=1'dir");
        } else {
            for (int i = 1; i <sayi ; i++) {
                faktoryel*=i;
            }
            System.out.println(sayi+" sayisinin faktoryel degeri : "+faktoryel);
        }
    }
}
