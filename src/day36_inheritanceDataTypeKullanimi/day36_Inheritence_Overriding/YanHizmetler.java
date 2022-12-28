package day36_inheritanceDataTypeKullanimi.day36_Inheritence_Overriding;

public class YanHizmetler extends Muhasebe {
    int saatUcreti = 9;
    int gunlukMesai = 8;

    protected void maas() {
        System.out.println("Bir yan hizmetler calisaninin minimum maasi : " + (30 * gunlukMesai * saatUcreti));
    }

    protected void IssizlikSigorta() {
        System.out.println("Yan hizmet calisanlari 30% indirimli ozel sigorta yaptirabilie");

        Muhasebe yh1 = new YanHizmetler();
        System.out.println(yh1.gunlukMesai);
        System.out.println(yh1.saatUcreti);
        yh1.maas();
        yh1.ozelSigorta();
        yh1.sigorta();
        System.out.println(yh1.isim);
        System.out.println(yh1.soyisim);
        System.out.println(yh1.departman);


    }
}