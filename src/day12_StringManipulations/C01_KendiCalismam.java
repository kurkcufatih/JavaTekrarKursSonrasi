package day12_StringManipulations;

public class C01_KendiCalismam {
    public static void main(String[] args) {
        String str=" Bu gun ha va cok gu zel ";
        System.out.print(str.replace("Bu gun", "Bugun").replace("ha va", "hava")
                        .replace("cok", "cok").replace("gu zel", "guzel"));

    }
}
