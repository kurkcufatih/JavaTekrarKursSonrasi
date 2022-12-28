package day12_StringManipulations;

public class day12_Tekrar {
    public static void main(String[] args) {
/*
        //==== replace() methodu ====

        String str = " Bu gun ha va cok gu zel";
        System.out.println(str.replace(" ", "")); //Bugunhavacokguzel


        //hava kelimesini java yapalim

        System.out.println(str.replace("h", "J").
                replace(" ", "")); //BugunJavacokguzel


        //gu zel yerine harika yazalim

        System.out.println(str.replace("gu zel", "harika").
                replace(" ", "")); //Bugunhavacokharika


        //cumleyi replace kullanarak "Bugun Java cok guzel" yazalim.

        str = str.replace("Bu gun", "Bugun").
                replace("ha va", "Java").
                replace("gu zel", "guzel");
        System.out.println(str); //Bugun Java cok guzel


        //==== replaceAll() methodu

        String str2 = "1Bu2gu3n Ja*va- cok g3uz/el";
        //str'i Bugun Java cok guzel haline getirin
        //replaceAll() deki all'un amaci ayni ozelllikteki tum karakterleri kapsamasidir
        //butun sayilari sil
        //tum ozel karakterleri silelim dedigimizde space'lerde siliniyor,
        //space'leri korumak icin cumlede bulunmayacak bir string koyalim
        //"qazwsx"

        str2 = str2.replace(" ", "qazwsx");
        System.out.println(str2); //1Bu2gu3nqazwsxJa*va-qazwsxcokqazwsxg3uz/el
        //bolsuklari kaybetmemek icin bolsuklarin yerine qazwsx ekledik
        //Eger bosluk yerine qazwsx eklemeseydik
        // \\W kullandigimizda bosluklari da kaybedecekktik

        str2 = str2.replaceAll("\\W", "");
        System.out.println(str2); //1Bu2gu3nqazwsxJavaqazwsxcokqazwsxg3uzel
        //sayi ve harf olmayan karakterleri sildik

        str2 = str2.replaceAll("\\d", "");
        System.out.println(str2); //BugunqazwsxJavaqazwsxcokqazwsxguzel
        //sayilari sildik

        str2 = str2.replaceAll("qazwsx", " ");
        System.out.println(str2); //Bugun Java cok guzel
        //qazwsx yerine bosluklari ekledik.


        //==== substring() methodu =====

        String isim = "Suleyman";
        String soyisim = "Karanfil";
        String kartNo = " 1234 5678 9876 5432";

        System.out.println(isim.substring(3)); //eyman
        System.out.println(soyisim.substring(soyisim.length() - 3)); //fil
        System.out.println(isim.substring(2, 4)); //le

        String isimIlkHarf = isim.substring(0, 1).toUpperCase();
        System.out.println(isimIlkHarf); //S

        String soyisimIlkHarf = soyisim.substring(0, 1).toUpperCase();
        System.out.println(soyisimIlkHarf); //K

        String kartNoIlk4Hane = kartNo.substring(0, 5);
        System.out.println(kartNoIlk4Hane);

        String kartNoGeriyeKalanlar = (kartNo.substring(5, kartNo.length() - 0));
        System.out.println(kartNoGeriyeKalanlar); // 5678 9876 5432

        System.out.println(kartNoIlk4Hane + " " +
                kartNoGeriyeKalanlar.substring(1).
                        replaceAll("\\w", "*"));
        //1234 **** **** ****

      */

        //==== trim methodu ====

        String str = "  Java ogrenmek cok guzel   ";
        System.out.println(str.trim());

    }

}
