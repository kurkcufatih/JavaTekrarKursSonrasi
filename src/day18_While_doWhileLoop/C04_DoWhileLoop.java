package day18_While_doWhileLoop;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {
        /*
        Kullanicida tam sayilar alin
        kullanici cift sayi girdigi
        muddecte sayilari yazdirin
        tek sayi girdiginde islemi bitirin
         */
        Scanner scan = new Scanner(System.in);
        int sayi = 0;

        //while ile yapalim
        /*
        Loop'larda kullanacagimiz variable'lari loop'tan
        once olusturmaliyiz. While loop'ta, looptan once olusturdugumuz
        bu variable'C01_I atayacagimiz degeri iyi dusunmemiz gerekiyor.
         */
        while (sayi % 2 == 0) {
            System.out.println("Lutfen bir sayi giriniz");
            sayi = scan.nextInt();
            if (sayi % 2 == 0) {
                System.out.println("Girilen sayi cift : " + sayi);

            } else {
                System.out.println("Girile sayi tek, benden bu kadar");
            }
        }

        //do while loop ile yapalim;

        /*
        do while loop'da onceden olusturulan variable'C01_I
        hangi deger atandiginin hic bir onemi yok, kodumuz
        her durumda calisir.
         */

        /*
        do-while'in dezavantaji: ilk calistirma kontrol yapilmadan
        oldugu icin loop'un body'sinde yanlis bir islem yapilmamasini
        dikkat etmek gerekir.
         */


        do {
            System.out.println("Lutfen bir sayi giriniz");
            sayi = scan.nextInt();
            if (sayi % 2 == 0) {
                System.out.println("Girilen sayi cift : " + sayi);

            } else {
                System.out.println("Girile sayi tek, benden bu kadar");
            }
        }while (sayi % 2 == 1) ;
    }
}