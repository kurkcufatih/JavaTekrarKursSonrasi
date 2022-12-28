package day34_accessDeneme.day34_Tekrar;

public class Personel {
    int personelNo;
    String isim="Isim belirtilmedi";
    String departman="Departman belirtilmedi";

    public void maas(){
        System.out.println("Tum personelin maasi vardir");
    }
    public void measi(){
        System.out.println("Tum personel statusune gore mesai yapar");
    }
    public void fazlaMesaiUcreti(){
        System.out.println("Personel mesai ucretini statusune gore alir");
    }
}
