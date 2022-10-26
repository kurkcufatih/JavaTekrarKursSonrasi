package day17_nestedForLoop;

public class C07_WhileLoop {
    public static void main(String[] args) {
        //20'den 50'ye kadar cift sayilari yazdiralim

        int bas = 20;
        int bitis = 50;

        while (bas <= bitis) {
            if (bas % 2 == 0) {
                System.out.print(bas + " ");
            }
            bas++;
        }
    }
}