package day11_stringManipulations;

public class C06_endsWith {
    public static void main(String[] args) {
        /* Kullanicidan email adresini girmesini isteyin,
        mail @gmail.com icermiyorsa "Lutfen gmail adresinizi giriniz"
        @gmail ile bitiyorsa "Email adresiniz kaydedildi",
        @gmail.com ile bitmiyorsa "Lutfen yazimi kontrol ediniz" yazdirin*/
    String input="fatih@gmail.com";
        if (!input.contains("@gmail.com")){
            System.out.println("Lutfen gmail adresinizi giriniz");
        } else if (input.endsWith("@gmail.com")) {
            System.out.println("Email adresiniz kaydedildi");
} else {
            System.out.println("Lutfen yazimi kontrol ediniz yazdirin");
        }
    }
}
