package GrupCalismalari;

import java.util.Scanner;

public class replitSwitchCase {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String harf=scan.next();
        switch (harf){
            case "C01_I":
                System.out.print("Talebiniz isleniyor");
                break;
            case "b":
                System.out.print("yine de ilgilendiginiz icin tesekkur ederiz");
                break;
            case "c":
                System.out.print("Uzgunuz su anda herhangi bir yardim yok");
                break;
            default:
                System.out.print("Gecersiz giris, lutfen tekrar deneyin!"); }
    }
}
