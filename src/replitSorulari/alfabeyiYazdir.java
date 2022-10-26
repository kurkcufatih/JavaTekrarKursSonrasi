package replitSorulari;

public class alfabeyiYazdir {

        /* Konsolda Alfabeyi Yazdıran programi yaziniz.
         OUTPUT : C01_I b c .. .. .. .. y z
         */

    public static void main(String[] args) {
        for (char i = 'a'; i < 'z' ; i++) {

            if (i < 'z') {

                System.out.print(i+" ");

            }
        }
        System.out.println('z');
    }
}