package day03_scanner;

public class C01_KendiDenemem {
    public static void main(String[] args) {
        int sayi=10;
        char harf='a';
        String str= "banan";
        System.out.println(sayi+harf); //107
        System.out.println(str+harf); //banana
        System.out.println(""+sayi+harf); //10a
        System.out.println(harf+2); //99
        System.out.println(str+sayi+harf); //banan10a
    }
}
