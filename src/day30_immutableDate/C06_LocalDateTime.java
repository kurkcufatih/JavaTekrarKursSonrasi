package day30_immutableDate;

import java.time.LocalDateTime;

public class C06_LocalDateTime {
    public static void main(String[] args) {
        LocalDateTime tarihSaat = LocalDateTime.now();
        System.out.println(tarihSaat); //2022-07-23T18:40:29.364773
        System.out.println(tarihSaat.plusMonths(3).plusHours(100)); //2022-10-27T22:42:23.613646100
        System.out.println(tarihSaat.minusDays(100).plusHours(100)); //2022-04-18T22:43:14.325956300
        System.out.println(tarihSaat.toLocalDate()); //2022-07-23

    }
}
