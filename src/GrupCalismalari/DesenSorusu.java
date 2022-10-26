package GrupCalismalari;

public class DesenSorusu {
    public static void main(String[] args) {
        // 5-----Aşağıdaki elmas deseni görüntüsünü çizen java kodunu yazınız.
        /*  Beklenen Çıktı:

      *
     ***
    *****
   *******
  *********
 ***********
*************
 ***********
  *********
   *******
    *****
     ***
      *

Process finished with exit code 0

         */
        for (int i = 1; i <=7 ; i++) {
            for (int j = 7-i; j >=1 ; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            for (int j = 0; j <i-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 6; i >=1 ; i--) {
            for (int j = 7-i; j >=1 ; j--) {
                System.out.print(" ");
            } for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i - 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
