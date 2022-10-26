package lamda_functional_programming1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class KendiDenemem05 {
    public static void main(String[] args) {
        Courses courseTurkishDay = new Courses("Summer", "Turkish Day", 97, 128);
        Courses courseTurkishNight = new Courses("Winter", "Turkish Night", 98, 154);
        Courses courseEnglishDay = new Courses("Spring", "English Day", 95, 132);
        Courses courseEnglishNight = new Courses("Winter", "English Night", 93, 144);
        List<Courses> coursesList = new ArrayList<>();
        coursesList.add(courseTurkishDay);
        coursesList.add(courseTurkishNight);
        coursesList.add(courseEnglishDay);
        coursesList.add(courseEnglishNight);

        System.out.println("verilenSayiOrtalamadanBuyukMu(75) = " + verilenSayiOrtalamadanBuyukMu(coursesList, 75));
        System.out.println("kelimeyiIceriyorMu : " + kelimeyiIceriyorMu(coursesList, "Turkish"));
        System.out.println("enYuksekPuan(coursesList) = " + enYuksekPuan(coursesList));
        System.out.println("ortalamaPuanaGoreSirala(coursesList) = " + ortalamaPuanaGoreSirala(coursesList, 1));
    }

    //1)Tüm ortalama puanların verilen sayıdan büyük olup olmadığını kontrol etmek için bir method oluşturun.
    public static boolean verilenSayiOrtalamadanBuyukMu(List<Courses> list, double x) {
        return list.stream().allMatch(t -> t.getAverageScore() > x);
        //verilenSayiOrtalamadanBuyukMu(75) = true
    }

    //2)Kurs adlarından en az birinin verilen kelimeyi içerip içermediğini kontrol etmek için bir method oluşturun
    public static boolean kelimeyiIceriyorMu(List<Courses> list, String str) {
        return list.stream().anyMatch(t -> t.getCourseName().contains(str));
        //kelimeyiIceriyorMu : true
    }

    //3) Ortalama puanı en yüksek olan kursu yazdırmak için bir yöntem oluşturun
    public static String enYuksekPuan(List<Courses> list) {
        return list.stream().sorted(Comparator.comparing(Courses::getAverageScore).reversed()).findFirst().get().getCourseName();
        //enYuksekPuan(coursesList) = Turkish Night

    }
    //4) Liste öğelerini artan düzende ortalama puana göre sıralayın ve ilk verilenleri atlayın
public static List<Courses> ortalamaPuanaGoreSirala(List<Courses>list, int x){
        return list.stream().sorted(Comparator.comparing(Courses::getAverageScore)).skip(x).collect(Collectors.toList());
//ortalamaPuanaGoreSirala(coursesList) = [Course: Season=Spring, courseName=English Day, averageScore=95, numberOfStudents=132, Course: Season=Summer, courseName=Turkish Day, averageScore=97, numberOfStudents=128, Course: Season=Winter, courseName=Turkish Night, averageScore=98, numberOfStudents=154]
    }
}

