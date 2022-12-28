package day22_arrays;

import java.util.Arrays;

public class day22_Tekrar_Arrays_MultiDimentionalArrays {
    public static void main(String[] args) {

        // "Java ogrendim,  #cok para ?kazandim.,"
        // cumlesinin kelimelerini, ozel karakterler
        // ve noktalama isaretleri olmadan
        // harf sirasina gore yazdiralim

        String cumle = "Java ogrendim,  #cok para ?kazandim.,";

        String kelimeler[] = cumle.split(" ");
        System.out.println(Arrays.toString(kelimeler));
        //[Java, ogrendim,, , #cok, para, ?kazandim.,]

        for (int i = 0; i < kelimeler.length; i++) {
            kelimeler[i] = kelimeler[i].replaceAll("\\W", "");
            //sayi ve harf olmayan tum karakterleri sil
            //[Java, ogrendim, , cok, para, kazandim]
        }
        System.out.println(Arrays.toString(kelimeler));
        for (int i = 0; i < kelimeler.length; i++) {
            System.out.print(kelimeler[i] + " ");
            //Java ogrendim  cok para kazandim
        }
        System.out.println();

        //==== Multidimentional Arrays (MDA) ====

        //Verilen bir multi dimensional array'in
        //tum elementlerini yazdiran bir method hazirlayiniz

        int[][] sayilar = {{1, 5, 6, 9, 4}, {2, 5, 5, 8}, {3, 1, 6}};

        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j < sayilar[i].length; j++) {
                System.out.print(sayilar[i][j] + " ");
                //1 5 6 9 4 2 5 5 8 3 1 6
            }
        }
        System.out.println();

        /*
        Verilen iki katli bir multi dimensional array'de
        outer index'i ve inner index'i ayni olan sayilarin
        toplamini bulunuz. [0][0]+[1][1]+[2][2]....
         */
        int[][] rakamlar = {{1, 5, 6, 9, 4}, {2, 5, 5, 8}, {3, 1, 6}};
        int rakamlarToplami = 0;

        for (int i = 0; i < rakamlar.length; i++) {
            for (int j = 0; j < rakamlar[i].length; j++) {
                if (i == j) {
                    rakamlarToplami += sayilar[i][j];
                }
            }
        }
        System.out.print(rakamlarToplami); //12
        /*
        sifirinci outher idexin sifirinci inner index degeri = 1
        birinci outher idexin birinci inner index degeri = 5
        ikinci outher indexin ikinci inner index degeri = 6
        toplamlari =12
         */

        /*
        Asagidaki multi dimensional array’in
        ic array’lerindeki tum elemanlarin toplamini
        birer birer bulan ve herbir sonucu yeni bir array’in elemani
        yapan ve yeni array’i  ekrana  yazdiran bir program yaziniz

        Ornek; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6 4+5=9 6+7=13
        ==> output: {6, 9, 13}
        */

        int[][] input = {{1, 2, 3}, {4, 5}, {6, 7}};
        int[] yeniArr = new int[input.length];
        int toplam = 0;

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                toplam += input[i][j];
            }
            yeniArr[i] = toplam;
            toplam = 0; //eger sifir yazmazsan toplaya toplaya devam ediyor
            //yani [6, 15, 28] seklinde sonuc veriyor

        }
        System.out.println(Arrays.toString(yeniArr)); //[6, 9, 13]


         /* Asagidaki multi dimensional array’in ic array’lerindeki
        son elemanlarin carpimini ekrana yazdiran bir program yaziniz
        { {1,2,3}, {4,5}, {6} }
         */
        int[][] arr = {{1, 2, 3}, {4, 5, 2}, {6, 3}};
        int carpim = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == arr[i].length - 1) {
                    carpim *= arr[i][j];
                }
            }
        }
        System.out.println("son elemanlarin carpimi : "+carpim);
        //son elemanlarin carpimi : 18
    }
}
