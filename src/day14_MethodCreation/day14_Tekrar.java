package day14_MethodCreation;

public class day14_Tekrar {
    public static void main(String[] args) {

        //input olarak verilen 4 harfli bir string'i tersten
        // yazdiran bir method olusturalim.

        terstenYazdir("Okan");

        int input = 423;
        rakamlariTopla(input);

        String isim = "Fatih";
        String soyisim = "Kurkcu";
        isimGizle(isim, soyisim);

    }

    private static void isimGizle(String isim, String soyisim) {
        isim = isim.substring(0, 1).toUpperCase()
                + isim.substring(1).replaceAll("\\w", "*");

        soyisim = soyisim.substring(0, 1).toUpperCase()
                + soyisim.substring(1).replaceAll("\\w", "*");

        System.out.println(isim + " " + soyisim);


    }

    private static void rakamlariTopla(int input) {
        int birlerBasamagi = 0;
        int rakamlarToplami = 0;

        birlerBasamagi = input % 10;
        rakamlarToplami += birlerBasamagi;
        input /= 10;

        birlerBasamagi = input % 10;
        rakamlarToplami += birlerBasamagi;
        input /= 10;

        birlerBasamagi = input % 10;
        rakamlarToplami += birlerBasamagi;
        input /= 10;

        System.out.println("Girdiginiz sayinin ramkamlar toplami : " + rakamlarToplami); //9


    }

    private static void terstenYazdir(String input) {
        String tersInput = input.substring(3, 4) +
                input.substring(2, 3) +
                input.substring(1, 2) +
                input.substring(0, 1);
        System.out.println(tersInput);

    }


}