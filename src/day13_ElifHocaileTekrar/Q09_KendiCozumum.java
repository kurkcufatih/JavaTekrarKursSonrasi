package day13_ElifHocaileTekrar;

import java.util.Scanner;

public class Q09_KendiCozumum {
    // kullaniciya ad, memleket,su anki konum, yas, boy soran bir program olusturun,
    // ve yasadiklari yeri seviyorlarsa
    // bu bilgiyi yazdirin
    // next() only can read the first word
    // nextLine() can read the whole line
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Isminiz : ");
        String isim = scan.nextLine();

        System.out.println("memleketiniz : ");
        String memleket = scan.nextLine();

        System.out.println("suan ki konumunuz : ");
        String konum = scan.nextLine();

        System.out.println("yas : ");
        int yas = scan.nextInt();

        System.out.println("boy : ");
        double boy = scan.nextDouble();

        System.out.println("yasadiginiz yeri seviyor musunuz? : true/false");
        Boolean seviyorMu = scan.nextBoolean();

        System.out.println("Isminiz : " + isim);
        System.out.println("Memleketiniz : " + memleket);
        System.out.println("Suanki konumunuz : " + konum);
        System.out.println("Yasiniz : " + yas);
        System.out.println("Boyunuz : " + boy);
        System.out.println("Yasadiginiz yeri seviyor musunuz : " + seviyorMu);
    }
}


