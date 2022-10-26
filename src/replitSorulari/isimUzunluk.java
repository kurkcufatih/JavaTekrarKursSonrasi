package replitSorulari;

import java.util.Scanner;

public class isimUzunluk {
    /*  Kullanıcıdan bir isim yazmasını isteyin, adın uzunluğu 3 olmalıdır. Ardından, adın aynı karakterlere sahip olup olmadığını kontrol edin.

      Eger aynı karakterlere sahipse

  "isim ayni karakterlere sahiptir." yazdirin.

      Eger ayni karakterlere sahip degilse

  "Dizenin benzersiz karakterleri var" yazdirin.

      Ternary kullanin.

     */
    public static void main(String[] args) {
        System.out.println("Lutfen bir isim yaziniz");
        Scanner scan = new Scanner(System.in);
        String isim = scan.nextLine();
        String result = (isim.length() == 3) ? "Isim 3 harflidir" : "3 harfli degildir ";
        System.out.println(result);
        String result1 = ((isim.substring(0, 1).equals(isim.substring(1, 2))) || (isim.substring(0, 1).equals(isim.substring(2, 3))) ||
                (isim.substring(1, 2).equals(isim.substring(2, 3)))) ?
                "Isim ayni karakterlere sahip" : "Dizenin benzersiz karakterleri vardir";
        System.out.println(result1);
        System.out.println("sonuc = " + result);
    }
}