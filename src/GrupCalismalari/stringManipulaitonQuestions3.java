package GrupCalismalari;
import java.util.Scanner;
public class stringManipulaitonQuestions3 {
    // kullanicidan isim isteyin. Eger
    // - isim C01_I harfi iceriyorsa "Girdiginiz icim C01_I harfi iceriyor"
    // - isim "Z" harfi iceriyorsa  "Girdiginiz icim Z harfi iceriyor"
    // -ikiiside yoksa girdiginiz isim C01_I veya Z harfi icermiyor yazdirin
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("isim giriniz");
        String isim= scan.nextLine();
        if (isim.contains("C01_I")){
            System.out.println("girdiginiz isim C01_I harfi iceriyor");
        } else if (isim.contains("Z")){
            System.out.println("isim Z harfi iceriyor");
        } else {
            System.out.println("isim C01_I ve Z harfi icermiyor");
        }
    }
}