package day30_immutableDate;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Locale;

public class C03_Date {
    public static void main(String[] args) {
        LocalDate tarih = LocalDate.now();
        System.out.println(tarih); //2022-07-23
        System.out.println(tarih.getDayOfYear());
        System.out.println(tarih.getDayOfWeek());
        System.out.println(tarih.getMonthValue());
        System.out.println(tarih.isLeapYear()); //false //bu sene artik yil mi degil mi bize verir


        LocalDate tarih2 = LocalDate.of(1994, 6, 15);
        System.out.println(tarih2); //1994-06-15
        LocalDate tarih3 = LocalDate.of(1990, Month.JUNE, 15);
        System.out.println(tarih3); //1990-06-15

        System.out.println(tarih.plusDays(100)); //2022-10-31
        System.out.println(tarih.plusYears(5).plusMonths(3).plusDays(12)); //2027-11-04
        System.out.println(tarih.minusWeeks(20)); //2022-03-05
        System.out.println(tarih.minusDays(100).minusMonths(5)); //2021-11-14
        System.out.println(tarih.isAfter(tarih2)); //true

        LocalDate kursBaslangic = LocalDate.of(2022, 05, 28);
        LocalDate suan = LocalDate.now();
        Period diff = Period.between(suan, kursBaslangic);
        System.out.println("aradaki fark : " +diff);


//Iki farkli dogum gunu girildiginde
// hangisinde doganin daha buyuk oldugunu bulunuz
// tarih2 ve tarih3 icin yapalim

        if (tarih2.isAfter(tarih3)) {
            System.out.println(tarih3 + " tarihinde dogan daha buyuk");
        } else if (tarih2.isBefore(tarih3)) {
            System.out.println(tarih2 + " tarihinde dogan daha buyuk");
        } else {
            System.out.println("iki tarih birbiri ile ayni");
//1990-06-15 tarihinde dogan daha buyuk


        }
    }
}
