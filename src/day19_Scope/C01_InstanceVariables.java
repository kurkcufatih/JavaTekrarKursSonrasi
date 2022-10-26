package day19_Scope;

public class C01_InstanceVariables {
    /*class icerisinde her yerden kullanmak istedigimiz
    variable'lari class level'da (class'in icinde ama methodun
    disinda. Genellikle class level variable'lar, class'in basinda
    olusturulur (sart degil).

    class level'daki variable'lar icin 2 scope vardir.
    1-static varibles (class variable'lari da denir)
    2-instance (static olmayan) variables. Obje variable da denir.
     */

    int instSayi = 20; //static olmayip class level da oldugu icin
    //instance  variable'dir.

    public static void main(String[] args) {
        int sayi = 10;
        /* System.out.println(instSayi);
        instance variables static olmadigi icin static klube
        uye main method'dan direk kullanamayiz.
        Instance variable'larin diger adi object variable'dir
        Dolayisiyla obje olusturursaniz instance variable'lari
        heryerden kullanabilirsiniz.
         */

        C01_InstanceVariables obje1 = new C01_InstanceVariables();
        System.out.println("obje1 degismeden once : " + obje1.instSayi); //20
        obje1.instSayi = 30;
        System.out.println("obje1 degistikten sonra :" + obje1.instSayi); //30

        C01_InstanceVariables obje2 = new C01_InstanceVariables();
        System.out.println("obje2 degismeden once : " + obje2.instSayi);
        obje2.instSayi = 52;
        System.out.println("obje2 degistikten sonra :" + obje2.instSayi);

        C01_InstanceVariables obje3 = new C01_InstanceVariables();
        System.out.println("obje3 degismeden once :" + obje3.instSayi);
/* Her obje olustugunda instance (obje) variable'inin
ilk atanan degerini alir.
 */
    }


    public static void staticMethod() {
        //System.out.println(sayi);
        /*
        Bir method'un icerisinde olusturulan variable,
        sadece o method'un icinden kullanilabilir (Local variable)
         */
        /*instSayi=30;
        instance variable'lara main method disindaki
        static method'lardan da direk ulaamayiz.
        obje olusturursak ulasabiliriz
         */
        C01_InstanceVariables obje4 = new C01_InstanceVariables();
        System.out.println(obje4.instSayi);

    }


    public void staticOlmayanMethod() {
        System.out.println(instSayi);
        /*instance variable'lar class icerisindeki
        static olmayan methodlardan direk kullanilabilir

         */
    }

}
