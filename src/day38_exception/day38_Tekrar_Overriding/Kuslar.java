package day38_exception.day38_Tekrar_Overriding;

public class Kuslar extends Animails {
    public static void main(String[] args) {

        Kuslar kuslar = new Kuslar();
        kuslar.hareket(); //Kuslar ucarak hareket ederler
        kuslar.solunum(); //Kuslar akcigerleri ile solunum yaparlar

    }

    @Override
    public void hareket() {
        System.out.println("Kuslar ucarak hareket ederler");
    }

    @Override
    public void solunum() {
        System.out.println("Kuslar akcigerleri ile solunum yaparlar");
    }
}
