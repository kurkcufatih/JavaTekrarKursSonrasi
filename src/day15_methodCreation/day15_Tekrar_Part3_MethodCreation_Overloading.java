package day15_methodCreation;

public class day15_Tekrar_Part3_MethodCreation_Overloading {
    public static void main(String[] args) {
        topla(5, 7); //12 = int int calisir
        topla(5.2, 3); //8.2 = double integer calisir
        topla(3.4, 6.1); //9.5 = double double calisir
        topla(5, 6.2);//11.2 = teknik olarak itiraz etmedi, demekki uyusan var.
     /*

     NOTE 1;
     Bir class'ta parametre sayisi ve parametre data turleri ayni olan
     2 method OLUSTURMAYIZ

     NOTE 2;
     Java hangi method'un calisacagina karar verirken optimizasyon yapar
    -eger hic cast yapmadan kullanabilecegi bir method varsa onu kullanir
    -eger cast yapmadan kullanacagi bir method yoksa, en az cast yaparak
     kullanabilecegi method'u tercih eder.

     */
    }
    private static void topla(int sayi1, int sayi2) {
        System.out.println("iki integer'in toplami : " + (sayi1 + sayi2)); //12
    }
    private static void topla(double sayi1, int sayi2) {
        System.out.println("bir double ve bir integer'in toplami : " + (sayi1 + sayi2)); //8.2
    }
    private static void topla(double sayi1, double sayi2) {
        System.out.println("iki double'in toplami : " + (sayi1 + sayi2)); //9.5
    }
}
