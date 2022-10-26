package day11_stringManipulations;

import java.util.Scanner;

public class C03_Contains {
    public static void main(String[] args) {
        /* Kullanicidan email adresini girmesini isteyin,
        mail @gmail.com icermiyorsa "Lutfen gmail adresinizi giriniz"
        @gmail.com ile bitiyorsa "Email adresiniz kaydedildi",
        @gmail.com ile bitmiyorsa "Lutfen yazimi kontrol ediniz" yazdirin*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen email yaziniz");
        String email = scan.nextLine();
        if (!email.contains("@gmail")) {
            System.out.println("Lutfen gmail adresinizi giriniz");

        } else if (email.lastIndexOf("@gmail.com") == email.length() - 10) {
            System.out.println("Email adresiniz kaydedildi");

        } else {
            System.out.println("Lutfen yazimi kontrol ediniz");
        }
    }
}

