package replitSorulari;

public class sayiyiTersineCevir {
    /*Kullanıcının girdiği sayıyı tersine çeviren bir java programı yazınız. (Mulakat Sorusu)

    Input :1238

    Output :Girilen Numananin Tersi: 8321

     */

    public static void main(String[] args) {
        String input = "1238";
        String tersten = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            tersten += input.charAt(i);
        }
        System.out.print("Girilen Numaranin Tersi: " +tersten);
    }

}

