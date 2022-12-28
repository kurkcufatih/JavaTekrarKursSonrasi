package day46_collections.day46_Tekrar;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class C02_Maps_TekrarSayisiniBulma {
    public static void main(String[] args) {
        // Verilen bir String'deki kullanilan harfleri
        // ve kullanilan harflerin tekrar sayisini
        // H = 20 seklinde yazdirin
        String str = "Heeeeellllooooo Woooorrrrllllllddddd.";

        // space'leri saymamasi icin once onlari yok edelim
        str = str.replaceAll("\\W", "");
        String[] harflerArr = str.split("");
        System.out.println(Arrays.toString(harflerArr));
        //[H, e, e, e, e, e, l, l, l, l, o, o, o, o, o, W, o, o, o, o, r, r, r, r, l, l, l, l, l, l, d, d, d, d, d]

        Map<String, Integer> harfKullanimSayilarMap = new TreeMap<>();
        Integer harfKullanimSayisi;
        for (String each : harflerArr) {
            if (!harfKullanimSayilarMap.containsKey(each)) {
                harfKullanimSayilarMap.put(each, 1);
            } else {
                harfKullanimSayisi = harfKullanimSayilarMap.get(each);
                harfKullanimSayilarMap.put(each,++harfKullanimSayisi);
            }
        }
        System.out.println(harfKullanimSayilarMap);
        //{H=1, W=1, d=5, e=5, l=10, o=9, r=4}


    }
}
