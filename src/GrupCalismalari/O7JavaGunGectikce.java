package GrupCalismalari;

public class O7JavaGunGectikce {
    public static void main(String[] args) {
        String input="Java gun gectikce guzellesiyor";
        terstenYazdirmak(input);
    }

    private static void terstenYazdirmak(String input) {
        String tersInput=input.substring(input.length()-1);
for (int i=input.length()-2; i>=0 ; i--){
    tersInput+=input.substring(i,i+1);
} System.out.println(tersInput);

    }
}
