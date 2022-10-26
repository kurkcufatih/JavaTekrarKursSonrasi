package day17_nestedForLoop;

public class C07_KendiCalismam {
    public static void main(String[] args) {
        //while loop kullanarak 20'den 50'ye kadar cift sayilari yazdiralim
        int bas = 20;
        int bitis = 50;
        for (int i = bas; i <= bitis; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");
        int temp = bas;
        while (temp <= bitis) {
            if (temp % 2 == 0) {
                System.out.print(temp + " ");
            }
            temp++;
        }
    }
}
