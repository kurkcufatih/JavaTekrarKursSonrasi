package day38_exception.day38_Tekrar_Overriding;

public class Baliklar extends Animails {
    public static void main(String[] args) {
        Baliklar baliklar = new Baliklar();
        baliklar.beslenme(); //Tum hayvanlar beslenirler
        baliklar.hareket(); //Baliklar yuzerek hareket ederler
        baliklar.solunum(); //Baliklar solungaclari ile solunum yaparlar

    }

    @Override
    public void hareket() {
        System.out.println("Baliklar yuzerek hareket ederler");
    }

    @Override
    public void solunum() {
        System.out.println("Baliklar solungaclari ile solunum yaparlar");
    }
}
