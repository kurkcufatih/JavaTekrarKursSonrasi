package day46_collections.day46_Tekrar;

import java.util.Deque;
import java.util.LinkedList;

public class C04_Deque {
    public static void main(String[] args) {
        Deque<String> ciftBasli = new LinkedList<>();
        ciftBasli.add("Yildiz");
        ciftBasli.add("Ali");
        System.out.println(ciftBasli); //[Yildiz, Ali]

        ciftBasli.addLast("Emine");
        System.out.println(ciftBasli); //[Yildiz, Ali, Emine]

        System.out.println(ciftBasli.pop()); //Yildiz 'i sildi (birinci siradaydi)
        System.out.println(ciftBasli); //[Ali, Emine]

        ciftBasli.push("Seyfullah");
        System.out.println(ciftBasli); //[Seyfullah, Ali, Emine]

        ciftBasli.add(null); //sona ekledi
        System.out.println(ciftBasli); //[Seyfullah, Ali, Emine, null]

        ciftBasli.addFirst(null); //basa ekledi
        System.out.println(ciftBasli); //[null, Seyfullah, Ali, Emine, null]

    }
}
