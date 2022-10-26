package day14_MethodCreation;

import static day14_MethodCreation.C01_MethodCreation.terstenYazdir;

public class C01_KendiCalismam {
    public static void main(String[] args) {
       terstenYaz("Okan");
    }

    private static void terstenYaz(String okan) {
        String terstenYaz=okan.substring(3)+
        okan.substring(2,3) + okan.substring(1,2) + okan.substring(0,1);
        System.out.println(terstenYaz);
    }
}
