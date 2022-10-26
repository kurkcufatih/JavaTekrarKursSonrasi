package day17_nestedForLoop;

public class C03_KendiCalismam {
    public static void main(String[] args) {
         /*Verilen en ve boy degerine gore
        *'lardan olusan bir dikdortgen olusturalim
        yukseklik :4  boy:8
        ****
        ****
        ****
        */
        String input = "* ";
        int yukseklik = 4;
        int boy = 8;
        for (int i = 1; i <= yukseklik; i++) {
            for (int j = 1; j <= boy; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}