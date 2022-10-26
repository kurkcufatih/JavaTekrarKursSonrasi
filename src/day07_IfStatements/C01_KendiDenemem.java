package day07_IfStatements;

public class C01_KendiDenemem {
    public static void main(String[] args) {
        int sayi = 10;

        if (sayi > 0) {
            System.out.println("sayi pozitif");
        }
        if (sayi % 2 == 0) {
            System.out.println("cift sayi");
        }
        if (sayi % 5 == 0) {
            System.out.println("sayi 5'in tam katidir");
        }
    }
}
