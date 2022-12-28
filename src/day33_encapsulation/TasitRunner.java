package day33_encapsulation;

public class TasitRunner {
    public static void main(String[] args) {

        /*
        ONEMLI: encapsulation nedir diye mulakatlarda sorulur.
        Hassas datalari korumak icin kullanilan saklama yontemidir
        Datalari private access modifier kullanarak saklariz
        saklanan datalara getter ve setter methodlarini kullarak ulasabiliriz
        getter saklanan datalari okumamizi saglar
        setter saklanan datalari obje uzerinden update edebilmemizi saglar
         */
        Tasit tst1=new Tasit();
        tst1.setTasitTuru("TIR");
        tst1.getTasitTuru();
        System.out.println(tst1.getTasitTuru()); //TIR
    }
}
