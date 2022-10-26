package day21_Arrays;

import java.util.*;

public class C03_KendiCalismam {
    public static void main(String[] args) {
        /*Soru 3- Kullanicidan alinan bir ismin,
    verilen Array'de olup olmadigini kontrol edip bize
    bize true veya false sonucu donen bir method olusturun.
     */
        String[] isimler = {"Basak", "Nurullah", "Fatih", "Adem", "Enes"};
        Scanner scan = new Scanner(System.in);
        System.out.println("Aradiginiz ismi giriniz");
        String arananIsim = scan.next();
        List<String> isimList = new ArrayList<>();
        for (int i = 0; i < isimler[i].length(); i++) {
            isimList.add(isimler[i]);
        }
        System.out.println(isimList);
        if (isimList.contains(arananIsim)){
            System.out.println("Aranan isim : " +arananIsim);
    }

}
}
