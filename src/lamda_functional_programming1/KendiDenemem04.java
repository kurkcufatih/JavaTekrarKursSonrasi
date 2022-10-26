package lamda_functional_programming1;

import java.util.stream.IntStream;

public class KendiDenemem04 {
    public static void main(String[] args) {
        System.out.println("get7den100eToplam : " + get7den100eToplam());
        System.out.println();
        System.out.println("get2den11eKadarCarp : " + get2den11eKadarCarp());
        System.out.println();
        System.out.println("ikiSayiArasindakiSayilarToplami : "+ikiSayiArasindakiSayilarToplami(7,5));
        System.out.println();
        System.out.println("verilenIkiSayıArasındakiTümSayılarınRakamlarınınToplami() = " + verilenIkiSayıArasındakiTümSayılarınRakamlarınınToplami(7,5));
    }

    //1) 7'den 100'e kadar integer değerlerinin toplamını bulan bir method oluşturun.
    public static int get7den100eToplam() {
        //1.YOL
        //return IntStream.range(7, 101).reduce(0, Math::addExact);
        //get7den100eToplam : 5029
        //2.YOL
        return IntStream.range(7, 101).reduce(Math::addExact).getAsInt();
        //get7den100eToplam : 5029
    }

    //2) 2'den 11'e kadar integer değerlerinin çarpımını bulan bir method oluşturun.
    public static int get2den11eKadarCarp() {
        return IntStream.rangeClosed(2, 11).reduce(Math::multiplyExact).getAsInt();
        //get2den11eKadarCarp : 39916800
    }

    //3) Verilen bir sayının faktoriyelini hesaplayan bir method oluşturun. (5 factorial = 1*2*3*4*5  ==> 5! = 1*2*3*4*5)

    public static int faktoriyelHesapla(int x) {
        if (x > 0) {
            return IntStream.rangeClosed(1, x).reduce(Math::multiplyExact).getAsInt();
        } else System.out.println("0'dan buyuk bir deger giriniz");
        return 0;
    }

    //4) Verilen iki sayı arasındaki çift sayıların toplamını bulan bir method oluşturun.
    public static int ikiSayiArasindakiSayilarToplami(int x, int y) {
        int z = 0;
        if (x > y) {
            z = x;
            x = y;
            y = z;

        }
        return IntStream.rangeClosed(x, y).filter(KendiCalismam_Utils::ciftElemanlariYazdir).sum();
        //ikiSayiArasindakiSayilarToplami : 6

    }

    //5) Verilen iki sayı arasındaki tüm sayıların rakamlarının toplamını hesaplayan bir method oluşturun.

    public static int verilenIkiSayıArasındakiTümSayılarınRakamlarınınToplami(int x, int y) {
        int z = 0;
        if (x > y) {
            //eger x, y'den buyuk ise swap yaparak x ve y'nin degerini degistir. Z bos konteynerimiz.
            z = x;
            x = y;
            y = z;

        }
        return IntStream.rangeClosed(x, y).map(Utils::rakamlarToplaminiAl).sum();
        //verilenIkiSay?Aras?ndakiT�mSay?lar?nRakamlar?n?nToplami() = 18
}
}