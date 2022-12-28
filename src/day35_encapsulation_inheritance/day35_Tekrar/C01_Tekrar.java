package day35_encapsulation_inheritance.day35_Tekrar;

public class C01_Tekrar {
    private double not;
    private boolean gecerMi = false;

    public void setNot(double not) {
        this.not = not;
    }

    public boolean isGecerMi() {
        if (not<50){
            gecerMi=false;
        }else gecerMi=true;
        return gecerMi;
    }
}
