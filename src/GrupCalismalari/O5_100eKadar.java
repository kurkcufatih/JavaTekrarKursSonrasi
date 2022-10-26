package GrupCalismalari;

import java.util.Scanner;

public class O5_100eKadar {
    public static void main(String[] args) {
        //kullanicidan 100den kucuk bir sayi isteyiniz
        //3un ve 5in kati olan sayilari yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 100den kucuk bir tamsayi girini");
        int sayi= scan.nextInt();
        for (int i=1; i<sayi;i++){
            if (i%3==0 || i%5==0){
                System.out.print(i+" ");
            }
        }
    }
}
