package day19_Scope;

public class C03_ClassVariables {
    static int sayi;

    public static void main(String[] args) {
        System.out.println(sayi);
        /*
        farkli bir class'da calisirken herhangi bit
        class adini yazip . (nokta)'ya basarsak
        adini yazdigimiz class'daki tum static class uyelerini
        gorebilir ve kullanabiliriz.
         */
        C02_StaticVariables.staticMethod(); //10
        System.out.println(C02_StaticVariables.staticSayi); //10
        System.out.println(C02_StaticVariables.degersizStaticVariable);
    /*
    Class level variable'lara deger atayip atamamak bize kalmistir.
    istersek deger atamasi yapariz, istemezsek deger atamayiz.
    Eger deger atamissak Java atadigimiz o degeri kabul eder.
    Deger atamazsak, o zaman Java bu variable'lara default bir deger atamasi
    yapar.
    default deger atamasi nedir?
    int icin 0 (sifir)
    String icin null
    boolean icin false
    char icin '' (hiclik) tir.
    */
        /*
        Baska class'daki instance variable'lara obje olusturarak ulasabiliriz.

         */
        C02_StaticVariables obje1 = new C02_StaticVariables();
        obje1.staticOlmayanMethod(); //10
        /*
        Bu method icinde staticSayi=20 oldu.
         */
        System.out.println(obje1.isim); //Mehmet
        System.out.println(obje1.degersizInstanceVariable); // 0


        /*Farkli bir class'dan C02 class'indan method ve variable'lari kullandigimda
        C02 class'inin tamami degil sadece benim cagirdigim class uyeleri calisir
         */


    }
}
