package GrupCalismalari;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ArtikYIL {
    public static void main(String[] args) {
        for (int i = 2016; i <= 2016; i++) {
            for (int j = 1; j <= 1; j++) {
                Calendar takvim = new GregorianCalendar(i, j, 2); //Ocak=0
                System.out.println(new SimpleDateFormat("MMMM").format(takvim.getTime()) + " " + i + " " + takvim.getActualMaximum(Calendar.DAY_OF_MONTH)+ " Gundur");
            }
        }
    }
}

