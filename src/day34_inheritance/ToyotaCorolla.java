package day34_inheritance;

public class ToyotaCorolla extends Toyota {

    public static void main(String[] args) {
/*
Child class'tan parent class'C01_I erisimde access modifier kurallarini bypass edemeyiz
ornegin parent class'taki private clas uyelerini child
class'tan kullanamayiz. Ayni sekilde paren tve cild farkli package'larda
ise parent class'taki default access modifier'i olan class uyelerini child class'tan kullanamayiz.
 */
        ToyotaCorolla arb1=new ToyotaCorolla();

        System.out.println(arb1.marka); //Toyota
        System.out.println(arb1.model);
    }
}
