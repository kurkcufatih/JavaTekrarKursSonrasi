package day18_While_doWhileLoop;

public class C05_KendiCalismam {
    public static void main(String[] args) {
        /*
    9'dan 190'C01_I kadar 7 nin kati olan tum
    tamsayilari ekrana yazdirin
     */
        int bas = 9;
        int son = 190;
        int temp = bas;

        do {
            if (temp % 7 == 0) {
                System.out.println(temp + " ");
            }
            temp++;
        } while (temp < son);
    }
}
