package GrupCalismalari;

import java.util.Scanner;

public class replitBankaYildiz {
        public static void main(String[] args) {
        /*Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak verilen formata ceviren java kodunu yaziniz.
 Input:    John White
1234234534561478
    Output : Name :
    J*** W****
    CCN : **** **** **** 1478
    Ilk Harfler Buyuk harf ile baslamalidir.
         */
            Scanner scan=new Scanner(System.in);
                System.out.println("Lutfen isminizi giriniz");
                String isim=scan.nextLine().toLowerCase();
                System.out.println("Lutfen soyisminizi giriniz");
                String soyisim=scan.nextLine().toLowerCase();
                System.out.println("Lutfen kredi karti numaranizi giriniz");
                String krediKartiNu=scan.nextLine();

                isim=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
                soyisim= soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\w","*");
                krediKartiNu=krediKartiNu.substring(0,15).replaceAll("\\w","*")+krediKartiNu.substring(15);

                System.out.println(isim + " " + soyisim + "\n" + "CNN :"+krediKartiNu);

            }
        }






