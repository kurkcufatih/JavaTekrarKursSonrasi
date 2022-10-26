package day25_constructors;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_Constructors {
    public static void main(String[] args) {
        C01             obj1     =  new        C01();
        //class adi  objenin adi   keyword    constructor(Java da obje olusturmak icin kullandigimiz kod blogu'dur)
        System.out.println(obj1.sayi);//0
        obj1.deneme();//"C01 den deneme method calisir

        //Asagidakiler su ana kadar ogrendigimiz
        //constructors'lar (kod bloklari)

        Scanner scan=new Scanner(System.in);
        Random rnd= new Random();
        List<String> list=new ArrayList<>();
        //List<String> list2=new List<>();

    /*
    Java'da bir obje olusturmak istiyorsak mutlaka
    constructor kullanmamiz gerekir. Bir objeden
    bahsediyorsak contructors calisacak, calismazsa
    obje olusturamayiz.
    Constructor method'da degildir. Variable da degildir.
    Suana kadar ogrendiklerimizden farklidir
    Constructor constructor'dir.
    Constructordan ne istersek bize onu uretir, tarif vermezsek
    elinde ne varsa onu getirir.
     */

    }
}
