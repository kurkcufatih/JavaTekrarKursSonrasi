package day36_inheritanceDataTypeKullanimi.day36_Inheritence_Overriding;

import day36_inheritanceDataTypeKullanimi.BMuhasebe;

public class Memur extends Muhasebe {
    int saatUcreti = 12;
    int gunlukMesai = 9;

    protected void maas() {
        System.out.println("Bir memurun minimum : " + (30 * saatUcreti * gunlukMesai) + " maasi vardir");
    }

    protected void ozelSigorta() {
        System.out.println("Memurlar 60% indirimle ozel sigorta yaptirabilir");
    }

    public static void main(String[] args) {
        Memur memur = new Memur();
        System.out.println(memur.gunlukMesai);
        System.out.println(memur.saatUcreti);
        memur.maas();
        memur.ozelSigorta();
        memur.sigorta();
        System.out.println(memur.isim);
        System.out.println(memur.soyisim);
        System.out.println(memur.departman);

        Muhasebe muhasebe = new Muhasebe();
        /*
        Her ne kadar memur klasinin icinde olsam da olusturdugum obje Muhasebe class'indan.
        Cunku data turu ve constructor BMuhabsebe.

        String str="Murat"; //Aslinda her bir class bir data turudur,
        string mesela bir data turdur ve class'idir.
        ArrayList<Integer> list=new ArrayList<>(); //bir class'dir ve data turu'dur
        Integer sayi=20; //bir class'dir ve data turu'dur

        BMuhasebe class'i da obje olusturulabilen bir class'tir. Yani ayni zamanda data turudur
        Obje olusturdugumuz her class'in objeden once yazdigimiz class ismi bir Data turudur.
        class ismi bir data turudur variable isminden once gelir(ornegin; BMuhasebe)
        Obje olusturdugumuz her class ayni zamanda bir data turudur.

        */
        System.out.println(muhasebe.gunlukMesai); //8 //Muhasebeden alacak
        System.out.println(muhasebe.saatUcreti); //10 //Muhasebeden alacak
        muhasebe.maas(); //personel minimum : 2400 maas alir //Muhasebeden alacak
        muhasebe.ozelSigorta(); //Isteyen calisanlara %50 indirimli ozel sigorta yapilir. //Muhasebeden alacak
        muhasebe.sigorta();//Personel class'indan alir //Tum personelimize sigorta yapilir
        System.out.println(muhasebe.isim); //Personel class'indan alir //Isim belirtilmedi
        System.out.println(muhasebe.soyisim); //Personel class'ondan alir //Soyisim belirtilmedi
        System.out.println(muhasebe.departman); //Personel class'indan alir //Departman belirtilmedi

    }

}
