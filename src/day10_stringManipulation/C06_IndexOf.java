package day10_stringManipulation;

public class C06_IndexOf {
    public static void main(String[] args) {
        String str="Java ogrenmek cok guzel";
        System.out.println(str.indexOf("o")); // 5
        System.out.println(str.indexOf('g')); //6
        System.out.println(str.indexOf("t")); //bana integer dondururyor
        // integer da yok diye bir deger bulunmuyor
        //0 dersek j'nin indexidir, ama negatif bir deger donerse
        //biz aranan string'in str'da olmadigini anlariz
        //Java -1 dondurmeyi tercih etmistir.
        String str5= "asdfghjpkl;'lkjhgfds";
                //str5'de p harfi var midir?
        if (str5.indexOf("=")==-1){
            System.out.println("str5 de istenen harf kullanilmamis.");
        } else {
            System.out.println("str5'de istenen karakter kullanilmis");
        }

    }
}
