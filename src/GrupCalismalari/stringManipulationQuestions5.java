package GrupCalismalari;
import java.util.Scanner;
public class stringManipulationQuestions5 {
    //Kullanicidan 4 harfli bir kelime isteyin ve girileni tersten yazdirin.
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("4 harfli bir kelime giriniz");
        String kelime= scan.nextLine();
        kelime=kelime.substring(3,4)+ kelime.substring(2,3) + kelime.substring(1,2)+ kelime.substring(0,1);
        System.out.println(kelime);
    }
}