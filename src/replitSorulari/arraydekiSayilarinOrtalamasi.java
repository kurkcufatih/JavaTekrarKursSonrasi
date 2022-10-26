package replitSorulari;

public class arraydekiSayilarinOrtalamasi {
    /*
    Arraydeki sayıların ortalamasını hesaplayan Java Kodunu yazınız.

    Array = [20, 30, 25, 35, -16, 60, -100 ]

    Beklenen Çıktı:
    Array Sayılarının ortalaması: 7.0
     */
    public static void main(String[] args) {
        int arr[]={20, 30, 25, 35, -16, 60, -100};
        int top=0;
        int ort=top/ arr.length;
        for (int i = 0; i <arr.length ; i++) {
            top+=arr[i];
            //System.out.println("top = " + top);
            ort=top/ arr.length;
        }  System.out.println("ort = " + ort);
    }
}