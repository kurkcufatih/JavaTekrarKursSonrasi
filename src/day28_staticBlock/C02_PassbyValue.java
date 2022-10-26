package day28_staticBlock;

public class C02_PassbyValue {
    public static void main(String[] args) {
        double satisFiyati=100;
        System.out.println(indirimliFiyat(satisFiyati)); //90
        System.out.println(satisFiyati);
        System.out.println(indirimliFiyat(satisFiyati)); //90
    }

    public static double indirimliFiyat(double orjinalFiyat) {
        /*
        method'umuz %10 indirim yapip yeni
        fiyati main method'a dondursun
         */
        double satisFiyati=orjinalFiyat*0.9;
        return satisFiyati;
    }

}
