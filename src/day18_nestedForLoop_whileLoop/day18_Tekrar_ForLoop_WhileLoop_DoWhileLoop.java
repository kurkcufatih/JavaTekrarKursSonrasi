package day18_nestedForLoop_whileLoop;

import java.util.Scanner;

public class day18_Tekrar_ForLoop_WhileLoop_DoWhileLoop {
    public static void main(String[] args) {
        // kullanicidan 2 tam sayi isteyin
        // ilk sayidan baslayarak , ikinci sayiya kadar ucer, ucer yazdirin
        // (ikinci sayi dahil olmak zorunda degil)


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();


        if (sayi1 > sayi2) {
            for (int i = sayi1; i >= sayi2; i -= 3) {
                System.out.print(i + " ");
            }
        } else if (sayi1 < sayi2) {
            for (int i = sayi1; i <= sayi2; i += 3) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("Girilen sayilar esit");
        }

        // Kullanicidan 10'dan kucuk pozitif bir tamsayi girmesini isteyin
        // girdigi sayiya gore asagidaki sekli yazdirin
        // orn : 3 girilirse
        // 1
        // 1 2
        // 1 2 3

        Scanner scan2 = new Scanner(System.in);
        System.out.println("\nLutfen 10'dan kucuk pozitif bir tam sayi giriniz");
        int sayi = scan2.nextInt();

        for (int i = 1; i <= sayi; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");

        }

        /*
        Kullanicidan baslangic ve bitis harflerini alin
        ve baslangic harfinden baslayip bitis harfinde biten
        tum harfleri buyuk harf olarak ekrana yazdirin
        Kullanicinin hata yapmadigini farz edin
         */

        char ilkHarf = 'f';
        char sonHarf = 't';

        //YOL 1 while ile

        char temp = ilkHarf;
        String buyult = "";


        while (temp <= sonHarf) {
            buyult = (temp + "").toUpperCase();
            System.out.print(buyult + " ");
            temp += 1;
        }

        //YOL 2 for loop ile

        buyult = "";
        for (int i = ilkHarf; i <= sonHarf; i++) {
            buyult += ((char) i) + " ";
        }
        System.out.println(buyult.toUpperCase());


        /*
        * While loop'da once kontrol edip sonra islem yaptigimiz icin
        islem bittikten sonra loop'un kirilmasi icin bir kez daha
        basa donmemiz gerekiyor, bu durumda fazladan bir islem yapiliyor

        * do-while loop ile calistigimizda bu dezavantaj ortadan kalkar
         */
        sayi = 7;
        do {
            System.out.print(sayi + " ");
            sayi++;
        } while (sayi < 10);


          /*
        Kullanicida tam sayilar alin
        kullanici cift sayi girdigi
        muddecte sayilari yazdirin
        tek sayi girdiginde islemi bitirin
         */

        System.out.println();

        do {
            System.out.println("Lutfen bir rakam giriniz");
            sayi = scan.nextInt();
            if (sayi % 2 == 0) {
                System.out.println(sayi + " ");
            } else {
                System.out.println("Girilen sayi tek, islem sonlandirildi");
            }
        } while (sayi % 2 == 1);



            /*
            Kullanicidan toplamak uzere pozitif sayilar isteyin,
            islemi bitirmek icin 0’a basmasini soyleyin.
            Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin
            ve “Negatif sayi giremezsiniz” yazdirip basa donun
            Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini,
            yanlislikla kac negative sayi girdigini ve
            girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.
            */

        int pozitifSayiAdedi = 0;
        int negSayiAdedi = 0;
        int pozSayilarTop = 0;
        do {
            System.out.println("Lutfen pozitif sayi giriniz");
            sayi = scan.nextInt();
            if (sayi > 0) {
                pozSayilarTop += sayi;
                pozitifSayiAdedi++;
            } else if (sayi < 0) {
                System.out.println("Negatif sayi giremezsiniz");
            }
        } while (sayi != 0);
        System.out.println(pozitifSayiAdedi + " adet pozitif sayi girdiniz, girdiginiz sayilarin toplami : " + pozSayilarTop);
        System.out.println(negSayiAdedi + " adet negatif sayi girdiniz");


    }
}
