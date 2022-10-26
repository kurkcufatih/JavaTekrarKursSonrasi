package lamda_functional_programming1;

import java.util.stream.IntStream;

public class FunctionalProgramming04 {

    public static void main(String[] args) {
        System.out.println("get7den100eToplam : " + get7den100eToplam());
        System.out.println("get2den11eCarpim : " + get2den11eCarpim());
        System.out.println("faktoriyelHesapla : " + faktoriyelHesapla(5));
        System.out.println("ikiSayiArasindakiCiftSayilarToplami : " + ikiSayiArasindakiCiftSayilarToplami(7, 5));
        System.out.println("verilenIkiSayıArasındakiTümSayılarınRakamlarınınToplami : " + verilenIkiSayıArasındakiTümSayılarınRakamlarınınToplami(23, 32));
    }


    //1) 7'den 100'e kadar integer değerlerinin toplamını bulan bir method oluşturun.

    public static int get7den100eToplam() {

        //1.YOL
        return IntStream.range(7, 101).reduce(0, Math::addExact);
        //get7den100eToplam : 5029

        //2.YOL
        //return IntStream.range(7,101).reduce(Math::addExact).getAsInt();
        //.rangeClosed(7,100)

        //get7den100eToplam : 5029

        //range yaptigimizda son rakdamdan bir fazlasini yazmamiz gerekiyor cunku yazdigimiz son degeri almadan calisiyor
        //fakat rangeClosed kullandigimizda son rakami da dahil ediyor, o yuzden bir fazlasini yazmamiza gerek kalmiyor.
    }

    //2) 2'den 11'e kadar integer değerlerinin çarpımını bulan bir method oluşturun.
    public static int get2den11eCarpim() {
        return IntStream.rangeClosed(2, 11).reduce(Math::multiplyExact).getAsInt();
        //sonuc : 39916800
    }

    //3) Verilen bir sayının faktoriyelini hesaplayan bir method oluşturun. (5 factorial = 1*2*3*4*5  ==> 5! = 1*2*3*4*5)
    public static int faktoriyelHesapla(int x) {
        if (x > 0) {
            return IntStream.rangeClosed(1, x).reduce(Math::multiplyExact).getAsInt();
        }
        System.out.println("0'dan buyuk deger giriniz");
        return 0;
    }

    //4) Verilen iki sayı arasındaki çift sayıların toplamını bulan bir method oluşturun.

    public static int ikiSayiArasindakiCiftSayilarToplami(int x, int y) {
        int z = 0;
        if (x > y) {
            //eger x, y'den buyuk ise swap yaparak x ve y'nin degerini degistir. Z bos konteynerimiz.
            z = x;
            x = y;
            y = z;
        }
        return IntStream.rangeClosed(x, y).filter(Utils::ciftElemanlariSec).sum();
        //ikiSayiArasindakiCiftSayilarToplami : 6
    }

    //5) Verilen iki sayı arasındaki tüm sayıların rakamlarının toplamını hesaplayan bir method oluşturun.
    //  23 and 32 ==> 2+3  +  2+4  +  2+5  +  2+6  +  2+7  +   2+8  +   2+9  +   3+0  +   3+1  +   3+2 ==> 68

    public static int verilenIkiSayıArasındakiTümSayılarınRakamlarınınToplami(int x, int y) {
        int z = 0;
        if (x > y) {
            //eger x, y'den buyuk ise swap yaparak x ve y'nin degerini degistir. Z bos konteynerimiz.
            z = x;
            x = y;
            y = z;

        }
        return IntStream.rangeClosed(x, y).map(Utils::rakamlarToplaminiAl).sum();
        //sonuc: 68
    }
}