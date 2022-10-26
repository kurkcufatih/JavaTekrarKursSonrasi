package day09_TernaryOperator;

import java.util.Scanner;

public class C06_KendiCalismam {
    //Kullanicidan gun ismini alin
    // haftaici veya haftasonu oldugunu yazdirin

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun ismi giriniz");
        String gunIsmi= scan.next();
        switch (gunIsmi){
            case "Pazartesi":
                System.out.println("Haftaici");
                break;
            case "Sali":
                System.out.println("Haftaici");
                break;
            case "Carsamba":
                System.out.println("Haftaici");
                break;
            case "Persembe":
                System.out.println("Haftaici");
                break;
            case "Cuma":
                System.out.println("Haftaici");
                break;
            case "Cumartesi":
                System.out.println("Haftasonu");
                break;
            case "Pazar":
                System.out.println("Haftasonu");
                break;
            default:
                System.out.println("Lutfen gecerli gun ismini giriniz");
        }
    }
}
