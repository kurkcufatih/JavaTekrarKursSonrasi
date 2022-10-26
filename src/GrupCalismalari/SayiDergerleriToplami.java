package GrupCalismalari;

import java.util.Scanner;

public class SayiDergerleriToplami {
    public class basamakdegtoplami {
        public static void main(String[] args) {
            //Sayının Sayı değerlerinin toplamasını yapan Java kodu yazınız.
            Scanner scan=new Scanner(System.in);
            System.out.println("lutfen bir sayi giriniz");
            String sayi= scan.nextLine();
            int sayiint=Integer.parseInt(sayi);
            int top=0;
            int birBas=0;
            int temp=sayiint;
            for (int i =0; i <sayi.length() ; i++) {
                birBas=temp%10;
                top+=birBas;
                temp/=10;
            }
            System.out.println("top = " + top);
        }
    }

}
