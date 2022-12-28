package day33_encapsulation.day33_Tekrar;

public class Araba {
    String marka = "marka belirtilmedi";
    private String model = "model belirtilmedi";
    private String yakit = "Elektrikli";

    public String getYakit() {
        return yakit;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
