package day17_nestedForLoop;

public class C04_KendiCalismam {
    public static void main(String[] args) {
        /*Verilen input'C01_I gore *'lardan
        olusan bir ucgen olusturun
        ornek input=4 ise
        *
        * *
        * * *
        * * * *
        */
        int input=4;
        for (int i = 1; i <=input; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
