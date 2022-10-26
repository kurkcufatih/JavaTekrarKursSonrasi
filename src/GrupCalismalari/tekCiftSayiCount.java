package GrupCalismalari;

public class tekCiftSayiCount {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println("count : " + count);
        count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 1) {
                count++;
            }
        }
        System.out.println("count : " + count);
    }
}

