package lamda_functional_programming1;

public class KendiCalismam_Utils {

    public static void ayniSatirdaBosluklaYazdir(Object obj) {
        System.out.print(obj + " ");
    }

    public static boolean ciftElemanlariYazdir(int x) {
        return x % 2 == 0;
    }

    public static boolean tekElemanlariYazdir(int x) {
        return x % 2 == 1;
    }

    public static int kareleriniAl(int x) {
        return x * x;
    }

    public static int kupleriniAl(int x) {
        return x * x * x;
    }

    public static int elemanlarinYarisi(int x) {
        return x / 2;
    }

    public static char sonElaman(String str) {
        return str.charAt(str.length() - 1);
    }

    public static char ilkEleman(String str) {
        return str.charAt(0);

    }
    public static int rakamlarToplaminiAl(int x) {
        int toplam=0;
        while (x > 0) {
            toplam+=x%10;
            x/=10;
        }
        return toplam;
    }
}


