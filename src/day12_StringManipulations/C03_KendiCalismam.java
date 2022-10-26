package day12_StringManipulations;

public class C03_KendiCalismam {
    public static void main(String[] args) {
        String isim="Suleyman";
        String soyisim="Karanfil";
        String kartNo="1234 6589 7458 9658";



        String isimIlkHarf=isim.substring(0,1);
        String soyisimIlkHarf=soyisim.substring(0,1);
        String kartNoIlkDortRakam=kartNo.substring(0,4);
        String kartnoSonRakamlar=" **** **** **** ";
        String isimdenGeriyeKalanlar= isim.substring(1).replaceAll("\\w","*");
        String soyisimdenGeriyeKalanlar= soyisim.substring(1).replaceAll("\\w", "*");

        System.out.println(isimIlkHarf + isimdenGeriyeKalanlar + " " +soyisimIlkHarf + soyisimdenGeriyeKalanlar  + "\n"
        + kartNoIlkDortRakam +kartnoSonRakamlar);
    }
}
