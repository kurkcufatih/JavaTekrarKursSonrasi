package GrupCalismalari;

import java.util.Scanner;

public class Q6_Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir isi bitirme suresi");
        int isiBitirmeSuresi=scan.nextInt();
        System.out.println("Kac isci calisacak");
        int isciSayisi= scan.nextInt();
        System.out.println("toplam is miktari");
        int toplamIS=scan.nextInt();
        System.out.println("Bir isci isi : " +isiBitirmeSuresi);
        System.out.println("Toplam isci sayisi : " +isciSayisi);
        System.out.println("Toplam is miktari : " +toplamIS);
        System.out.println("Isi bitirme suresi "+(isciSayisi*isiBitirmeSuresi)/toplamIS);
    }
}
