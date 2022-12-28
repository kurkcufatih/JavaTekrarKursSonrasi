package day31_dateAndTime;

public class day31_Tekrar_Varrargs {
    public static void main(String[] args) {

        //==== Varrargs methodu ====

        //soru 1

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;
        int f = 60;

        toplam(a, b);
        toplam(a, b, c);
        toplam(a, b, c, d);
        toplam(a, b, c, d, e);
        toplam(a, b, c, d, e, f);


        //soru 2

        //Verilen kac 2 int olursa olsun hepsini toplayip
        // sonucu yazdiran bir method olusturun

        int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 = 30;
        int sayi4 = 40;
        int sayi5 = 50;

        toplaYazdir(sayi1, sayi2, sayi3, sayi4, sayi5);
        toplaYazdir(sayi1, sayi2, sayi3, sayi4);
        toplaYazdir(sayi1, sayi2, sayi3);
        toplaYazdir(sayi1, sayi2);

        //==== Varrargs ile en uzun kelimeyi yazdirma ====

        enUzunKelimeyiYazdir("Ali", "Ayse", "Ismail", "Ahmet");


    }

    private static void enUzunKelimeyiYazdir(String... kelime) {
        String enUzunKelime = kelime[0];
        for (String each : kelime) {
            if (each.length() > enUzunKelime.length()) {
                enUzunKelime = each;
            }
        }
        System.out.println("Girilen kelimelerden en uzunu : "+enUzunKelime);
        //Girilen kelimelerden en uzunu : Ismail
    }

    private static void toplam(int a, int b, int c) {
        System.out.println("uc sayinin toplami : " + (a + b + c));
    }

    private static void toplam(int a, int b) {
        System.out.println("iki sayinin toplami : " + (a + b));
    }

    public static void toplam(int... a) {
        System.out.println("varrargs calisir");
    }
    //sout result

    /*
    iki sayinin toplami : 30
    uc sayinin toplami : 60
    varrargs calisir
    varrargs calisir
    varrargs calisir
    */
    public static void toplaYazdir(int... sayi) {

        int sayiAdedi = sayi.length;
        int toplam = 0;
        for (int each : sayi) {
            toplam += each;
        }
        System.out.println("Girilen " + sayiAdedi + " sayilarin toplami " + toplam);
         /*
         sout result
         Girilen 5 sayilarin toplami 150
         Girilen 4 sayilarin toplami 100
         Girilen 3 sayilarin toplami 60
         Girilen 2 sayilarin toplami 30
          */

    }


    /*

    ===== Varrargs parametreli de kullanilabiliyor ====

         enUzunKelimeyiYazdir(5, "Ali", "Ayse", "Ismail", "Ahmet", "Babayigit", "Akin");
    }

    public static void enUzunKelimeyiYazdir(int kelimeSayisi, String... kelime) {
        String enUzunKelime = kelime[0];

        for (String each : kelime) {
            if (each.length() > enUzunKelime.length()) {
                enUzunKelime = each;
            }
        }
        System.out.println("Girilen kelimelerden en uzunu : " +enUzunKelime);
     */
}
