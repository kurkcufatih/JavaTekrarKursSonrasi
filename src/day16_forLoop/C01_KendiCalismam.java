package day16_forLoop;

public class C01_KendiCalismam {
    //Verilen bir pozitif tamsayinin
    //pozitif tam bolenlerini yazdiralim
    public static void main(String[] args) {
        int input = 120;
        for (int i = 1; i <= input; i++) {
            if (input % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

}

