package day16_forLoop;

public class C06_NestedForLoop {
    public static void main(String[] args) {
        /*Bazen tek degisken sorunu cozmeye yetmez
         *
         * *
         * * *
         * * * *
         * * * * *
         */
        //yanyana 3 tane yildiz yaz deseler yazabiliriz
        for (int i = 1; i <= 3; i++) {
            System.out.print("* ");
        }

            //yanyana 4 tane yildiz yaz desem yine kolay
            for (int i = 1; i <= 4; i++) {
                System.out.print("* ");
            }
        System.out.println("");
            //bu tur durumlarda ic ice (Nested) loop kullanmak gerekir
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");

        }
        }
    }

