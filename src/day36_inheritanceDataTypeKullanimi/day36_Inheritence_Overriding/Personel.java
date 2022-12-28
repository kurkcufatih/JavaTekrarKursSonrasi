package day36_inheritanceDataTypeKullanimi.day36_Inheritence_Overriding;

public class Personel {
    protected String isim = "Isim belirtilmedi";
    protected String soyisim = "Soyisim belirtilmedi";
    protected String departman = "Departman belirtilmedi";

    protected void mass() {
        System.out.println("Tum personelimiz maas alir");
    }

    protected void sigorta() {
        System.out.println("Tum personelimize sigorta yapilir, ozel sigorta isteyenler icin statulerine gore indirim sunulur");
    }

}
