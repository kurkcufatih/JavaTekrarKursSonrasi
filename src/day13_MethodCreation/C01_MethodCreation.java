package day13_MethodCreation;

public class C01_MethodCreation {
    public static void main(String[] args) {
        //input olarak verilen iki integer'i toplayip
        //sonucunu yazdiran bir method olusturun.
        int input1 = 10;
        int input2 = 20;
        //method dort adimda olusturulur.
        //1.adim method call
        //2.adim argument eklenmesi gerekiyorsa ekleyelim
        //eger metod'un return type'i void'den farkli olacaksa
        //bir variable olusturup, method call'u assign edelim.

        topla(input1, input2);
    }

    public static void topla(int input1, int input2) {
        //3.adim method deklerasyonunda degistirilmesi gereken
        //bolumleri degistir (access modifier, return type degisebilir.
        //4. adim eger return type void disinda bir sey ise
        //return keyword'u ve donecek degeri hesaplamaliyiz
        System.out.println("Girilen iki sayinin toplami : " + (input1 + input2));
    }
}
