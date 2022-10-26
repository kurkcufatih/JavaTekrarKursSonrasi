package day35_inheritance;

public class LOgretmen {
    LOgretmen(){
        System.out.println("LOgretmen parametresiz constructor");
    }
    LOgretmen(String isim){
        this();
        System.out.println("LOgretmen parametreli constructor");
    }

    public static void main(String[] args) {
        Matematikciler obj1=new Matematikciler("Tugba");

    }
}
