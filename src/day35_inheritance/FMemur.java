package day35_inheritance;

public class FMemur extends EMuhasebe {
   /*
   Extends keyword kullanilan classs'larda
   ister default constructor bulunsun
   istersekte yeni constructor(lar) olusturalim
   Java constructor'in ilk satirina super(); constructor call
   yazar.
   super() constructor call, default constructor'C01_I benzer gorunmese de
   orada vardir ve calisir. Ancak biz ilk satira farkli bir constructor
   call yazarsak Java super()'ini siler.

   extends keyword'u varsa super() constructor call vardir.

   Eger biz mudahale edip kendi constructor call'umuzu olusturmazssak
   Java'nin default olarak olusturdugu constructor call her zaman parametresizdir.
   Yani super constructor'dir.
    */

    FMemur() {
        System.out.println("FMemur parametresiz constructor");
    }

    FMemur(String isim) {
        System.out.println("FMemur parametreli constructor");
    }

    public static void main(String[] args) {
        FMemur mmr1=new FMemur();

    }
}
