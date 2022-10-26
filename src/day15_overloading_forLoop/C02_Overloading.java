package day15_overloading_forLoop;

public class C02_Overloading {
    public static void main(String[] args) {
        /* Java'da olusturdugumuz methodlarin isminin yaptigi islev
        ile uyumlu olmasini isteriz.Mesela bir string'in bir bolumu
        olmak icin Java 2 adet substring() methodlari veya
        Verilen string'deki bazi parcalari yenileri ile degistirmek icin
       2 adet replace() method'u var.
Java ayni isimde birden fazla method varsa hangisinin kullanilacagina parametre
sayisi ve parametrelerin data turune gore karar verir
         */




    String str="Bu Java ogrenilecek, baska yolu yok";
    str.substring(2);
    str.replace('c', 'v');
    str.replace("J","H");
    //str.replace(5,8);

    }
}
