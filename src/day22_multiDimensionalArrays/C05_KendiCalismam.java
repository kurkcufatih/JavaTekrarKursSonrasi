package day22_multiDimensionalArrays;

public class C05_KendiCalismam {
    /* Asagidaki multi dimensional array’in ic array’lerindeki
   son elemanlarin carpimini  ekrana yazdiran bir program yaziniz
   { {1,2,3}, {4,5}, {6} }
    */

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 2}, {6, 3}};
        int carpim = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {


                if (j==arr[i].length-1) //son elemani verir
                carpim*=arr[i][j];
            }

        }
        System.out.println("Son elemanlarin carpimi: " + carpim);

    }
}
