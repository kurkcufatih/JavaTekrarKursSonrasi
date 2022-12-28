package day33_encapsulation.day33_Tekrar;

public class OgretmenRunner {
    public static void main(String[] args) {


        Ogretmen ogretmen = new Ogretmen();
        ogretmen.setIsim("Fatih");
        System.out.println(ogretmen.getIsim()); //Fatih

        ogretmen.setSoyisim("Kurkcu");
        System.out.println(ogretmen.getSoyisim()); //Kurkcu

        ogretmen.setBrans("Cografya");
        System.out.println(ogretmen.getBrans()); //Cografya
    }
}