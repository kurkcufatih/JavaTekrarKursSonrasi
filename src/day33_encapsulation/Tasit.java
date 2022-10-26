package day33_encapsulation;

public class Tasit {

    private String tasitTuru;
    private boolean muayenesiVarMi;
    private int yil;

    public String getTasitTuru() {
        return tasitTuru;
    }
    /*getter method'uda tek satirlik islem yapiyor o da; baska class'larin
    private oldugu icin erisemedigi tasit turu bilgisini class icinden alip
    istenen farkli class'lara return ediyor.
     */

    public void setTasitTuru(String tasitTuru) {
        this.tasitTuru = tasitTuru;
    }

    public boolean isMuayenesiVarMi() {
        return muayenesiVarMi;
    }

    public void setMuayenesiVarMi(boolean muayenesiVarMi) {
        this.muayenesiVarMi = muayenesiVarMi;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }
}
