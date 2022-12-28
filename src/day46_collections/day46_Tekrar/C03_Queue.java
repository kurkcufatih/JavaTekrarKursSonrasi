package day46_collections.day46_Tekrar;

import java.util.LinkedList;
import java.util.Queue;

public class C03_Queue {
    public static void main(String[] args) {
        Queue<String> kuyruk = new LinkedList<>();
        kuyruk.add("Lutfullah");
        kuyruk.add("Mustafa");
        kuyruk.add("Ridvan");

        System.out.println(kuyruk); //[Lutfullah, Mustafa, Ridvan]


        kuyruk.remove(); //bastakini siler
        System.out.println(kuyruk); //[Mustafa, Ridvan]


        kuyruk.remove(); //bastakini siler
        System.out.println(kuyruk); //[Mustafa, Ridvan]

        kuyruk.add("Hamdi"); //sona ekledi
        System.out.println(kuyruk); //[Ridvan, Hamdi]

        kuyruk.add(null);
        kuyruk.add(null);
        kuyruk.add(null);

        System.out.println(kuyruk); //[Ridvan, Hamdi, null, null, null]


    }
}
