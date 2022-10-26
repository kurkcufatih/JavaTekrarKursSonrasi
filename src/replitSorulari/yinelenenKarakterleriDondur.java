package replitSorulari;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class yinelenenKarakterleriDondur {
    public static void main(String[] args) {
        /* Bir String icerisinde yinelenen karakterleri döndüren bir kod yazıniz.(mülakat Sorusu)

        Input :

        String str=“Javaisalsoeasy”

        Output: C01_I s

         */
        String str = "Javaisalsoeasy";
        List<String> yinelenenKarakterler = new ArrayList<>();
        String arr[] = str.split("");
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].equals(arr[i + 1])) {
                yinelenenKarakterler.add(arr[i]);
            }
        }

        List<String> tekrarEdenler = new ArrayList<>();

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i].equals(arr[i + 1]) && !tekrarEdenler.contains(arr[i])){
                tekrarEdenler.add(arr[i]);
            }

        }

        System.out.print("Output: "+ tekrarEdenler.get(0));
        System.out.print(" "+ tekrarEdenler.get(1));
    }
}
