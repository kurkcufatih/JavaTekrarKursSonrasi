package day12_StringManipulations;

public class C02_KendiCalismam {
    public static void main(String[] args) {
        String str="1Bu2gu3n Ja*va- cok g3uz/el";
        //str'i Bugun Java cok guzel haline getirin
        //replaceAll() deki all'un amaci ayni ozelllikteki tum karakterleri kapsamasidir
        //butun sayilari sil
        //tum ozel karakterleri silelim dedigimizde space'lerde siliniyor,
        //space'leri korumak icin cumlede bulunmayacak bir string koyalim
        //"qazwsx"
str=str.replaceAll(" ", "X");
        str=str.replaceAll("\\W", "");
        str=str.replaceAll("\\d", "");
        str=str.replaceAll("X", " ");

        System.out.println(str);

    }
}
