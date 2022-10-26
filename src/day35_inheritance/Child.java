package day35_inheritance;

public class Child extends BParent {
    String isim = "Child isim belirtilmedi";
    protected String childKlupAdi = "Child Klubu";

    Child() {
        System.out.println("Child constructor calisti");
    }

    public static void main(String[] args) {
        AGrandParent gp1 = new AGrandParent();
        //Bu objeyi olusturmak icin Grandpa constructor calisir.
        //Parent veya Child constructor calismaz.

        Child child1 = new Child();
        child1.grandpaKlupAdi = "Child1";
        child1.parentKlupAdi = "Child2";

        //child1 objesi icin Child Constructor calisti
        /*Java'da bir class'i kullanabilmek icin
        o class'tan obje olusturur, dolayisiyla
        o class'in constructor'ini kullanirdik.

        Java inheritamce'da parent class'lardaki ozellikleri
        kullanabilmek icin o class'larin constructor'larini
        otomatik calistiran bir yapi kurmustur.

        Ornegin biz child class'inda Child class'indan bir obje
        olusturmak istedigimizde Child constructor'ini kullaniriz.

        Java Child(){} gordugunde once parent'in constructor'ini
        calistirmam lazim der, buradan Parent constructor'C01_I gider.
        Parent class'inda Parent(){} gorunce once bunun parent'inin
        yani Grandparent constructor calismasi gerekir der. Dolayisiyla
        chil'dan basladik, bu class'in bir parenti var mi dedik var, sonra
        onun constructorina gittik, baktik ki orada da Grapdparent constructor'i
        var o zaman ona gittik. Ne kadar varsa o kadar ilerliyoruz, taki son class'C01_I
        kadar, once en sondaki(yani en bas) sonctructor'C01_I gider ve oradan calistirmaya baslar.

        extends keywordu olmayan class'C01_I kadar gider
        ve oradan baslayarak tum constructorlaro asagi dogru calisir.

        **Static methodlar veya variable'lar inherit edilemezler**

         */

    }
}
