package day34_accessDeneme.day34_Tekrar;

public class ToyotaCorolla extends Toyota {
    public static void main(String[] args) {
        ToyotaCorolla arb1 = new ToyotaCorolla();
        System.out.println(arb1.marka); //Toyota
        System.out.println(arb1.model); //Model Belirtilmedi
        System.out.println(arb1.yakit); //Yakit Belirtilmedi

        /*
        Child class'tan parent class'C01_I erisimde access modifier kurallarini bypass edemeyiz
        ornegin parent class'taki private clas uyelerini child
        class'tan kullanamayiz. Ayni sekilde paren tve cild farkli package'larda
        ise parent class'taki default access modifier'i olan class uyelerini child class'tan kullanamayiz.
        */

        arb1.marka = "Opel";
        System.out.println(arb1.marka); //Opel
        arb1.model = "Insignia";
        System.out.println(arb1.model); //Insignia
        arb1.yakit = "Elektrikli";
        System.out.println(arb1.yakit); //Elektrikli


    }

}
