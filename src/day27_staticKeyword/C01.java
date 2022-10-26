package day27_staticKeyword;

public class C01 {
    static int sayi = 10;
    int rakam = 5;

    public static void main(String[] args) {
        /*
       Class level'da iki tur variable olusturabiliriz
        -Static(class) variable
        -intance(obje) variable

        static variable'lar tum class'tan kullanilabilirken
        instance variable'lar static olmayan method'lardan
        kullanilabilir.

        Instance variable'lara static method'dan ulasmak istersek
        obje olusturmamiz gerekir.

        Instance variable'lar obje variable oldugu icin herhangi bir satirda
        instance variable'in degerinin ne oldugunu bulmak icin
        OBJE OLUSTURULAN SATIRDAN itibaren kod incelenmelidir

        Static variable'lar class variable oldugu icin her hangi bir
        satirda static variable'in degerini bulmak icin
        CLASS'IN BASINDAN itibaren kod incelenmelidir.

        INSTANCCE OBJEDE BASLAR OBJEDE BITER STATICSE CLASDA BASLAR CLASDA BITER
         */
        C01 obj1 = new C01();
        System.out.println("obj1'in rakam degeri: " + obj1.rakam); //5
        System.out.println("obj1'in sayi degeri: " + sayi); //10

        obj1.rakam += 1; //5+1=6
        //instance oldugu icin direk gelmez obj1. eklemek zorundayiz
        sayi += 1; //10+1=11
        //static oldugu icin direk gelir

        System.out.println("obj1'in rakam degeri: " + obj1.rakam); //6
        System.out.println("obj1'in sayi degeri: " + sayi); //11

        C01 obj2=new C01();
        System.out.println("obj2'in rakam degeri: " + obj2.rakam); //5
        System.out.println("obj2'in sayi degeri: " + obj2.sayi); //11

        obj2.rakam++;
        obj2.sayi++;

        System.out.println("artirdiktan sonra obj2'in rakam degeri: " + obj2.rakam); //6
        System.out.println("artirdiktan sonra obj2'in sayi degeri: " + obj2.sayi); //12

    }
}
