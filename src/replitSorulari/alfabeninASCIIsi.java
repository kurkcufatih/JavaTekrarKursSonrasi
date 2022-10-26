package replitSorulari;

public class alfabeninASCIIsi {
    public static void main(String[] args) {

        /*'C01_I' ile 'z' arasındaki karakterlerin ascii değerlerini yazdıran bir Java programı yazın.*/
        char harf = 97;

        for (int i = 'a'; i <= 'z'; i++) {
            System.out.println("Ascii value of " + harf + " = " + i);
            harf++;

            /*
            VEYA
            for (int i = 'C01_I'; i <= 'z'; i++) {
    System.out.println("Ascii value of " + (char) i + " = " + i);
}
             */
        }
    }
}