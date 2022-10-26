package day36_inheritanceDataTypeKullanimi;

import javax.imageio.stream.ImageInputStream;
import java.util.ArrayList;

public class CMemur extends BMuhasebe {
    int saatUcreti = 12;
    int gunlukMesai = 9;

    protected void maas() {
        System.out.println("Bir memurun min : " + (30 * saatUcreti * gunlukMesai) + " maas alir");
    }

    protected void ozelSigorta() {
        System.out.println("Memurlar %60 indirimli ozel sigorta yaptirabilir");
    }

    public static void main(String[] args) {
        CMemur mmr1 = new CMemur();
        System.out.println(mmr1.gunlukMesai); //9
        System.out.println(mmr1.saatUcreti); //12
        mmr1.maas(); //Bir memurun min : 3240 maas alir
        mmr1.ozelSigorta(); //Memurlar %60 indirimli ozel sigorta yaptirabilir
        mmr1.sigorta();//Personel class'indan alir //Tum personelimize sigorta yapilir
        System.out.println(mmr1.isim); //Personel class'indan alir //Isim belirtilmedi
        System.out.println(mmr1.soyisim); //Personel class'ondan alir //Soyisim belirtilmedi
        System.out.println(mmr1.departman); //Personel class'indan alir //Departman belirtilmedi
        BMuhasebe mhsb1 = new BMuhasebe();
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
        System.out.println(mhsb1.gunlukMesai); //8 //Muhasebeden alacak
        System.out.println(mhsb1.saatUcreti); //10 //Muhasebeden alacak
        mhsb1.maas(); //personel minimum : 2400 maas alir //Muhasebeden alacak
        mhsb1.ozelSigorta(); //Isteyen calisanlara %50 indirimli ozel sigorta yapilir. //Muhasebeden alacak
        mhsb1.sigorta();//Personel class'indan alir //Tum personelimize sigorta yapilir
        System.out.println(mhsb1.isim); //Personel class'indan alir //Isim belirtilmedi
        System.out.println(mhsb1.soyisim); //Personel class'ondan alir //Soyisim belirtilmedi
        System.out.println(mhsb1.departman); //Personel class'indan alir //Departman belirtilmedi


    }
}
