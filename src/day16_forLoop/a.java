package day16_forLoop;

import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double minute = scan.nextDouble();
        double yil=525.960;
        double gun=1440;
        System.out.println(minute+ " dakika yaklaşık" + (minute/yil) + " yıl 210 gündür");
    }
}
