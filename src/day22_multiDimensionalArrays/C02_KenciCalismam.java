package day22_multiDimensionalArrays;

public class C02_KenciCalismam {
    //Verilen bir multi dimensional array'in
    //tum elementlerini yazdiran bir method hazirlayiniz
    public static void main(String[] args) {

        int[][] sayilar = {{1, 5, 6, 9, 4}, {2, 5, 5, 8}, {3, 1, 6}};
        elementYazdir(sayilar);
    }

    private static void elementYazdir(int[][] sayilar) {
        for (int i = 0; i <sayilar.length ; i++) {
            for (int j = 0; j <sayilar[i].length ; j++) {
                System.out.print(sayilar[i][j]+ " ");
            }


        }
    }
}
