package day18_While_doWhileLoop;

public class C05_DoWhileLoop {
    /*
    9'dan 190'C01_I kadar 7 nin kati olan tum
    tamsayilari ekrana yazdirin
     */
    public static void main(String[] args) {
        int bas = 9;
        int bitis = 190;

        int temp = bas;

        //while loop ile

        while (temp < bitis) {
            if (temp % 7 == 0) {
                System.out.print(temp + " ");
            }
            temp++;
        }


        //do-while loop ile yapalim
        System.out.println(" ");
        temp=bas;
        do {
            if (temp % 7 == 0) {
                System.out.print(temp + " ");
            }
            temp++;
        } while (temp < bitis);


    }

}
