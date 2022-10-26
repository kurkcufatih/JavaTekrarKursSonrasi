package day31_timeFormatter_varargs;

public class C03_VarargsIleToplama {
    public static void main(String[] args) {
//Verilen kac 2 int olursa olsun hepsini toplayip
// sonucu yazdiran bir method olusturun

        int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 = 30;
        int sayi4 = 40;
        toplaYazdir(sayi1, sayi2, sayi3, sayi4);
        toplaYazdir(sayi1, sayi2, sayi3);
        toplaYazdir(sayi1, sayi2);

    }

    public static void toplaYazdir(int... sayi) {

        /*
        int...sayi => bu gosterim integer variable'lardan olusan
        bir varargs demektir. Varargs array alt yapisini kullanir.
Varargs: element sayisi uzun olan array.
         */
        int sayiAdedi = sayi.length;
        int toplam = 0;
        for (int each : sayi) {
            toplam += each;

        }
        System.out.println("Girilen " + sayiAdedi + " sayilarin toplami : " + toplam);
    }
}
