package day11_stringManipulations;

import java.util.Scanner;

public class C06_KendiCalismam {
    public static void main(String[] args) {
         /* Kullanicidan email adresini girmesini isteyin,
        mail @gmail.com icermiyorsa "Lutfen gmail adresinizi giriniz"
        @gmail ile bitiyorsa "Email adresiniz kaydedildi",
        @gmail.com ile bitmiyorsa "Lutfen yazimi kontrol ediniz" yazdirin
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen mail adresinizi giriniz");
        String email = scan.nextLine();

        if (!email.contains("@gmail.com")){
            System.out.println("Lutfen mail adresinizi giriniz");
        } else if (email.endsWith("@gmail.com")) {
            System.out.println("email adresiniz kaydedildi");
        } else if (!email.endsWith("@gmail.com")) {
            System.out.println("Lutfen yazimi kontrol ediniz");
        }
    }
}
