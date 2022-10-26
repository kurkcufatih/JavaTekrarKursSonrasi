package day06_concatenation;

import java.util.Scanner;

public class C01_WrapperClasses {
    public static void main(String[] args) {
        //Wrapper class javanin hazir metolarini kullanabilmemeiz icin primitive data turlerinden herbiri icin actigi class'lardir.

        String str= "Java ile hayat ne guzel";
        System.out.println(str.toUpperCase()); //JAVA ILE HAYAT NE GUZEL
        boolean buGuzelMi=true;
        //guzelMi.toString();
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        String ogrNo= "123456";  //eger toplama cikarma yapmayacaksak rakamlarla ilgili seylerde String kullanabiliriz.
        //kullanicidan bir sifre isteyin, eger sifre sadece rakamlardan olusuyorsa kabul etmeyelim.
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 5 basamakli bir sifre giriniz");
        String sifre=scan.nextLine();
        Integer sifreSayi= Integer.parseInt(sifre);
        System.out.println("girilen sifrenin 3 fazlasi : " + (sifre+3));
        System.out.println("Integer sifrenin 3 fazlasi: " + (sifreSayi+3));
    // Wrapper class'lar ilerde kullanabilecegimiz cok faydali hazir metodlar icerir.//


    }
}
