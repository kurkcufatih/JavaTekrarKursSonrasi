package GrupCalismalari;

import java.util.Arrays;

public class ArrayOrnegi {
    /*
kullanıcının girdigi bir array'in en buyuk elemani ile
en kucuk elemanının  farkını bulan bize donduren method create ediniz.
*/
    public static void main(String[] args) {
        int arr[]={1,2,3,4,8,9,5,6};
        fark(arr);
        System.out.println( fark(arr));
    }
    public static int fark(int [] arr) {
        int fark=0;
        Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));
        fark=arr[arr.length-1]-arr[0];
        System.out.println(fark);
        return fark ;
    }
}
