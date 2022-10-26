package day15_overloading_forLoop;

public class C05_KendiDenemem {
    public static void main(String[] args) {
        //1'den 5'e kadar (5 dahil) olan tamsayilari toplayalim
        //10 dahil 20 dahil arasindaki sayilari toplayalim
        // 30 dahil 50 dahil, arasindaki cift sayilari toplayin
        //1500 ile 1600 (sinirlar dahil) arasinda 7 ile bolunebilen sayilarin toplami

        int sonuc = 0;
        for (int i = 0; i <= 5; i++) {
            sonuc += i;

        }
        System.out.println("toplam: " + sonuc);

        int sonuc2 = 0;
        for (int i = 10; i <= 20; i++) {
            sonuc2 += i;

        }
        System.out.println("toplam: " + sonuc2);

        int sonuc3 = 0;
        for (int i = 30; i <= 50; i++) {
            if (i%2==0){
                sonuc3+=i;
                }
        } System.out.println("cift sayilarin toplami: " + sonuc3);
        int sonuc4 =0;
        for (int i = 1500; i <=1600; i++) {
            if (i%7==0){
                sonuc4+=i;
            }
        }
        System.out.println("7 ile bolunebilen sayilarin toplami: " + sonuc4);

    }
}
