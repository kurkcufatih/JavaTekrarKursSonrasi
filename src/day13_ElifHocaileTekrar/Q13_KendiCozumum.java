package day13_ElifHocaileTekrar;

import java.util.Scanner;

public class Q13_KendiCozumum {
    public static void main(String[] args) {
        /*
         * Ternary kullanarak bir kod yazin. fiyat isminde bir variable tanimlayin. eger fiyat
         * 10 dan az ise "ucuz" , 10 ile 20 arasinda ise "normal" , 20 ve 20 den buyuk ise pahali
         * olsun
         */

       /* Scanner scan=new Scanner(System.in);
        System.out.println("lutfen fiyati giriniz : ");

        int fiyat= scan.nextInt();
        if (fiyat>=0 && fiyat<=10) {
            System.out.println("Ucuz");
        } else if (fiyat> 10 && fiyat<= 20) {
            System.out.println("Normal");
        } else if (fiyat> 20 && fiyat<= 30) {
            System.out.println("Pahali");
        } else System.out.println("Lutfen gecerli bir fiyat giriniz"); */
    int fiyat=10;
        String result=(fiyat<10) ? "ucuz":fiyat<20? "normal": "pahali";
        System.out.println(result);

        //System.out.println((fiyat<10) ? "ucuz":fiyat<20? "normal": "pahali");
        // boyle de sout yapabiliriz veya bir onceski saout gibi result'C01_I atayarak da sout yapabiliriz

}
}

