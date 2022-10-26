package day17_nestedForLoop;

public class C05_KendiCalismam {
    public static void main(String[] args) {
        /*verilen input'C01_I gore
         *'lardan olusan asagidaki sekli olusturun

         *
         **
         ***
         ****
         ***
         **
         *

         */

        int input=5;
        for (int i = 1; i <=input; i++) {
            for (int j = 1; j <i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        for (int i = input-1; i >=1 ; i--) {
            for (int j = i; j >1 ; j--) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
