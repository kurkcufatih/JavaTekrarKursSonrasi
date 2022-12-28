package day35_encapsulation_inheritance.day35_Tekrar;

public class Muhasebe extends Personel {
    protected int saatUcreti;
    protected String status;
    protected int maas;

    public Muhasebe() {
        System.out.println("Muhasebe parametresiz constructor");
    }

    public static void main(String[] args) {
        Muhasebe calisan = new Muhasebe();
        calisan.isim = "Fatih";
        calisan.soyisim = "Kurkcu";
        System.out.println(calisan.isim+" "+calisan.soyisim);

    }
}
