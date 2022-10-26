package day11_stringManipulations;

public class C04_contains {
    public static void main(String[] args) {
        /*Kullanicidan bir cumle isteyin. Cumle buyuk kelimesi
        iceriyorsa tum cumleyi buyuk harf olarak, kucuk kelimesi
        iceriyorsa tum cumleyi kucuk harf olarak yazdirin.
        Iki kelimeyi de icermiyorsa "Cumle kucuk veya buyuk kelimesi icermiyor" yazdirin.
         */
        String cumle = "Java buyuk, dunya kucuk";
        cumle = cumle.toLowerCase();
        //requirements'de buyuk harf hassasiyeti hakkinda bir sey soylenmemis
        //Ikinci olarak da her iki kelimeyi de icerme durumu aciklanmamis
        //bu durumda gorevi bize kim verdiyse ona sormak lazim

        //ek requierements: ikisini de iceriyorsa "Karar ver buyuk mu yazdirayim, kucuk mu?"
        //case sensitive olmasin
        if (cumle.contains("kucuk") && cumle.contains("buyuk")) {
            System.out.println("Karar ver. Buyuk mu, kucuk mu yazdirayim?");
        } else if (cumle.contains("kucuk")) {
            System.out.println(cumle.toLowerCase());
        } else if (cumle.contains("buyuk")) {
            System.out.println(cumle.toUpperCase());
        }else {
            System.out.println("Cumle kucuk ya da buyuk kelimesi icermiyor.");
        }
    }
}