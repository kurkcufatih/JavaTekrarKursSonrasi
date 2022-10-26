package day37_overriding;

public class FSupra extends EToyota {

    void yakit() {
        System.out.println("Supra benzin kullanir");
        /*
        Private methodlar override edilemez
        Eger Child class'da parent class'daki private
        method ile ayni signature'da bir method olusturursaniz
        bu overriding method OLMAZ

         */
    }

    @Override
    void motor() {
        System.out.println("Sirali 6 silindir 2JZ motor kullanir");

        /*
    @Override notasyonu Java'ya bir gorev verir
    Java bu notasyonla birbirine bagli olan iki
    method'u surekli kontrol eder
    Eger parent class'daki overridden method'u silerseniz
    CTE verir.

    @Override notasyonu kullanmak mecburi degildir.
    Eger overridding method silinirse, kodun CTE vermesini
    istersek @Override notasyonu kullanmaliyiz.
     */

    }
}
