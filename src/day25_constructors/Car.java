package day25_constructors;

public class Car {
    /*
    Bu class bizim kaliphanemiz. Bir Araba olusturmak icin
    ihtiyacimiz olan, veriable ve method'lari bu class'ta belirleriz
    Sonra farkli class'larda araba olusturmamiz gerekirse bu class'ta
    bir obje olusturup, burada belirlenen variable ve method'lara gore
    araba uretiriz.
     */
    String marka = "Marka belirtilmedi";
    String model = "Model belirtilmedi";
    int yil;
    public int fiyat;

    public void benzinliArac() {

        System.out.println("Bu arac benzinli motora sahiptir");
    }

    public void maxHiz(int hiz) {

        System.out.println("Bu araba max " + hiz + " km hiz yapar");
    }

}
