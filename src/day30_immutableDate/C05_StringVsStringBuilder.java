package day30_immutableDate;

import java.time.LocalTime;

public class C05_StringVsStringBuilder {
    public static void main(String[] args) {
        /*
        String mi yoksa StringBuilder mi daha hizlidir.
        Bunun icin bir String olusturup 1000 defa sonuna nokta
        ekleyelim. Oncesinde ve sonrasinda zamani alip aradaki
        bulalim.

        Ayni islemi StringBuilder icin de yapalim.
         */
        LocalTime baslangic=LocalTime.now();

        StringBuilder str= new StringBuilder("Ahhhh Java");
        for (int i = 0; i <10000 ; i++) {
            str.append(".");

        }LocalTime bitis=LocalTime.now();
        System.out.println(baslangic);
        System.out.println(bitis);

        System.out.println("String zaman : " + (bitis.getNano()-baslangic.getNano())); //String zaman : 8995500

            //Stringte sonuc :  36980300
            //StringBuilderda sonuc: 4996400

            //String daha hizli cikti
    }
}
