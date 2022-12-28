package day34_accessDeneme.day34_Tekrar;

public class Isci extends Personel {

    int personelNo = 1001;

    public static void main(String[] args) {
        Isci isci1 = new Isci();
        System.out.println(isci1.isim);
        isci1.isim = "Selim";
        System.out.println(isci1.isim);

        System.out.println(isci1.personelNo);
        isci1.maas();
    }

    public void maas() {
        System.out.println("Isciler min 15 Eu saatlik ucret alir");
    }

    public void ozelSigorta() {
        System.out.println("Iscilerden isteyenler 50% indirim ile ozel sigorta yaptirabilir");
    }
}
