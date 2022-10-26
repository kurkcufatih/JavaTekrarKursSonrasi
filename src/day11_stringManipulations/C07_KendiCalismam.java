package day11_stringManipulations;

public class C07_KendiCalismam {
    public static void main(String[] args) {
        String input= "Java gun gectikce guzellesiyor";

        System.out.println(input.startsWith("J")); //true
        System.out.println(input.startsWith("")); //true
        System.out.println(input.startsWith("gec", 9)); //true
    }
}
