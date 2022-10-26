package day12_StringManipulations;

public class C02_replaceAll {
    public static void main(String[] args) {
        String str="1Bu2gu3n Ja*va- cok g3uz/el";
        //str'i Bugun Java cok guzel haline getirin
        //replaceAll() deki all'un amaci ayni ozelllikteki tum karakterleri kapsamasidir
        //butun sayilari sil
        //tum ozel karakterleri silelim dedigimizde space'lerde siliniyor,
        //space'leri korumak icin cumlede bulunmayacak bir string koyalim
        //"qazwsx"
        str=str.replace(" ", "qazwsx" );
        System.out.println(str);
       str=str.replaceAll("\\W", "");
        System.out.println(str);
        str=str.replaceAll("\\d", "");
        System.out.println(str);
        str=str.replace("qazwsx"," ");
        System.out.println(str);
    }
}
