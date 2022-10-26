package day11_stringManipulations;

public class C02_KendiCalismam {
    public static void main(String[] args) {
        String cumle="Java cok kolay, Java cok guzel";
        String kelime="Java";

        /* Verilen kelime icin asagidaki sartlardan
        uygun olani yazan bir program yaziniz
        - verilen kelime cumlede kullanilmamis
        - verilen kelime cumlede sadece bir defa kullanilmis
        - verilen kelime cumlede birden fazla kullanilmis
         */

        int ilkindex=cumle.indexOf(kelime);
        int lastindex=cumle.lastIndexOf(kelime);
        if (ilkindex==-1) {
            System.out.println("Verilen kelime cumlede kullanilmamis");
        } else if (ilkindex==lastindex) {
            System.out.println("Verilen kelime cumlede sadece bir defa kullanilmis");
        } else {
            System.out.println("Verilen cumlede birden fazla kullanilmis");
        }
    }
}
