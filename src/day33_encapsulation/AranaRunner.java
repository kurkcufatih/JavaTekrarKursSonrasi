package day33_encapsulation;

public class AranaRunner {
    public static void main(String[] args) {
        Araba arb1 = new Araba();
        //arb1 objesi uzerinden marka variable'ina
        //ulasabildim, degistirebildim(set) ve yazdirabildim(get).
        arb1.marka = "Toyota";
        System.out.println(arb1.marka);

        //access modifier kullanark marka variable'ina ulasimi
        //tamamen resbest yapabilir veya tamamen engelleyebiliriz.
        //private yaptiggimiz model'e hic ulasamayiz
        //yani access modifier ya hep ya hic diyor. Ya ulasir degistirirsin ya da ulasamaz ve degistiremezsin
        //model'i degistirelim ama goremeyelim.
        //yakit'i da gorelim aa degistiremeyelim.

        //set ve get yatkilerini ozel olarak tanimlamak isterseniz
        //1. adim - ozel yetki tanimlayacaginiz variable'lari private yapin.
        //          private bir data ya baska class'lardan ulasmak mumkun olmadigindan
        //2. adim - set yetkisi icin setter ve get yetkisi icin getter methodlari olusturalim

        /*ONEMLI :  arb1. yazdigimizda set ve get ler Araba class'inda belirttigimiz kurallar cercevesinde geliyor
        yani sadece set ve sadece get olusturduysak arb1 den sonra nokta yapinca olusturduklarimiz cikiyor. */


        arb1.setModel("Corolla"); //setModel dedigimizde String bir sey girebiliyoruz cunku ayarladik.
        //Modeli yazdirama imkanimiz yok cunku getter yok.


        arb1.getYakit(); //get yakit sectigimizde icine bir sye yazdirmiyor cunku ayarladik.
        //yakiti degistiremeyiz cunku setter methodu yok.

        System.out.println(arb1.getYakit());

    }
}
