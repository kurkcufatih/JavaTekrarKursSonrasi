package day10_stringManipulation;

import java.util.Locale;

public class C02_KendiCalismam {
    public static void main(String[] args) {
        String str="Beni psikopata baglamayin";
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase(Locale.forLanguageTag("TR")));
    }
}
