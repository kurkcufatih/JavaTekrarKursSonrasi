package day43_interfaces_iterators;

public interface I01_InterfaceBodyOlanMethod {

    void motor();
    public void yakit();
    public abstract String aku();

    /*
    Normal bir class'da oldugumuzu dusunursek iki tane
    access modifier kullanma ihtimali OLMAZ

    Asagidaki method'da gorebileceginiz gibi istisnai olarak
    body'si olan method'lar olusturulabilir. Bu ozellik
    Java 8'den sonra kullanilmaya baslamistir. Bu ozellikten once bir interface'e
    yeni bir method eklememiz gerektiginde eskiden beri bu
    interface'i implement eden tum class'lara gidip yeni eklenen
    method'u override etmemiz gerekirdi.

    Bu ozellik sayesinde basina default veya static keyword ekleyerek
    interface'de yeni ve body'si olan bir method olusturursak
    bu method'un child class'lar tarafindan override edilme MECBURIYETI
    OLMAZ ve eskiden implement etmis class'lari degistirmemiz gerekmez

    Bu istisnai bir durumdur ve interface icin olusturulan
    genel kurallari bozmaz.

    Bu method'larin body'si olsa da bunlara concrete method denmez
    ama override edilme mecburiyetleri yoktur.

    buradaki default kelimesi access modifier degil
    istisnai durumun belirtilmesi icindir

    O zaman nicin 2 keywor (static ve default) tanimlanmistir?
    Bu iki farkli kelimenin amaci
    Child class'lardan bu method'a nasil erisilebilecegini belirlemek icindir
    static keyword kullanilirsa, child class'dan bu method'a erismek icin
    InterfaceAdi.methodAdi yeterli olur.

    Default keyword kullanilirsa, method'a erisim icin obje olusturulmalidir.
     */

    public default void teker(){
        System.out.println("Tum arabalarin tekeri vardir");
    }
    public static void direksiyon(){
        System.out.println("Tum arabalarin direksiyonu vardir");
    }
}
