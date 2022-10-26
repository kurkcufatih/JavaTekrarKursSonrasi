package day30_immutableDate;

import java.time.LocalTime;

public class C04_LocalTime {
    public static void main(String[] args) throws InterruptedException {
        LocalTime time1 = LocalTime.now();
        System.out.println(time1); //18:12:27.225333700

        Thread.sleep(3000);
        System.out.println(time1);
        /*
        Bizim olusturdugumuz date ve time
        canli saat veya tarih degildir
        LocalTime.now() kullandigimiz satirda
        o anki tarih veya saati alip bizim variable'imiza
        depolar. time1 variable'inin degeri SABITTIR.
         */
        time1=LocalTime.now();
        System.out.println(time1); //18:17:33.102692500

        System.out.println(time1.getSecond()); //43

        System.out.println(time1.plusSeconds(10000)); //21:18:23.582473200

        System.out.println(time1.minusMinutes(200)); //15:13:50.872320100

        System.out.println(time1.withHour(3)); //03:35:54.752246600 //saati 3 yaparak yazdirdi.


    }
}
