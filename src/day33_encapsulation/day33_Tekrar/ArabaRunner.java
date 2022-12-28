package day33_encapsulation.day33_Tekrar;

public class ArabaRunner {
    public static void main(String[] args) {
        Araba arb1 = new Araba();
        arb1.marka = "Toyota";
        System.out.println(arb1.marka); //Toyota

        arb1.setModel("Corolla"); //Yazdiramiyoruz cunku get methodu yok

        arb1.getYakit();
        System.out.println(arb1.getYakit()); //Elektrikli
    }
}
