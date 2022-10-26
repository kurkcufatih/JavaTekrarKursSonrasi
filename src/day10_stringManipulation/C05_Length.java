package day10_stringManipulation;

public class C05_Length {
    public static void main(String[] args) {
        String str="Java ogren, isi kap";
        System.out.println(str.length()); //str'in kararkter sayisini yazdirir.
        System.out.println(str.charAt(str.length()-1)); //son karakterini yazdiralim --> p
        System.out.println(str.charAt(str.length()-3)); //sondan ucuncu karakteri yazdiralim

        //Java'da null pointer (isaretleyici) bir deger degil,
        //karsisina yazildigi variable'in hic bir deger almadiginin isaretcisidir.

        String str2=""; //str2'ye bir deger atanmis midir? --> evet
        //bu deger nedir? --> hiclik (hiclik degeri atanmis)
        System.out.println(str2.length()); // 0 (sifir) --> cift tirnak icinde hic bir deger olmadigi icin bize 0 (sifir) yazdirir.
        String str3=null; //str3'e bir deger atanmis midir? --> hayir
        //null bu deger atamamayi isaret etmektedir.
        System.out.println(str3.length()); // bir deger atanmamis ki nasil uzunlugu olsun
        //NullPointerException olarak hata verir.
        // null bir esitligin karsisinda olsa bile bu bir atama degildir.
        //null bir deger degildir

    }
}
