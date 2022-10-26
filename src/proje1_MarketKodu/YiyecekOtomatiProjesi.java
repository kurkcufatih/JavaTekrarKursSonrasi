package proje1_MarketKodu;

import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;
import java.util.Scanner;

public class YiyecekOtomatiProjesi {
    //--15 adet ürün ve bu ürünlerin fiyatlarını belirleyiniz.
    //Bu ürünler ekranda listelensin
       /*  --ürün seçip, para miktarı giriniz
     --girdiğiniz para fazla ise üstünü versin, eksik ise ekleme yapmanızı istesin
      --Ek ürün seçme seçeneği olsun, siz devam ettiğiniz sürece,para kontrolünü de yaparak işlem yapmaya devam etsin...
    NOT: Otomat sadece 1 tl , 5 tl, 10 tl, 20 tl miktarlarını kabul etsin
    iyi çalışmalar
    Kolay gelsin...
            1 ne istedigini sor
            2 fiyatini hesabla
            3 parasini al
      */


    public static void main(String[] args) {
        System.out.println("*****YIYECEK VE ICECEK OTOMATI*****");
        System.out.println("        ****HOS GELDINIZ****");
        System.out.println("");
        String urunListesi = "URUN LISTESI VE FIYATLARI" + "\n" +
                "YIYECEKLER" + "\n" +
                "1. Cips = 2.5 TL" + "\n" +
                "2. Patlamis Misir = 2.25 TL" + "\n" +
                "3. Karisik Cerez = 5 TL" + "\n" +
                "4. Cikolata = 1.5 TL" + "\n" +
                "5. Biskuvi = 2.0 TL" + "\n" +
                "6. Kuruvasan = 3.5 TL" + "\n" +
                "7. Vegan Sandwich = 4.5 TL" + "\n" +
                "8. Sandwich = 5 TL" + "\n" +
                "9. Mufin = 3.5 TL" + "\n" +
                "\n" +
                "ICECEKLER" + "\n" +
                "10. Kola = 3 TL" + "\n" +
                "11. IceTea = 4 TL" + "\n" +
                "12. Soda = 3.5 TL" + "\n" +
                "13. Gazoz = 3 TL" + "\n" +
                "14. Ayran = 2.5 TL" + "\n" +
                "15. IcedCoffee = 5 TL";

        System.out.println(urunListesi);
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen istediginiz urunlerin urun kodlarini giriniz");
        int urunKodu = scan.nextInt();
        double sepet = 0;
    }
}