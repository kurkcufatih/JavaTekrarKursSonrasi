package day31_timeFormatter_varargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_TimeFormatter {
    public static void main(String[] args) {
        LocalDateTime tarihSaat=LocalDateTime.now();
        System.out.println("ilk olusturulan tarih: " +tarihSaat);

        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/M/yy hh:mm");
        System.out.println(dtf.format(tarihSaat)); // 25/7/22 08:46

        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("dd/MMM/yyyy HH:mm");
        System.out.println(dtf2.format(tarihSaat)); // 25/Jul/2022 20:48

        DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm C01_I");
        System.out.println(dtf3.format(tarihSaat)); // 25/07/2022 20:49 pm

    }
}
