package day11_stringManipulations;

import java.util.Scanner;

public class C03_KendiCalismam {
    public static void main(String[] args) {
        /* Kullanicidan email adresini girmesini isteyin,
        mail @gmail.com icermiyorsa "Lutfen gmail adresinizi giriniz"
        @gmail ile bitiyorsa "Email adresiniz kaydedildi",
        @gmail.com ile bitmiyorsa "Lutfen yazimi kontrol ediniz" yazdirin*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gmail adresinizi giriniz");
        String email = scan.nextLine();

        if (email.contains("@gmail.com")) {
            System.out.println("Email adresiniz kaydedildi");
        } else if (!(email.lastIndexOf("@gmail.com")==email.length()-10)) {
            System.out.println("Lutfen email adresinizi giriniz");
        } else {
            System.out.println("Lutfen yazimi kontrol ediniz");
        }
    }
}
