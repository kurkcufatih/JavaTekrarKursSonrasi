package day19_Scope;

public class day19_Tekrar_instance_static_and_class_variables {
    public static void main(String[] args) {

        // Soru 2 ) "m" harfinden baslayarak "c" harfine kadar tum harfleri yazdirin.

        // =====================for loop ile ================
        for (char i = 'm'; i >'c' ; i--) {

            System.out.print(i + " ");
        }


        // =====================  while loop ile =============
        System.out.println(" ");
        char krk='m';

        while(krk > 'c') {
            System.out.print(krk + " ");
            krk--;
        }


        // =====================  do while loop ile =============
        System.out.println(" ");

        char harf='m';
        do {
            System.out.print(harf +" ");
            harf--;
        }while(harf>'c');
    }
}
