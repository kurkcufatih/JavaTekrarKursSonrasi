package day34_inheritance;

public class Personel {
/*
Eger parent class olacak dekilde tasarladiginiz bir claass
varsa veya ilerde bu class'i parent yapmak isteyenler olabilir
diyorsaniz o zaman variable ve method'larin access modifier'ini
protected
 */
    int personelNo;
    String isim = "Isim belirtilmedi";
    String departman = "Departman belirtilmedi";

    public void maas() {
        System.out.println("Tum personelin maasi vardir");
    }

    public void mesai() {
        System.out.println("Tum personel statusune gore mesai yapar");
    }

    public void fazlaMesaiUcreti(){
        System.out.println("Personel fazla ucretini statusune gore alir");
    }

}