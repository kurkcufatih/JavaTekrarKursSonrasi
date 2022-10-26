package day05_matematikselislemler;

public class C05_Pre_Post_Increment {
    public static void main(String[] args) {
        int sayi1=10;
        int sayi2=sayi1+1; //11
        sayi2+=5; //16
        //pre veya post increment/decremant sadece ++ ve -- islemi icin gecerlideir..
        // bu iki islem sayidan sonra veya once yazilmasina gore farkli iki isleyis olur.ce
        int sayi3=sayi2++;  //sayi2 bir artirilicak
                            //sayi2 degeri sayi 3 e atanacak
        // ++ veya -- variable'dan sonra olursa buna postincrement denir. bu durumda o satirda yapilan iki islemden artirma veya azaltma islemi sonuncudur.

        System.out.println("sayi3:" +sayi3); // 17 = ama bu yanlistir
        System.out.println("sayi2:" +sayi2); // 17 = ama bu yanlistir

        int sayi4=++sayi1;  //sayi1 bir artirilacak
                            //sayi1 degeri sayi4e atanacak
        //eger ++ veya -- variable'dan once ise buna preincrement denir
        //bu durumda o satirda yapila iki islemden oncelikli olan artirma veya azaltmadir.

        System.out.println("sayi4:" +sayi4); // 11
        System.out.println("sayi1:" +sayi1); // 11


    }
}
