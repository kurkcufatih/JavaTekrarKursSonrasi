package day16_forLoop;

import java.util.Scanner;

public class C04_KendiCalismam {
    public static void main(String[] args) {
        /*kullanicidan 100den kucuk bir tamsayi isteyin
        1den baslayarak girilen sayiya kadar tam sayilari yazdirin
        sayi 3 un kati ise sayi yerine "Java"
        sayi 5in kati ise sayi yerine "Guzeldir"
        sayi hem 3un hem rin kati ise yerine "Java Guzeldir" yazdirin
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 0'dan buyuk 100'den kucuk bir tamsayi giriniz");
        int tamsayi = scan.nextInt();
        for (int i = 1; i <= tamsayi; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("Java Guzeldir" + " ");
            } else if (i % 3 == 0) {
                System.out.print("Java" + " ");
            } else if (i % 5 == 0) {
                System.out.print("Guzeldir" + " ");
            } else {
                System.out.print(i + " ");
            }

        }

    }
}
