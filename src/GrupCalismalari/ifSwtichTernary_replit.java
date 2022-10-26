package GrupCalismalari;

import java.util.Scanner;

public class ifSwtichTernary_replit {
  /*  Kullanıcıdan bir isim girmesini isteyin ve son 2 harfinin 3 kopyasından oluşan yeni bir String yazdırın

    Kullanicidan alinan isim uzunluğu en az 2 olacaktır.

            INPUT : Mustafa

    OUTPUT : fafafa

   */
  public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      System.out.println("Lutfen uzunlugu en az iki harften olusan isim giriniz");
      String isim= scan.next();
      if(isim.length()>=2){

      int isminUzunlugu=isim.length();
          System.out.println(isminUzunlugu);
      String sonIki=isim.substring(5);
          System.out.println("OUTPUT:" + sonIki+sonIki+sonIki);
          }
      }
  }




