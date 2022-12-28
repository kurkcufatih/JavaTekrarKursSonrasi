package day10_stringManipulation;

import java.util.Locale;

public class day10_Tekrar {
    public static void main(String[] args) {
/*
        //==== charAt() methodu ====

        String str = "Java ogrenmek ne guzeldir";
        System.out.println(str.toUpperCase().charAt(0)); //J
        System.out.println(str.toLowerCase().charAt(24)); //r

        //charAt() kullandigimizda sonuc char olacagi icin artik manipulation yapamayiz
        // String methodlarından kullanmamiz gereken bir method varsa
        // charAt() 'den önce kullanmaliyiz

        String str2 = "Beni psikopata bağlamayın";
        System.out.println(str2.toUpperCase(Locale.forLanguageTag("TR")));

        //==== equals() methodu ve equals sign arasindaki fark =====

        //String'lerde ayni String olsa bile == (double equal sign) her zaman calismaz
        //emin olmak isterseniz equals() kullanmalisiniz
        //equals() kullandigimizda dikkat edecegimiz TEK SEY Metinlerin birebir ayni olmasidir.

        // String variable'larda == hem degere hem de referansina bakar dolayisiyla objeler farkli oldugunda
		// genelde false doner


        String str3 = "Ali Can";
        String str4 = "Ali CAN";
        String str5 = "Ali Can" + "";
        String str6 = "Ali Can";
        String str7 = new String("Ali Can");

        System.out.println(str3 == str4); //false
        System.out.println(str3.equals(str4)); //false

        System.out.println(str3 == str5); //true
        System.out.println(str3.equals(str5)); //true

        System.out.println(str3 == str7); //false (yeni bir string, ayni degil)
        System.out.println(str3.equals(str7)); //true

        System.out.println(str3 == str6); //true
        System.out.println(str3.equals(str6)); //true

        //==== equals() ve equalsIgnoreCase() arasindaki fark====

        String str8 = "Ali Can";
        String str9 = "ali can";
        String str10 = "ALI CAN";
        String str11 = "Ali Can_";

        System.out.println(str8.equals(str9)); //false
        System.out.println(str8.equalsIgnoreCase(str9)); //true

        System.out.println(str9.equals(str10)); //false
        System.out.println(str9.equalsIgnoreCase(str10)); //true

        System.out.println(str8.equals(str11)); //false
        System.out.println(str8.equalsIgnoreCase(str11)); //false


        //==== length() ve null pointer ====

        String string = "Java ogren, isi kap";
        System.out.println(string.length()); //19
        System.out.println(string.charAt(string.length() - 1)); //p
        System.out.println(string.charAt(string.length() - 3)); //k

        String string2 = ""; //hiclik degeri atanmis
        System.out.println(string2.length()); //0 --> cift tirnak icinde hic bir deger olmadigi icin
        // bize 0 (sifir) yazdirir.

        String string3 = null;
        System.out.println(string3.length()); //NullPointerException -->// null bir esitligin karsisinda
        // olsa bile bu bir atama degildir.
        //null bir deger degildir


        //Java'da null pointer (isaretleyici) bir deger degil,
        //karsisina yazildigi variable'in hic bir deger almadiginin isaretcisidir.
*/
        //==== indexOf() methodu

        String string4 = "Java ogrenmek cok guzel";
        System.out.println(string4.indexOf("a")); //1
        System.out.println(string4.indexOf("o")); //5
        System.out.println(string4.indexOf("c")); //14
        System.out.println(string4.indexOf("b")); //-1


        // integer da yok diye bir deger bulunmuyor
        //0 dersek j'nin indexidir, ama negatif bir deger donerse
        //biz aranan string'in str'da olmadigini anlariz
        //Java -1 dondurmeyi tercih etmistir.


        //=== concat() methodu
        String string5 = "Ali";
        String string6 = "Can";

        System.out.println(string5.concat(" ").concat(string6)); //Ali Can
    }
}
