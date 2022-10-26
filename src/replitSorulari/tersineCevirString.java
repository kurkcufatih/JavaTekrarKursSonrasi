package replitSorulari;
import java.util.ArrayList;
import java.util.List;
public class tersineCevirString {


        /*
        Bir String değişkeni cümlesi verildiğinde, her sözcüğü almak için kod yazın ve tersine ters çevrilmiş String'e atayın.
        Test Data:
        sentence -> "Java is fun"
        reversed -> "fun is Java"
         */
        public static void main(String[] args) {
            String cumle="Java is fun";
            String arr[]=cumle.split(" ");
            List<String> list=new ArrayList<>();
            String reverse="";
            for (int i = arr.length-1; i >=0 ; i--) {
                list.add(arr[i]);
            }
            System.out.println("list = " + list);
            for (int i = 0; i <list.size() ; i++) {
                reverse+=list.get(i) +" ";
            }
            System.out.println("reverse = " + list);
            System.out.println("reverse = " + reverse);
        }
    }

