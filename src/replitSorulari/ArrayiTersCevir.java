package replitSorulari;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ArrayiTersCevir {

        public static void main(String[] args) {
      /*  Bir arrayi tersine çeviren  method yazınız.
        Test Data:
        reverse [1, 2, 3, 4]
        return  [4, 3, 2, 1]
       */
            int arr[]={1,2,3,4};
            List<Integer> list=new ArrayList<>();
            for (int i = arr.length-1; i >=0 ; i--) {
                list.add(arr[i]);
            }
            System.out.println("list = " + list);
            Integer [] vektor=new Integer [list.size()];
            vektor=list.toArray(vektor);
            System.out.println(Arrays.toString(vektor));
        }
    }

