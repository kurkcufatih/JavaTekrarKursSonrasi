package day16_forLoop;

import java.util.Scanner;

public class day16_Tekrar_ForLoop_NestedForLoop {
    public static void main(String[] args) {

    /*
    10 ile 30 arasindaki (10 ve 30 dahil)
    sayilari aralarinda virgul olarak ayni satirda yazdirin
    */
        int ilk = 10;
        int son = 30;

        for (int i = ilk; i <= son; i++) {
            if (i < son) {
                System.out.print(i + ", ");

            } else {
                System.out.println(i);
            }
        }

          /*kullanicidan 100den kucuk bir tamsayi isteyin
        1den baslayarak girilen sayiya kadar tam sayilari yazdirin
        sayi 3 un kati ise sayi yerine "Java"
        sayi 5in kati ise sayi yerine "Guzeldir"
        sayi hem 3un hem rin kati ise yerine "Java Guzeldir" yazdirin
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 1-100 arasi bir tamsayi giriniz");
        int sayi = scan.nextInt();

        for (int i = 1; i < sayi; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("Java Guzeldir" + "\n");
            } else if (i % 3 == 0) {
                System.out.print("Java" + " ");
            } else if (i % 5 == 0) {
                System.out.print("Guzeldir" + " ");
            } else {
                System.out.print(i + " ");
            }

        }

        //==== IKI DEGISKENLI FOR LOOP - SEKIL CIZME ====

        //Bazen tek degisken sorunu cozmeye yetmez

        /*
         *
         * *
         * * *
         * * * *
         * * * * *
         */

        // yukaridaki sekli nested for loop kullanarak * isareti ile ciziniz

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        //Ekrana 10 kez "Java guzeldir" yazdiriniz
        for (int i = 1; i <=10 ; i++) {
            System.out.println(i+". Java Guzeldir");
        }

        //100'den baslayarak 50'ye(dahil) kadar olan sayilari
        //aralarinda virgul olarak ayni satirda yazdirin

        for (int i = 100; i >=50 ; i--) {
            System.out.print(i+", ");
        }

    }
}
