package day36_inheritanceDataTypeKullanimi;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DIsci extends BMuhasebe{
    int saatUcreti = 11;
    int gunlukMesai = 7;

    protected void maasIsci() {
        System.out.println("Isciler : " + (30 * saatUcreti * gunlukMesai) + " maas alir");
    }

    protected void ozelSigortaIsci() {
        System.out.println("Isciler %70 indirimli ozel sigorta yaptirabilir");
    }

    public static void main(String[] args) {
        BMuhasebe isci1=new DIsci();
/*
Bir obje olusturulurken Data turu ve constructor ayni class'dan ise
direk o class'C01_I gidiyoruz.

Eger data turu ve constructor farkli ise Obje constructor'in oldugu class'in objesidir.
ancak bizden istenen
Isci class'indaki spesifik ozellikler degil
Bir iscinin muhasebe class'indaki tum calisanlarla
beraber sahip olugu genel ozellikleri yazdirir.


 */

        System.out.println(isci1.gunlukMesai); //8
        System.out.println(isci1.saatUcreti); //10
        isci1.maas(); //personel minimum : 2400 maas alir
        isci1.ozelSigorta(); //Isteyen calisanlara %50 indirimli ozel sigorta yapilir.
        isci1.sigorta();//Personel class'indan alir //Tum personelimize sigorta yapilir
        System.out.println(isci1.isim); //Personel class'indan alir
        System.out.println(isci1.soyisim); //Personel class'ondan alir
        System.out.println(isci1.departman); //Personel class'indan alir

    Apersonel isci2=new DIsci();

        //System.out.println(isci2.gunlukMesai); //8
        //System.out.println(isci2.saatUcreti); //10
        //isci2.ozelSigorta(); //Isteyen calisanlara %50 indirimli ozel sigorta yapilir.
        isci2.maas();//Muhasebe class'indan alir.
        isci2.sigorta();//Personel class'indan alir //Tum personelimize sigorta yapilir
        System.out.println(isci2.isim); //Personel class'indan alir
        System.out.println(isci2.soyisim); //Personel class'ondan alir
        System.out.println(isci2.departman); //Personel class'indan alir

        /*
        Eger data turu olan class'da aradigimiz ozellikler yoksa;
        -varsa onun parent'ine gidebilir
        -ama child'C01_I donus olmaz
        -Aradigi ozelligi bulmazsa CTE verir.
         */

        List<String> list1=new LinkedList<>();
        Deque<String> list2=new LinkedList<>();
        Queue<String> list3=new LinkedList<>();

        /*
        Hepsi LinkedList olsa da
        list1 List gibi davrenir
        list2 Deque gibi davranir
        list3 Queue gibi davranir
         */

    }
}
