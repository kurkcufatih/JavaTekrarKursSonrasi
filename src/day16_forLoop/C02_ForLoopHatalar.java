package day16_forLoop;

public class C02_ForLoopHatalar {
    public static void main(String[] args) {
        //Baslangic noktasindan sonra bitis
        //sartina yaklasmiyorsak SONSUZ Loop olusur.

        //    for (int i = 0; i>-10 ; i++) {
        //     System.out.println(i); //KODU CALISTIRMA PC KAPANANA KADAR DEVAM EDER.


        //Eger ilk deger icin bile bitis sarti saglanmiyorsa
        //for loop calisir fakat loop body'si hicbir zaman
        //devreye girmez, yani loop calisir loop body'si calismaz


        for (int i = 0; i > 5; i++) {
            System.out.println(i);
            //kod ve loop calisir, loop badisi devreye girmez
            //i sifira esit, besten buyuk degil, bize sout yapmaz


        }
    }
}
