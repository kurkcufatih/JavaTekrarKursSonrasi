package day26_constructions;

public class Ogretmen {
    String isim="Isim belirtilmedi";
    String soyisism="Soyisim belirtilmedi";
    String dogumTarihi="Tarih girilmedi";
    String brans="Brans belirtilmedi";
    String yanBrans="Yan brans belirtilmedi";

    public Ogretmen() {

    }

    public Ogretmen(String isim, String soyisism, String dogumTarihi, String brans, String yanBrans) {
        this.isim = isim;
        this.soyisism = soyisism;
        this.dogumTarihi = dogumTarihi;
        this.brans = brans;
        this.yanBrans = yanBrans;
    }

    public Ogretmen(String isim, String soyisism, String dogumTarihi) {
        this.isim = isim;
        this.soyisism = soyisism;
        this.dogumTarihi = dogumTarihi;
    }

    @Override
    public String toString() {
        return
                "\nisim : " + isim  +
                "\nsoyisism : " + soyisism +
                "\ndogumTarihi : " + dogumTarihi +
                "\nbrans : " + brans +
                "\nyanBrans : " + yanBrans;
    }
}
