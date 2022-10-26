package day35_inheritance;

public class    GToyota {

    GToyota(){
        System.out.println("Toyota parametresiz constructor");
    }
    GToyota(String isim){
       //super(isim); extends olmadigi icin super constructor call'u Java kabul etmez.
        System.out.println("Toyota parametreli constructor");
    }

}
