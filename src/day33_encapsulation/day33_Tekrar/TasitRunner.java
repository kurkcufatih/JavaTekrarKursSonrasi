package day33_encapsulation.day33_Tekrar;

import day33_encapsulation.Tasit;

public class TasitRunner {
    public static void main(String[] args) {
        Tasit tasit = new Tasit();
        tasit.setTasitTuru("Kamyon");
        tasit.getTasitTuru();
        System.out.println(tasit.getTasitTuru()); //Kamyon
    }
}
