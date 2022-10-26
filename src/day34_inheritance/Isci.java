package day34_inheritance;

public class Isci extends Personel {
    /*
    Normal hayatta parent cocuk sahibi olma karar verebilir.
    Java'da ise child class'lar ozelliklerini inherit etmek istedikleri
    class'i kendilerine parent edinirler.

    Mesela isci class'ini olusturunca nelere ihtiyaci var diye dusunsek
    Personel class'indaki tum variable ve method'lara ihtiyaci oldugunu
    gorebiliriz, bu durumda yeniden o variable ve method'lari olusturmak
    yerine, personel class'ini kendimize parent ediniriz.

    Bir class'i parent edinmek icin extends key word'unu kullanmaliyiz.

     Bir class baska bir class'i parent edindiginde
     1- parent class'daki tum ozelliklere (variable+method) otomatik olarak sahip olur
     2-Parent class'daki ozelliklerden bazilarini kendine uyarlayabilir
     3-Parent class'da olmayan bazi yeni ozellikler olusturabilir.

     not: parent class'daki ozellerinden hicbirini reddedemez ama degistirebilir.

     */
    int personelNo=1001;
    public static void main(String[] args) {
        Isci isci1 = new Isci();
        System.out.println(isci1.isim); //Isim belirtilmedi
        isci1.isim = "Selim";
        System.out.println(isci1.personelNo); //1001 yazar cunku kendi class'imizda varsa onu kullaniriz, o yuzden personel class'inda renklenmedi.

        isci1.maas(); //Tum personelin maasi vardir


    }
    public void maas(){
        System.out.println("Isciler minimum 15 Eu saat ucreti alir");
    }

    public void ozelSigorta(){
        System.out.println("Iscilerden isteyene yuzde elli indirimli sigorta yaptirilir.");
    }
}
