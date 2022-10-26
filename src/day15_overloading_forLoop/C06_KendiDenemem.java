package day15_overloading_forLoop;

public class C06_KendiDenemem {
    public static void main(String[] args) {
        //input olarak verilen String'i terse cevirip yazdiran bir method olusturun
        String input = "Java gun gectikte guzellesiyor";
        String kelime="Java gun gectikte guzellesiyor";
        terstenYaz(kelime);
        tertenYazdir(input);


    }

    private static void terstenYaz(String kelime) {
        for (int i = kelime.length()-1; i >=0; i--) {
            System.out.print(kelime.charAt(i));
        }
    }

    private static void tertenYazdir(String input) {

        for (int i = input.length() - 1; i >= 0; i--) {
            System.out.print("\n" + input.charAt(i));
        }



    }
}
