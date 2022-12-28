package day35_encapsulation_inheritance.day35_Tekrar;

public class Isci_Tekrar extends Muhasebe {
    protected String status;
    protected String meslek;
    protected String sendika;

    public Isci_Tekrar() {
        System.out.println("Isci parametresiz constructer calisti");
    }

    public static void main(String[] args) {
        Isci_Tekrar isci = new Isci_Tekrar();
        isci.meslek = "Tester";
        isci.sendika = "TurkIs";
        isci.status = "Junior";
        isci.isim = "Fatih";
        isci.soyisim = "Kurkcu";
        isci.yas = 28;
        isci.calisiyorMu = true;
        isci.telNo = "577605853";
        isci.maas = 6300;

        System.out.println(isci.isim + " adli calisanin maasi : " + isci.maas);
        //Fatih adli calisanin maasi : 6300
    }
}
