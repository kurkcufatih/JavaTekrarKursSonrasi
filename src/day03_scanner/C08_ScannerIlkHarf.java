package day03_scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C08_ScannerIlkHarf {
    public static void main(String[] args) {
        //kullanicidan ismini alip ilk harfini buyuk harf olarak yazdirin//
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        //Java scanner class'inda next char methodu yoktur, bunun yerine string olarak ilk kelimeyi alip, onun da ilk harfini alabiliriz.//

        char IlkHarf=scan.next().toUpperCase().charAt(0);
        System.out.println("Ismin ilk harfi: "+ IlkHarf);
    }
}
