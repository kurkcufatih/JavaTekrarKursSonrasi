package day24_ArrayLists_ForEachLoop;

import java.util.*;

public class day24_Tekrar_ArrayList {
    public static void main(String[] args) {

        /*
        Icinde 200 tane 1000'den kucuk pozitif tamsayi olan
        bir list olusturun Kullanicidan bir sayi isteyip,
        Listede var olup olmadgini kullaniciya donun.
         */

        Random random = new Random();
        int sayi = 0;
        List<Integer> sayiList = new ArrayList<>();
        while (sayiList.size() < 200) {
            sayi = random.nextInt(1000);
            if (!sayiList.contains(sayi)) {
                sayiList.add(sayi);
            }
        }

        //System.out.println(sayiList);

        boolean bildiMi = false;
        int tahminSayisi = 1;
        Scanner scan = new Scanner(System.in);
        while (!bildiMi) {
            System.out.println("Lutfen bir sayi giriniz");
            sayi = scan.nextInt();
            if (sayiList.contains(sayi)) {
                System.out.println("Tebrikler " + tahminSayisi + " adet tahminde listeden sayi buldunuz");
                bildiMi = true;
            } else {
                System.out.println(tahminSayisi + " adet sayi soylediniz ama hicbiri listede yok");
                tahminSayisi++;
            }
        }

        //==== Array'de tekrar eden elemanlari yazdirma

        //Soru 1) Verilen bir array’deki tekrar eden elementleri yazdirin.

        int[] arr = {2, 3, 5, 6, 3, 5, 4, 1, 9, 6, 3, 5, 5};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        List<Integer> tekrarEdenler = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[i + 1] && !tekrarEdenler.contains(arr[i])) {
                System.out.print(arr[i] + " "); //3 5 6
                tekrarEdenler.add(arr[i]);
            }
        }

        //Verilen bir array’deki tekrar eden elementleri tek bir defa barindiran
        //yeni bir array olarak donduren bir method olusturun

        int[] uniqueArray = uniqueArrayOlustur(arr);


        //==== Array'de istenmeyenleri silme ====


        // Soru 4) Verilen bir array'de istenmeyen
        // harf iceren kelimeleri silip,
        // kalan elementleri yeni bir array yapin

        String[] sehirler = {"Istanbul", "Ankara", "Mersin", "Konya", "Kastamonu"};
        String istenmeyenHarf = "r";
        List<String> kalanlar = new ArrayList<>();

        for (int i = 0; i < sehirler.length; i++) {
            if (!sehirler[i].contains(istenmeyenHarf)) {
                kalanlar.add(sehirler[i]);
            }
        }
        System.out.println(kalanlar); //[Istanbul, Konya, Kastamonu]

        String[] kalanlarArrayi = new String[kalanlar.size()];
        for (int i = 0; i < kalanlarArrayi.length; i++) {
            kalanlarArrayi[i] = kalanlar.get(i);
        }
        sehirler = kalanlarArrayi;
        System.out.println(Arrays.toString(sehirler)); //[Istanbul, Konya, Kastamonu]


        //==== Array'deki tek elemanlari list'e atayalim ====

        List<Integer> liste = new ArrayList<>();

        for (int each : arr) {
            if (each % 2 == 1) {
                liste.add(each);
            }
        }
        System.out.println(liste); //[3, 5, 3, 5, 1, 9, 3, 5, 5]


    }

    private static int[] uniqueArrayOlustur(int[] arr) {
        Arrays.sort(arr);
        List<Integer> benzersizList = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                benzersizList.add(arr[i]);
            }
        }
        System.out.println(benzersizList);
        int[] tekrarsizArr = new int[benzersizList.size()];
        for (int i = 0; i < tekrarsizArr.length; i++) {
            tekrarsizArr[i] = benzersizList.get(i);
        }
        return tekrarsizArr; //[1, 2, 3, 4, 5, 6]

    }

}
