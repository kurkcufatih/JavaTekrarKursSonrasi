package day17_nestedForLoop;

import java.util.Scanner;

public class C08_KendiCalismam {
    public static void main(String[] args) {
        /*Kullanicidan toplamak uzere sayilar alin
        sayiarin toplami 500'u gecince (500 dahil) sayilarin ve kac sayi
        toplandigini su sekilde yazdirin

        13 sayi girdiniz ve toplami 567
         */
int sayi=0;
int toplam=0;
int sayac=0;
Scanner scan=new Scanner(System.in);

while (toplam<500){
    System.out.println("Lutfen sayi giriniz");
    sayi=scan.nextInt();
    toplam+=sayi;
    sayac++;

}System.out.println(sayac+ " sayi girildi ve bu sayilarin toplami: " + toplam);
    }
}
