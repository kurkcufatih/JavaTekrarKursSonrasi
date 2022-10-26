package day14_MethodCreation;

public class C02_MethodCreation {

    public static void main(String[] args) {
        //Verilen 3 basamakli bir sayinin
        //rakamlari toplamini yazdiran program yaziniz
        int input = 423;
        C02_MethodCreation.rakamlariTopla(input);
        rakamlariTopla(input);


    }

    public static void rakamlariTopla(int input) {
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
        System.out.println("Girdiginiz " + input + "sayisinin : " + rakamlarToplami);

    }


}
