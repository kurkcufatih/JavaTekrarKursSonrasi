package day17_nestedForLoop;

public class C05_NestedForLoop {
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
        //artan kismi nested for loop ile yapalim
        int input=5;
        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <i; j++) { //ucgen oldugu icin i'ye kadar gidecek
                System.out.print("* ");
            }
            System.out.println("");

        }
        for (int i = input-1; i >=1 ; i--) {
            for (int j = i; j >1; j--) {
                System.out.print("* ");
            }
            System.out.println("");

        }
    }
}
