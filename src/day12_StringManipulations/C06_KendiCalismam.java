package day12_StringManipulations;

public class C06_KendiCalismam {
    public static void main(String[] args) {
        String input= "Kaya";
        String tersInput=input.substring(3)+
                input.substring(2,3)+
                input.substring(1,2)+
                input.substring(0,1);
        System.out.println(tersInput);
    }
}
