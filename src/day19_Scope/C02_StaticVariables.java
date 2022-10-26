package day19_Scope;

public class C02_StaticVariables {

    static int staticSayi=10;
    String isim="Mehmet";

    static int degersizStaticVariable;
    int degersizInstanceVariable;
    /*
    Class level'deki variabe'lara deger atamasak da
    Java kabul ediyor.
     */

    public static void main(String[] args) {
        /*
        Bir variable static olusturulduysa objeler
        icin degil class icin gecerlidir.
         */
        System.out.println(staticSayi); //10
        staticMethod();
        staticSayi=12;
        System.out.println(staticSayi); //12
        C02_StaticVariables obje1=new C02_StaticVariables ();
        obje1.staticOlmayanMethod();
        System.out.println(staticSayi); // 20
        /*
        instanca bir variable'in degerini bulmak icin
        objenin olusturulmasindan itibaren istenen satira
        kadar kodu takip etmeliyiz
        Static variable'da ise class'in en basinda  baslayarak
        istenen satira kadar kodu takip edin
        static variable'in son degrini bulmamiz gerekir
         */
    }

    public static void staticMethod(){
        System.out.println(staticSayi); //10
        //method'lar sadece biz cagirinca calisir
    }

    public void staticOlmayanMethod(){
        System.out.println(staticSayi); //12
        staticSayi=20;
        /*
        static variable'lar class icerisinden her yerden
        ulaslabilir. Static olsun veya olmasin tum method'lar
        static variable'lari gorebilir ve degistirebilirler
         Farkli methodlar'da static variable'in hangi
         degeri alacagini bilmek istyorsak class'in basindan
         itibaren kodun calismasini takip etmeliyiz
         Method ne zaman cagrilirsa, o anki static variable degerini
         methodda kullanabiliriz.
         */
    }
}
