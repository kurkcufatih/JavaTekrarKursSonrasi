package day30_immutableClasses;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class day30_Tekrar_Immutable_Date_LocalTime {
    public static void main(String[] args) {

        //==== Immutable string ====

        String str = "Ali";
        System.out.println("str.toUpperCase() = " + str.toUpperCase());  //ALI
        System.out.println(str); //Ali

        List<String> isimler = new ArrayList<>();
        isimler.add("Ali");
        System.out.println(isimler); //[Ali]
        isimler.set(0, "Veli");
        System.out.println(isimler); //[Veli]
        isimler.remove(0);
        System.out.println("isimler = " + isimler); //[]

        //==== LocalDate methodu ====

        LocalDate tarih = LocalDate.now();
        System.out.println(tarih); //2022-12-25

        System.out.println(tarih.getDayOfWeek()); //SUNDAY
        System.out.println(tarih.getDayOfMonth()); //25
        System.out.println(tarih.getDayOfYear()); //359
        System.out.println(tarih.getMonthValue()); //12

        System.out.println(tarih.isLeapYear()); //false //artik yil degil
        /*
        Artık yıl, Miladî takvimde (Gregoryen takvim)
        365 yerine 366 günü olan yıl. Bu fazladan gün (artık gün),
        normalde 28 gün olan Şubat ayına 29 Şubat'ın eklenmesi
        ile elde edilir. Dört yılda bir artik yil gerceklesir.
         */

        System.out.println(tarih.lengthOfMonth()); //31
        System.out.println(tarih.lengthOfYear()); //365

        LocalDate tarih2 = LocalDate.of(2022, Month.MAY, 28);
        System.out.println(tarih2);
        System.out.println(tarih2.minusDays(100));
        System.out.println(tarih2.plusYears(30));
        System.out.println(tarih2.minusWeeks(2));
        System.out.println(tarih.isAfter(tarih2));

        Period fark = Period.between(tarih, tarih2);
        System.out.println("Kursun suresi : " + fark); // 6M-28D
        //6 Ay 28 Gun


        LocalDate yil1 = LocalDate.of(1994, 6, 15);
        LocalDate yil2 = LocalDate.of(1995, 5, 20);
        if (yil2.isAfter(yil1)) {
            System.out.println(yil1 + " tarihinde dogan kisi " + yil2 + " tarihinde dogan kisiden daha buyuktur.");
        } else if (yil1.isAfter(yil2)) {
            System.out.println(yil2 + " tarihinde dogan kisi " + yil1 + " tarihinde dogan kisiden daha buyuktur.");
        } else {
            System.out.println("Iki kisi de yasittir");
        }

        //1994-06-15 tarihinde dogan kisi 1995-05-20 tarihinde dogan kisiden daha buyuktur.

        //==== LocalTime methodu ====

        LocalTime time = LocalTime.now();
        System.out.println(time); //13:07:22.920901800

        System.out.println(time.getHour()); //13
        System.out.println(time.getSecond()); //22
        System.out.println(time.getMinute()); //7
        System.out.println(time.withHour(3)); //03:07:22.920901800 saati 3 yapti.

        //==== String mi StringBuilder mi daha hizli?

         /*
        String mi yoksa StringBuilder mi daha hizlidir.
        Bunun icin bir String olusturup 1000 defa sonuna nokta
        ekleyelim. Oncesinde ve sonrasinda zamani alip aradaki
        bulalim.

        Ayni islemi StringBuilder icin de yapalim.
         */
        LocalTime baslangic = LocalTime.now();

        StringBuilder str2 = new StringBuilder("Ahhhh Java");
        for (int i = 0; i < 10000; i++) {
            str2.append(".");

        }
        LocalTime bitis = LocalTime.now();
        System.out.println(baslangic);
        System.out.println(bitis);

        System.out.println("String zaman : " + (bitis.getNano() - baslangic.getNano())); //String zaman : 8995500

        //Stringte sonuc :  36980300
        //StringBuilderda sonuc: 4996400

        //String daha hizli cikti

        //==== LocalDateTime methodu ====

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime); //2022-12-25T13:12:30.644798300

        System.out.println(localDateTime.toLocalDate()); //2022-12-25
        //sadece tarih kismini verdi
        System.out.println(localDateTime.toLocalTime()); //13:13:57.707262
        //sadece zaman kismini verdi


        //==== DateTimeFormatter methodu ====

        LocalDateTime tarihSaat = LocalDateTime.now();
        System.out.println(tarihSaat); //2022-12-25T13:21:25.292872100

        DateTimeFormatter duzenle = DateTimeFormatter.ofPattern("dd/MM/YYYY EEEE h:mm a");
        System.out.println(duzenle.format(tarihSaat)); //25/12/2022 Sunday 1:23 pm

    }
}
