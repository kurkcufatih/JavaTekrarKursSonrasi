package GrupCalismalari;

import java.util.Scanner;

public class replitForWhile {
    /*Kullanıcıdan bir isim ve bir karakter girmesini isteyin, ardından döngüleri kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.

    char ch1= 'C01_I' ;

    String name =“John came late"

    Expected Output:

    Number of C01_I = 2
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir isim giriniz ");
        String isim = scan.nextLine();
        System.out.println("Lutfen bir harf giriniz");
        char harf = scan.next().charAt(0);
        int sayac = 0;


        for (int i = 0; i < isim.length(); i++) {
            if (harf == isim.charAt(i)) {
                sayac++;
            }

        }
        System.out.println("Number of C01_I = " + sayac);

    }
}

