package day36_inheritanceDataTypeKullanimi.day36_Inheritence_Overriding;

public class Muhasebe extends Personel {
    protected int saatUcreti = 10;
    protected int gunlukMesai = 8;

    protected void maas() {
        System.out.println("Personel minimum " + (30 * gunlukMesai * saatUcreti) + " maas alir");
    }

    protected void ozelSigorta() {
        System.out.println("Isteyen calisanlara 50% indirimle ozel sigorta yapilir");
    }
}
