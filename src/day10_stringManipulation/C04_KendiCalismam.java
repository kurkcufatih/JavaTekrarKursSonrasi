package day10_stringManipulation;

public class C04_KendiCalismam {
    public static void main(String[] args) {


        String str1 = "Ali Can";
        String str2 = "ali can";
        String str3 = "ALI CAN";
        String str4 = "Ali Can_";


        System.out.println(str1.equalsIgnoreCase(str2)); //true
        System.out.println(str1.equalsIgnoreCase(str4)); //false
        System.out.println(str1.equalsIgnoreCase(str3)); //true
        System.out.println(str2.equalsIgnoreCase(str3)); //true
        System.out.println(str3.equalsIgnoreCase(str4)); //false
    }
}