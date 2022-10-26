package day15_overloading_forLoop;

public class C03_KendiDenemem {
    public static void main(String[] args) {
        topla(5, 7); //12
        topla(5.2,3); //8.2 double integer calisir
        topla(3.4,6.1); //9.5 double double calisir
    }

    private static void topla(double v, double v1) {
        double topla=(v+v1);
        System.out.println("toplami: " + (v+v1));
    }

    private static void topla(double v, int i1) {
        double topla=(v+i1);
        System.out.println("toplami :" + (v+i1));
    }

    public static void topla(int i, int i1) {
        int topla=(i+i1);
        System.out.println("toplami :" + (i+i1));


    }
}
