package GrupCalismalari;

import java.util.Scanner;

public class O100denKucuk {
    public static void main(String[] args) {
        //kullanicidan 100den kucuk bir tamsayi isteyin
        //1den baslayaarak girilen sayiya kadar 3un kati olan sayilari yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 100'den kucuk bir tamsayi giriniz");
        int sayi= scan.nextInt();
        for (int i=1; i<sayi; i++){
            if(i%3==0){
                System.out.println(i+" ");
            }
        }
    }
}
