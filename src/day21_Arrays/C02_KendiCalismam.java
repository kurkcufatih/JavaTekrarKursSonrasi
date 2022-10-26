package day21_Arrays;

public class C02_KendiCalismam {
    /*Soru 2- Verilen String bir array’de en uzun ve en
  kisa String’leri yazdiran bir method olusturun
   */
    public static void main(String[] args) {
        String[] isimler = {"Erdal", "Onur", "Mehmet", "Hayrullah", "Mihrican"};

        String enUzunIsim=isimler[0];
        String enKisaIsim=isimler[0];
        for (int i = 0; i <isimler.length ; i++) {
            if (isimler[i].length()< enKisaIsim.length()){
                enKisaIsim=isimler[i];
            }
            if (isimler[i].length()>enUzunIsim.length()){
                enUzunIsim=isimler[i];
            }
        }
        System.out.println(enKisaIsim);
        System.out.println(enUzunIsim);

    }
}
