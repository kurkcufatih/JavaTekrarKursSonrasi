package day01_02_Variables;

public class day01_Tekrar {
    public static void main(String[] args) {
        String isim = "Fatih";
        System.out.println(isim);

        int sayi = 10;
        System.out.println(sayi);

        isim = "Ahmet";
        System.out.println(isim);

        sayi = 18;
        System.out.println(sayi);

        /* Ayni variable'a farkli deger atayabiliriz,
         atadigimiz son deger variable'i yazdirdigimizda karsimiza cikar.
          Ayni data tipinde ayni isimde olan bir variable' bu sekilde degistirebiliriz.
          Fakat farkli data tipinde ayni isimde bir variable olusturamayiz ve deger atayamayiz.
         */

        //String sayi=10;
        //int isim = "Fatih";


        /*
        Farkli data turleri ayni degeri alabilir, onemli olan bu degerleri data turune gore islem yapabilecegimizdir.
         */

        int sayi1=10;
        int sayi2=20;

        String sayi3="10";
        String sayi4="20";


        String harf1="A";
        char harf2='A';

        System.out.println(sayi1+sayi2+harf1); //30A
        System.out.println(sayi3+sayi4+harf2); //1020A
        System.out.println(harf2+sayi1+sayi2); //95
        System.out.println(harf1+sayi1+sayi2); //A1020
        System.out.println(harf1+(sayi1+sayi2)); //A30
    }
}
