package day11_stringManipulations;

public class C02_lastIndexOf {
    public static void main(String[] args) {


        String cumle="Java cok kolay, Java cok guzel";
        String kelime="Java";
        /* Verilen kelime icin asagidaki sartlardan
        uygun olani yazan bir program yaziniz
        - verilen kelime cumlede kullanilmamis
        - verilen kelime cumlede sadece bir defa kullanilmis
        - verilen kelime cumlede birden fazla kullanilmis
        */
    int kelimeIlkIndex=cumle.indexOf(kelime);
    int kelimeSonIndex=cumle.lastIndexOf(kelime);
        System.out.println(kelimeIlkIndex);
        System.out.println(kelimeSonIndex);

    if (kelimeIlkIndex==-1) {
        System.out.println("verilen kelime cumlede kullanilmamis");
    } else if (kelimeIlkIndex==kelimeSonIndex) {
        System.out.println("verilen kelime cumlede sadece bir defa kullanilmis");
    } else {
        System.out.println("verilen kelime cumlede birden fazla kullanilmis");

    }
    }
}
