package day26_constructions;

public class OgretmenKendiCalismam {
    String isim = "isim belirtilmedi";
    String soyisim = "soyisim belirtilmedi";
    String yas = "yas belirtilmedi";
    String brans = "brans belirtilmedi";
    String yanBrans = "yanbrans belirtilmedi";

    public OgretmenKendiCalismam() {

    }

    public OgretmenKendiCalismam(String isim, String soyisim, String yas, String brans, String yanBrans) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.yas = yas;
        this.brans = brans;
        this.yanBrans = yanBrans;
    }

    @Override
    public String toString() {
        return
                "\nisim: " + isim +
                        "\nsoyisim: " + soyisim +
                        "\nyas: " + yas +
                        "\nbrans: " + brans +
                        "\nyanBrans: " + yanBrans;

    }
}

