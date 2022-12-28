package day36_inheritanceDataTypeKullanimi.day36_Inheritence_Overriding;

public class Isci extends Muhasebe {
    int saatUcreti = 11;
    int gunlukMesai = 7;

    protected void ozelSigorta() {
        System.out.println("Isciler 70% indirimle ozel sigorta yaptirabilirler");
    }

    protected void maasIsci() {
        System.out.println("Bir iscinin maasi : " + (30 * saatUcreti * gunlukMesai));
    }

    public static void main(String[] args) {

        /*
Bir obje olusturulurken Data turu ve constructor ayni class'dan ise
direk o class'C01_I gidiyoruz.

Eger data turu ve constructor farkli ise Obje constructor'in oldugu class'in objesidir.
ancak bizden istenen
Isci class'indaki spesifik ozellikler degil
Bir iscinin muhasebe class'indaki tum calisanlarla
beraber sahip olugu genel ozellikleri yazdirir.


 */
        Muhasebe isci = new Isci();
        System.out.println(isci.gunlukMesai); //8
        System.out.println(isci.saatUcreti); //10
        isci.maas(); //2400
        isci.ozelSigorta(); //50% indirim
        isci.sigorta(); //Tum personelin sigortasi var //Personel class'indan alir
        System.out.println(isci.isim); //Personel class'indan alir
        System.out.println(isci.soyisim); //Personel class'indan alir
        System.out.println(isci.departman); //Personel class'indan alir

        Personel isci2 = new Isci();
        isci2.mass(); //Muhasebe class'indan alir.
        isci2.sigorta(); //Personel class'indan alir //Tum personelin sigortasi var
        System.out.println(isci2.isim); //Personel class'indan alir
        System.out.println(isci2.soyisim); //Personel class'indan alir
        System.out.println(isci2.departman); //Personel class'indan alir


    }
}
