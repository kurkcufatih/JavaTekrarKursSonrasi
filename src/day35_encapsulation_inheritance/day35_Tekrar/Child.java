package day35_encapsulation_inheritance.day35_Tekrar;

public class Child extends Parent {
    String isim = "Child isim belirtilmedi";
    protected String childKlupAdi = "Child Klubu";

    Child() {
        System.out.println("child constructor calisti");
    }

    public static void main(String[] args) {
        GrandParent grandParent = new GrandParent();
        Child child = new Child();
        child.grandpaKlupAdi = "Child1";
        child.parentKlupAdi = "Child2";

        //**Static methodlar veya variable'lar inherit edilemezler**
    }
}
