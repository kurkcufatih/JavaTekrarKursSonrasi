package GrupCalismalari;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class benzersizHarfler {

        public static void main(String[] args) {
            // tekrar eden harfleri yazdirmayan bir program olusturalim.
            String cumle="Bugun gunlerden java";
            cumle=cumle.replace(" ","");
            String arr[]=cumle.split("");
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));
            List<String> benzersiz=new ArrayList<>();
            for (int i = 0; i < arr.length-1 ; i++) {
                if(!arr[i].equals(arr[i+1])){
                    benzersiz.add(arr[i]);
                } if(!benzersiz.contains(arr[arr.length-1])){
                    benzersiz.add(arr[arr.length-1]);
                }
            } System.out.println("benzersiz = " + benzersiz);
            // if(!benzersiz.contains(arr[arr.length-1])){
            //  benzersiz.add(arr[arr.length-1] );
            List<String> tekraredenler=new ArrayList<>();
            for (int i = 0; i < arr.length-1 ; i++) {
                if(arr[i].equals(arr[i+1])&& !tekraredenler.contains(arr[i])) {
                    tekraredenler.add(arr[i]);
                }
            }
            System.out.println("tekraredenler = " + tekraredenler);
        }
    }
