package GrupCalismalari;

import java.util.Scanner;

public class basamakTop {
    public class basamaktop1 {
        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            System.out.println("lutfen bir sayi giriniz");
            int sayi= scan.nextInt();
            int top=0;
            int temp=sayi;
            while(temp>0){
                top+=temp%10;
                temp=temp/10;
            }
            System.out.println("Girdiginiz "+ sayi +" sayisinin basamaklari toplami :" + top);
        }
    }

}
