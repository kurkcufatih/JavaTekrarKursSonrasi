package GrupCalismalari;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class replitIfSwitchTernary {
   /* Kullanıcıdan bir isim yazmasını isteyin, adın uzunluğu 3 olmalıdır. Ardından, adın aynı karakterlere sahip olup olmadığını kontrol edin.

    Eger aynı karakterlere sahipse

"isim ayni karakterlere sahiptir." yazdirin.

    Eger ayni kaakterlere sahip degilse

"Dizenin benzersiz karakterleri var" yazdirin.

    Ternary kullanin.

    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 3 harfli bir isim giriniz");
        String isim = scan.next();

        for (int i = 0; i < isim.length(); i++) {
            if (isim.contains(isim.substring(i, i + 1))) {
            }
        }
        System.out.println("isim ayni karakterlere sahiptir");

    }
}
