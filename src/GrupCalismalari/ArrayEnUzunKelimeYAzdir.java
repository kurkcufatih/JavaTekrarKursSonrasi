package GrupCalismalari;

public class ArrayEnUzunKelimeYAzdir {
    /*Soru 2- Verilen String bir array’de en uzun ve en
   kisa String’leri yazdiran bir method olusturun
    */
    public static void main(String[] args) {
        String[] isimler = {"Erdal", "Onur", "Mehmet", "Hayrullah", "Mihrican"};
        String enUzun = isimler[0];
        String enKisa = isimler[0];
        for (int i = 0; i < isimler.length; i++) {
            if (isimler[i].length() > enUzun.length()) {
                enUzun = isimler[i];
            }

        }System.out.println("En uzun isim : " +enUzun);
        for (int i = 0; i < isimler.length; i++) {
            if (isimler[i].length() < enKisa.length()) {
                enKisa = isimler[i];
            }
        }System.out.println("En kisa isim : " +enKisa);
    }
}