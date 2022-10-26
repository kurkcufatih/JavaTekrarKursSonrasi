package day14_MethodCreation;

public class C02_KendiCalismam {
    public static void main(String[] args) {
        int input=423;
        rakamlarTop(input);
    }

    public static void rakamlarTop(int input) {

        int birlerBasamagi=0;
        int rakamlarToplami=0;

        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input /=10;


        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input /=10;

        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input /=10;

        System.out.println("Girilen sayilarin rakamlar toplami : " + rakamlarToplami);
    }
}
