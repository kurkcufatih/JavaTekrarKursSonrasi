package day38_exception;

public class C01_Exceptions {
    public static void main(String[] args) {
       int a=10;
       int b=0;
       // System.out.println(a/b); //ArithmeticException

        int c=100;
        int d=50;
        int sayac=1;
        while(sayac<1000){
            System.out.println(a/b);
            d--;
            sayac++;
        }


    }
}
