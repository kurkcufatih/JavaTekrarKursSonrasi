package day26_Tekrar_Constructors;

public class ArabaRunner {
    public static void main(String[] args) {
        //1. YOL

        Araba araba1 = new Araba();
        araba1.fiyat = 20000;
        araba1.marka = "Honda";
        araba1.yil = 2006;
        araba1.model = "Civic";
        araba1.maxHiz(200);
        araba1.benzinliArac();

        System.out.println("Aracin markasi : " + araba1.marka
                + "\nAracin modeli : " + araba1.model
                + "\nAracin uretim yili : " + araba1.yil
                + "\nAracin fiyati : " + araba1.fiyat);

        //2. YOL

        Araba araba2 = new Araba("Honda", "Civic", 2006, 20000);
        System.out.println("Aracin markasi : " + araba2.marka
                + "\nAracin modeli : " + araba2.model
                + "\nAracin uretim yili : " + araba2.yil
                + "\nAracin fiyati : " + araba2.fiyat);
        araba2.benzinliArac();
        araba2.maxHiz(200);
    }
}
