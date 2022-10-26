package day33_encapsulation;

public class Araba {
    String marka = "Marka belirtilmedi";
    //markanin access modifier'i default access modifier oldugundan package icerisinde kullanilabilir
    private String model = "Model belirtilmedi";
    //Private yaptigimiz model ve yakit variable'larina erisimi yetkilendirelim.
    //model'e deger atanabilsin ama gorulemesin(setter).
    //Yakit ise gorulebilsin ama yeni deger atanamasin isteniyor (getter)
    //Bunun icin
    private String yakit = "Elektrikli";

    public String getYakit() {
        return yakit;
    }

    //sag tusa tikla, generate kisminda getter ve setter vb var. Oradan tiklayinca otomatik olusuyor altta yazanlar.
    public void setModel(String model) {
        this.model = model;



    }
}
