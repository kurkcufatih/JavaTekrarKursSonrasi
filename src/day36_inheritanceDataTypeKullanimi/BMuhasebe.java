package day36_inheritanceDataTypeKullanimi;

public class BMuhasebe extends Apersonel {
    protected int saatUcreti=10;
    protected int gunlukMesai=8;

    protected void maas(){
        System.out.println("personel minimum : " + (30*gunlukMesai*saatUcreti) + " maas alir");
    }
protected void ozelSigorta(){
    System.out.println("Isteyen calisanlara %50 indirimli ozel sigorta yapilir.");
}

}
