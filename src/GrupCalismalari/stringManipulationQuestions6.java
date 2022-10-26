package GrupCalismalari;
import java.util.Scanner;
public class stringManipulationQuestions6 {
    public static void main(String[] args) {
        //Kullanicidan bir sifre girmasini isteyin. Asagidaki sartlari sagliyorsa
        //Sifre basari ile tamamlandi
        // sartlari saglamazsa lutfen yeni bir sifre giriniz yazdirin
      /*
      -ilkhar buyuk olmali
      -sonharf kucuk olmali
      -sifre bosluk icermemeli
      -sifre uzunlugu en az 8 karakter olmali.
     */
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen sifrenizi giriniz");
        String sifre= scan.nextLine();
        boolean ilkharfcont=sifre.charAt(0)>='A' && sifre.charAt(0)<='Z';
        boolean sonharfcont=sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(sifre.length()-1)<='z';
        boolean boslukkont=!sifre.contains(" ");
        boolean uzunlukcont= sifre.length()>= 8;
        if(ilkharfcont && sonharfcont && boslukkont && uzunlukcont){
            System.out.println("sifre tanimlandi");
        } else{
            System.out.println("yeni bir sifre giriniz");
        }
    }
}
