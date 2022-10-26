package pazartesicalisma;
import java.util.Scanner;
public class stringManipulationQuestions4 {
    //Kullanicidan isim ve soyisismini isteyin hangisinin daha uzun oldugunu yazdirin.
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("isim ve soyisminizi giriniz");
        String isim= scan.nextLine();
        String soyisim= scan.nextLine();
        if (isim.length()>soyisim.length()){
            System.out.println("isim daha uzun");
        } else if(isim.length()==soyisim.length()){
            System.out.println("ikisi esit");
        }
        else{
            System.out.println("soyisim daha uzun");
        }
    }
}
