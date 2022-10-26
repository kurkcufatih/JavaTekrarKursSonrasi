package day30_immutableDate;

import java.time.LocalDate;
import java.time.Period;

public class C07_Period {
    public static void main(String[] args) {
        //Iki tarih arasindaki sureyi bulma
        LocalDate tarih1= LocalDate.of(1994, 6,15);
        LocalDate bugun=LocalDate.now();

        Period period=Period.between(tarih1,bugun);
        System.out.println(period); //P-28Y-1M-8D
        System.out.println(period.getYears()); //28

    }
}
