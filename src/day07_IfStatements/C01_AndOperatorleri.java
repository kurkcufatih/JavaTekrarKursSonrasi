package day07_IfStatements;

public class C01_AndOperatorleri {
    public static void main(String[] args) {
        int a=10;
        int b=15;
        int c=20;

        System.out.println(a>0 && b<20 && c>=b);    //And operatoru ile baglandigi icin true and true and true oldgu icin sonuc true olur.//
                        // true   true    true
        System.out.println(a<0 && b<20 && c>=b);   // And operatoru ile baglandigi icin bir tane bile false olsa sonuc false oldugundan false tur//
                        // false  true    true

        //Java And operatoru konusunda bize iki seccenek sunar, eger && kullanirsak, ilk false buldugunda artik sonucun false olacagini bilir ve geriye kalan sartlari incelemez. Ama tek & kullanirsak butun asamalari kontrol eder sonra sonucu belirler, bu calisma usulunden dolayi && operatorunden daha yavas olabilir.

        System.out.println(a<0 & b<20 & c>=b);     // bir tane & bile koysaniz sonuc yine false olur, java bir defa and gorur ve false ise sonuc false tur. Tek & olunca daha yavas calisi cunku hepsine tek tek bakar//







    }
}
