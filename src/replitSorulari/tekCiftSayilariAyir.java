package replitSorulari;

public class tekCiftSayilariAyir {
    /* Array içerisindeki tek ve çift sayıların kaçar tane olduğunu bulan Java Kodu yazınız.
     Array: [1,2,3,4,5,6,7,8,9]
             ​
     Beklenen Çıktı:
             ​
     Tek Sayilar: 5
     Cift Sayilar: 4
     */
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int count=0;
        for (int each:arr
        ) {
            if(each%2==0){
                count++;
                System.out.println("cift sayilar = " + each);
            }
        }System.out.println(" cift sayilar count = " + count);
        count=0;
        for (int each:arr
        ) {
            if(each%2!=0){
                count++;
                System.out.print("tek sayilar  = " + each+ " ");
            }
        }System.out.println("tek sayilar count = " + count);
    }
}
