package day03_scanner;

import java.util.Scanner;

public class day03_Tekrar {
    public static void main(String[] args) {


        int sayi = 10;
        char harf = 'a';
        String str = "banan";

        System.out.println(harf); //a
        System.out.println(0 + harf); //97
        System.out.println(harf + sayi); //107
        System.out.println(str + harf); //banana
        System.out.println(sayi + harf); //107
        System.out.println(harf + str); //abanan
        System.out.println("" + sayi + harf); //10a
        System.out.println(str + sayi + harf); //banan10a

        //swap islemi yapiniz
        int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 = 0;

        sayi3 = sayi2; //sayi3=20
        sayi2 = sayi1; //sayi2=10
        sayi1 = sayi3; //sayi1=20

        System.out.println(sayi1); //20
        System.out.println(sayi2); //10

        //boylelikle sayi1=10'ken sayi1=20 oldu, ve sayi2=10 oldu.

        //ayni islemi swap yapmadan yapiniz
        sayi2 = sayi1 - sayi2; //10
        sayi1 = sayi2 + sayi2; //20

        System.out.println(sayi2);
        System.out.println(sayi1);

        //scanner kullanimi

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim = scan.next();
        System.out.println("isminiz : " + isim);

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Lutfen birinci sayiyi giriniz");
        double say1 = scan2.nextDouble();
        System.out.println("Lutfen ikinci sayiyi giriniz");
        double say2 = scan2.nextDouble();
        System.out.println("Girilen iki sayinin carpimi : " + say1 * say2);

        Scanner scan3 = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String ad = scan3.next();
        System.out.println("Lutfen soyisminizi giriniz");
        String soyad = scan3.next();
        System.out.println("Lutfen yasinizi giriniz");
        int yas = scan3.nextInt();
        System.out.println("Girilen bilgiler : " + ad + " " + soyad + " " + yas);


        //Java scanner class'inda next char methodu yoktur,
        // bunun yerine string olarak ilk kelimeyi alip,
        // onun da ilk harfini alabiliriz.//
        Scanner scan4 = new Scanner(System.in);
        System.out.println("Lufen isminizi giriniz");
        char isim2 = scan4.next().toUpperCase().charAt(0);
        System.out.println("Isminizin ilk harfi : " +isim2);

    }
}
