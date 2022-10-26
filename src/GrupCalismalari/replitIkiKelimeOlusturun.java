package GrupCalismalari;

public class replitIkiKelimeOlusturun {
    // isim1 çift sayıda karakter içeriyorsa,

    // ikinci kelimeyi ilk adın ortasına yerleştirin

    // ilk kelime tek sayida karakter iceriyorsa

    // “isim1, isim2 ye eklenemiyor” yazdırın

    // Örneğin:
    // isim1= mehmet
    // isim2= ahmet
    // Yazdır ==> mehahmetmet

    // isim1= memet
    // isim2= ahmet
    // Yazdır ==> isim1, isim2 ye eklenemiyor
    public static void main(String[] args) {
        String isim1 = "Fatiha";
        String isim2 = "Kubram";
        int sayac = 0;

        for (int i = 0; i < isim1.length(); i++) {

            sayac++;
            if (sayac % 2 == 1) {

            }
        }
        System.out.println("isim1, isim2'ye eklenemiyor");

        for (int i = 0; i < isim1.length(); i++) {
            sayac++;
            if (sayac % 2 == 0) {

            }
        }
        int index=sayac/4;
        System.out.println("index = " + index);
       String isim=isim1.substring(0,index)+isim2+isim1.substring(index);
        System.out.println(isim);


    }
}
