package day26_constructions;

public class Honda {
    String marka = "marka belirtilmedi";
    String model = "model belirtilmedi";
    String yil = "yil belirtilmedi";
    String fiyat = "fiyat belirtilmedi";

    public Honda(String marka, String model, String yil, String fiyat) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return
                "\nmarka : " + marka +
                        "\nmodel : " + model +
                        "\nyil : " + yil +
                        "\nfiyat : " + fiyat;
    }
}

