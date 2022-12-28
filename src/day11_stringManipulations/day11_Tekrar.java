package day11_stringManipulations;

import java.util.Scanner;

public class day11_Tekrar {

    public static void main(String[] args) {
/*
        //==== indexOf() methodu ====

        String str = "Java ogrenmek cok guzel";
        int ilkE = str.indexOf("e");
        System.out.println("ilk e harfinin idexi : " + ilkE); //8

        System.out.println("ikinci e harfinin indexi : "
                + str.indexOf("e", ilkE + 1)); //11

        System.out.println("=====================");

        //==== lastIndexOf() methodu

        String cumle = "Java cok kolay, Java cok guzel";
        String kelime = "Java";

        int kelimeIlkIndex = cumle.indexOf(kelime);
        int kelimesonIndex = cumle.lastIndexOf(kelime);

        if (kelimeIlkIndex == -1) {
            System.out.println("verilen cumlede Java kelimesi kullanilmamistir");
        } else if (kelimeIlkIndex == kelimesonIndex) {
            System.out.println("kelime cumlede sadece bir defa kullanilmistir");
        } else System.out.println("verilen kelime cumlede birden fazla kullanilmistir.");


        //==== contains() methodu =====

        //Kullanicidan email adresini girmesini isteyin,
        //mail @gmail.com icermiyorsa "Lutfen gmail adresinizi giriniz"
        //@gmail.com ile bitiyorsa "Email adresiniz kaydedildi",
        //@gmail.com ile bitmiyorsa "Lutfen yazimi kontrol ediniz" yazdirin


        Scanner scan = new Scanner(System.in);
        System.out.println("Email adresinizi giriniz");
        String email = scan.nextLine();

        if (!email.contains("@gmail.com")) {
            System.out.println("Lutfen gmail adresinizi giriniz");
        } else{
            System.out.println("gmail adresiniz kaydedildi");
        }
*/

        //==== endsWith() methodu ====

        String str = "Ah be Java";
        System.out.println(str.endsWith("ava")); //true
        System.out.println(str.endsWith("be Java")); //true
        System.out.println(str.endsWith("Ah be Java")); //true
        System.out.println(str.endsWith("")); //true
        System.out.println(str.endsWith("b")); //false

        //==== startsWith() methodu ====

        String input = "Java gun gectikce guzellesiyor";
        System.out.println(input.startsWith("J")); //true
        System.out.println(input.startsWith("")); //true
        System.out.println(input.startsWith("gun", 5)); //true
        System.out.println(input.startsWith("A")); //false
    }
}