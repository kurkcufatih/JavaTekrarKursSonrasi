package day37_overriding;

public class C01_Overloading {
    public static void main(String[] args) {
/*
Bir class'da ayni isimde ve ayni signatur'a sahip iki method olmaz
Ayni class'da ayni isimde birden fazla method olusturmak istersek
mutlaka signiture'i degistirmeliyiz

Farkli class'larda ayni isim ve signiture'a sahip iki method olabilir mi?
 */
    }

    void ekleme() {
    }

    void ekleme(int sayi) {
    }

    void ekleme(String str) {
    }

    void ekleme(String str, int sayi) {
    }
}
