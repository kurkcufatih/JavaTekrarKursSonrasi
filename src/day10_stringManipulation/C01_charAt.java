package day10_stringManipulation;

public class C01_charAt {
    public static void main(String[] args) {
        String str="Java ogrenmek ne guzel";
        System.out.println(str.charAt(0)); //ilk harfi yazdirir = J
        System.out.println(str.toUpperCase().charAt(7)); // R
        System.out.println(str.charAt(21)); // L
        //System.out.println(str.charAt(22)); // StringIndexOutOfBoundsException
        //Son harfi bulmak icin str'nin uzunlugunun bir eksigini gireriz.
        //Eger index olarak uzunlugu veya daha buyuk bir sayiyi girersek Java exception verir.


        //charAt() kullandigimizda sonuc char olacagi icin artik manipulation yapamayiz
        // String methodlarından kullanmamiz gereken bir method varsa
        // charAt() 'den önce kullanmaliyiz

    }
}
