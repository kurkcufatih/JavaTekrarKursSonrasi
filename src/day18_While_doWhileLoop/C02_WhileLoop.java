package day18_While_doWhileLoop;

public class C02_WhileLoop {
    /*
    Kullanicidan bir sayi alin ve bu sayinin
    rakamlari toplamini yazdirin
     */
    public static void main(String[] args) {
        int input=5432;

        int rakamlarToplami=0;
        int birlerBasamagi=0;
        int temp=input; //bunu yapmak zorunlu degil ama orjinal input elimizde bulunsun diye teknik olarak iyi.


        while (temp>0){
            birlerBasamagi=temp%10;
            rakamlarToplami+= birlerBasamagi;
            temp /=10; //birler basamaginda kurtulalim, onceki islemde zaten ikiyi toplam islemine dahil ettik
            // o yuzden simdi ikiden bu sekilde kurtuluyoruz.
        }
        System.out.println(input + " sayisinin rakamlar toplami :" + rakamlarToplami);
    }
}
