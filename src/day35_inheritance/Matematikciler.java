package day35_inheritance;

public class Matematikciler extends LOgretmen{
    Matematikciler(){
        System.out.println("MAtematik parametresiz constructor");
    }
    Matematikciler(String isim){
        this();
        System.out.println("MAtematik parametreli constructor");
    }
}
