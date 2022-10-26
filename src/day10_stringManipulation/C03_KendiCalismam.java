package day10_stringManipulation;

public class C03_KendiCalismam {
    public static void main(String[] args) {
        String str1="Ali Can";
        String str2="Ali CAN";
        String str3="Ali Can" + "";
        String str4= "Ali Can";
        String str5=new String("Ali Can");

        System.out.println(str1.equals(str4)); //true
        System.out.println(str2.equals(str4)); //false
        System.out.println(str1.equals(str3)); //true
        System.out.println(str1==str3); //true
        System.out.println(str5==str3); //false
        System.out.println(str5.equals(str3)); //true
        System.out.println(str1.equals(str5)); //true
    }
}
