package day15_overloading_forLoop;

public class C08_KendiDenemem {
    public static void main(String[] args) {
         /*
        input olarak verilen bir tamsayi icin faktoriyel
        hesaplayip yazdiran bir method olusturun, verilen sayi  negatif
        veya 20'den buyuk olursa "Girilen sayinin faktoryeli hesaplanamaz"
        uyarisi yazdirin
         */
        int input = 6;
        method(input);
    }

    private static void method(int input) {
        int faktoryel = 1;

        if (input < 0 || input > 20) {
            System.out.println("Girilen sayinin faktoryeli hesaplanamaz");
        } else if (input == 0) {
            System.out.println("0!=1");
        } else {
            for (int i = 1; i <= input; i++) {
                faktoryel*= i;
            }
            System.out.println(faktoryel);
        }
    }
}

