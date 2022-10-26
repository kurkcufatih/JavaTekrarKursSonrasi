package day14_MethodCreation;

public class C01_MethodCreation {
    public static void main(String[] args) {
        //input olarak verilen 4 harfli bir string'i tersten
        // yazdiran bir method olusturalim.
        terstenYazdir("Okan");
C01_MethodCreation.terstenYazdir("Nuri");
    }

    public static void terstenYazdir(String input) {
        //bizden istenen sey sadece yazdirma oldugu icin bir sey
        // dondurmeyecegi icin void yapiuoruz
        String tersInput = input.substring(3) +
                input.substring(2, 3) +
                input.substring(1, 2) +
                input.substring(0, 1);
        System.out.println("Girilen kelimenin tersten yazilisi :" + tersInput);
    }

}
