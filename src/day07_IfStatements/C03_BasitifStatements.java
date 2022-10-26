package day07_IfStatements;

public class C03_BasitifStatements {
    public static void main(String[] args) {
        int sayi = 23;
       //bir if statementta { kullanilmazsa Java ilk satiri sart ile baglar, sonraki satirlar bagimsiz olur.
        if (sayi>0)
            System.out.println("sayi pozitif"); // degere bagli
            System.out.println("pozitif kalacaktir"); // her zaman calisir
        System.out.println("Ucuncu satir"); // her zaman calisir

        if (sayi%2==0)
            System.out.println("sayi cift"); // degere bagli
            System.out.println("cif kalacaktir"); // her zaman calisir
            if (sayi%5==0)
            System.out.println("sayi 5'in tam kati"); // degere bagli
            // { kullanmaz ise sadece ilk satir calisir diger satirlar aynsi gibi cikar. Yani birinci soutlara bakar digerlerine bakmaz, direk sonucu verir.
        //Eger birden fazla satir if sartina baglanmis ise mutlaka suslu parantez kullanmaliyiz.
    }
}