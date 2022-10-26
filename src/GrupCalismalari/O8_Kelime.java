package GrupCalismalari;

public class O8_Kelime {
    public static void main(String[] args) {
String input="Mehmet";
terstenYaz(input);

    }

    private static void terstenYaz(String input) {
        String terstenInput = " ";
        for (int i = 0; i < input.length(); i++){
            terstenInput += input.substring(input.length() - 1 - i, input.length() - i);
    }
        System.out.println(terstenInput);
    }
}
