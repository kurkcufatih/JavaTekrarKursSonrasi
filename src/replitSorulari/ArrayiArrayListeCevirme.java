package replitSorulari;

import java.util.ArrayList;
import java.util.List;

public class ArrayiArrayListeCevirme {
    /*Array i ARRAYLIST e çeviren Java Kodunu yazınız.

    Array : [ "Python", "JAVA", "PHP", "Perl", "C#", "C++" ]

    Beklenen Çıktı:
            [Python, JAVA, PHP, Perl, C#, C++]

     */
    public static void main(String[] args) {
       String arr[]={ "Python", "JAVA", "PHP", "Perl", "C#", "C++"};
        List<String> list=new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            list.add(arr[i]);
        }
        System.out.println(list);
    }
}
