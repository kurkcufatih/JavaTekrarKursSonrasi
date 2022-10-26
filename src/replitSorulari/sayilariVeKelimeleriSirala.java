package replitSorulari;



import java.util.Arrays;


public class sayilariVeKelimeleriSirala {
    public static void main(String[] args) {
        /*Karışık verilen sayıları ve kelimeleri sıralayan Java kodunun yazınız.

        NOT: Test datadaki değerleri kullanınız.

        Test Data:

        [1232, 1134,2345,1022]
        [Java, Python, PHP, C#, C Programming, C++]

         */
        int sayilar[] = new int[4];
        sayilar[0]=1232;
        sayilar[1]=1134;
        sayilar[2]=2345;
        sayilar[3]=1022;
        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));

        String kelimeler[]=new String[6];
        kelimeler[0]="Java";
        kelimeler[1]="Python";
        kelimeler[2]="PHP";
        kelimeler[3]="C#";
        kelimeler[4]="C Programming";
        kelimeler[5]="C++";

        Arrays.sort(kelimeler);
        System.out.println(Arrays.toString(kelimeler));


    }
}
