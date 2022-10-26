package day13_ElifHocaileTekrar;

import java.util.Scanner;

public class Q2_KendiCozumum {
    public static void main(String[] args) {
         /*  Problem Tanımı
        Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
        Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
        120 km/saat hızla giden bir araç ne kadar sürede hedefe varır?
        Örnek Ekran Çıktısı
        Mesafeyi giriniz: 400
        Hızı giriniz: 100
        Süre 4 saattir. Hız = Alınan mesafe / zaman
     */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen mesafe ve hizinizi yaziniz");
        int mesafe= scan.nextInt();
        System.out.println(mesafe);
        int hiz= scan.nextInt();
        System.out.println(hiz);
        int sure=(mesafe/hiz);
        System.out.println("Sure : " +sure);
    }
}
