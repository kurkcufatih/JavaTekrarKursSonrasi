package day17_nestedForLoop;

public class C01_ForLoop {
    public static void main(String[] args) {
        //verilen String'deki kullanilan harfleri
        //tekrarsiz olarak yazdirip
        //kelimede kullanilan farkli harf sayisini veren bir method yaziniz


        String input="Java her zaman guzel";
        tekrarsizYap(input);

    }

    private static void tekrarsizYap(String input) {
        //kullanilan harfler (j,a,v,h,e,r,z,m,n,g,u,l)
        String benzersizInput="";

        String islenecekKelime=input.replaceAll("\\W","");


        for (int i = 0; i <islenecekKelime.length() ; i++) {
          if (!benzersizInput.contains(islenecekKelime.substring(i,i+1))) {
              benzersizInput+=islenecekKelime.substring(i,i+1);
          }
        }

        System.out.println("input :" + input);
        System.out.println("benzersiz input :" + benzersizInput);
    }
}
