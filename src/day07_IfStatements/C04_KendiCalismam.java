package day07_IfStatements;

import java.util.Scanner;

public class C04_KendiCalismam {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir gun giriniz");
        String gun=scan.next();
        if (gun.equals("cumartesi") || (gun.equals("pazar"))){
            System.out.println("HAFTASONU");
        }
        if (gun.equals("pazartesi") || gun.equals("sali") || gun.equals("carsamba") || gun.equals("persembe") || gun.equals("cuma")){
            System.out.println("HAFTA ICI");
        }
        if (!((gun.equals("cumartesi") || (gun.equals("pazar") || gun.equals("pazartesi") || gun.equals("sali") || gun.equals("carsamba") || gun.equals("persembe") || gun.equals("cuma"))))) {
            System.out.println("Lutfen gecerli bir gun giriniz");
        }
    }
}
