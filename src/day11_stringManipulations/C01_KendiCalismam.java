package day11_stringManipulations;

public class C01_KendiCalismam {
    public static void main(String[] args) {
        String str= "Java ogrenmek cok guzel";
        // yukaridaki str'da 2. ve 3. e'nin indexlerini bulun
        // 2.ci e'yi bulabilmek icin 1.e'nin index'ine ihtiyacim var

        int ilke=str.indexOf("e");
        int ikincie=str.indexOf("e",ilke+1);
        int ucuncue=str.indexOf("e",ikincie+1);
        System.out.println(ilke); //8
        System.out.println(ikincie); //11
        System.out.println(ucuncue); //21
    }
}
