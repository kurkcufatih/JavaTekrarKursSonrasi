package day12_StringManipulations;

import jdk.swing.interop.SwingInterOpUtils;

public class C03_substring {
    public static void main(String[] args) {
        String isim="Suleyman";
        String soyisim="Karanfil";
        String kartNo="1234 6589 7458 9658";
        System.out.println(isim.substring(3)); //eyman
        System.out.println(soyisim.substring(soyisim.length()-3)); //fil

        System.out.println(isim.substring(2,4)); //le

        //isim ve soyismin ilk harfi buyuk geriye kalan *
        //Kredi kartinin ilk 4 rakami gorulsun geriye kalan *

        String isimIlkharf=isim.substring(0,1).toUpperCase();
        String isimGeriyeKalanlar=isim.substring(1).replaceAll("\\w", "*");

        String soyisimIlkHarf=soyisim.substring(0,1).toUpperCase();
        String soyisimGeriyeKalanlar= soyisim.substring(1).replaceAll("\\w", "*");

        String kkIlk4=kartNo.substring(0,4);
        String kkGeriyeKalanlar=" **** **** ****";

        System.out.println(isimIlkharf+isimGeriyeKalanlar+" "+soyisimIlkHarf+soyisimGeriyeKalanlar+ " "+
                "\n" + kkIlk4+kkGeriyeKalanlar );

    }
}
