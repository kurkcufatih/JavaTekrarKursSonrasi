package day36_inheritanceDataTypeKullanimi;

public class EYanHizmetliler extends BMuhasebe{
    int saatUcreti = 9;
    int gunlukMesai = 8;

    protected void maas() {
        System.out.println("Bir memurun min : " + (30 * saatUcreti * gunlukMesai) + " maas alir");
    }

    protected void IssizlikSigorta() {
        System.out.println("Memurlar %30 indirimli ozel sigorta yaptirabilir");
   /*
   Overriding child class'daki bir methodun
   parent class'daki ayni isimdeki methodu
   etkisiz hale getirerek, kendisinin spesifik
   ozelligini ortaya cikarmasidir.

   Overriding'i nerede dikkate aliyoruz?
   Bir obje olusturulurken data turu ve constructor farkli ise.
   Eger bir obje olusturulurken data turu ve constructot farkli is objenin oelliklerini belirlerken
   uc konuya dikkat cekmeliyiz.
   1- Obje constructor'in oldugu classda olusur
   2-Objenin ozelliklerini aramaya data turunun oldugu class'dan baslariz
   bu class'da araba onzellik bulunamazsa parent class'lara bakilir, orada
   da bulunamazsa CTE olur.
   3-Eger aranan ozellik variable ise buldugumuz ilk degeri yazdiririz.
   Aranan ozellik method ise
   degeri yazdirmadan once override edilmis mi diye kontrol etmemi gerekir
    eger override edildiyse en guncel degeri yazdiririz.
    */
        BMuhasebe yh1=new EYanHizmetliler();
        System.out.println(yh1.gunlukMesai); //Muhasebe classindan 8
        System.out.println(yh1.saatUcreti); //Muhasebeden alir 10
        yh1.maas(); //YanHizmetler class'indakini alir cunku override edilmis
        yh1.ozelSigorta(); //Muhasebeden alir
        yh1.sigorta();//Personel classindan alir
        System.out.println(yh1.isim); //Personel class'indan alir
        System.out.println(yh1.soyisim); //Personel class'ondan alir
        System.out.println(yh1.departman); //Personel class'indan alir
        //System.out.println(yh1.IssizlikSigorta);
        //Aramaya Musasebeden basladigimizdan dolayi issizlikSigortasi bulamadik CTE
    }
}
