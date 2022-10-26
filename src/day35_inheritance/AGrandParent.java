package day35_inheritance;

public class AGrandParent {

    protected String isim="Grandpa ismi belirtilmedi";
    /*
    Her class'ta gorunmese bile bir contructer vardir. Bu class'tan
    obje olusturmak istedigimizde default contructor devreye girecektir.

    Default constructor'i gozlemleyemeyecegimiz icin onun yerine
    kullanilabilecek parametresiz contructor olusturalim.
     */
    protected String grandpaKlupAdi="Grandpa Klubu";
AGrandParent(){
    System.out.println("Grandpa constructor calisti");
}
}
