package replitSorulari;

public class dogalSayilarToplami {
    /*1'den 100'e kadar olan doğal sayıların toplamını bulan programı yazınız.

            OutPut:

    Sayilarin Toplami : 5050
     */
    public static void main(String[] args) {
        int OutPut = 0;
        for (int i = 0; i <=100; i++) {
            OutPut+=i;

        }
        System.out.println("Sayilarin Toplami : " + OutPut);

    }
}
