package day29_passByValue_immutable;

public class C04_Immutable {
    public static void main(String[] args) {

    /*
    immutable: degistirilemez
    mutable: degistirilebilir

    en meshur immutable class : String
     */

        //Biz bir bankada calisiyor olalim, yildiz bank olsun. Bu yildiz bankin
        //bir suru subesi var ve biz de dolar satiyoruz, diyelimki dolarin degeri 17.40 olsun
        //Bankadaki memurlara soyle diyoruz, surekli musteri ise 10 kurus indirim yapma izni veriyorum.
        //A subesindeki kisi 10 kurus indirimle 17.30'C01_I doviz aliyor, ayni anda b subesindeki biri C01_I subesine bakip 17.20 uzerinden
        //satis yapsa, ... yildiz bank sizlere omur

    /*
    Bir seyde degisiklik yapacaksak kopya deger uzerinden yapmaliyiz, orjinel degerden degil.
    Yani musteri hep 17.40$ olarak gormeli.
     */

        String str = "Yildiz Bank";
        System.out.println(str.toUpperCase());

        str.toLowerCase(); //bu satiri yazdirinca kucultur
        //ustteki satiri gecince artik orjinaline doner.
        //Gecici olarak bir kopya olusturduk kullanirsak kullaniriz
        //kullanmazsak cope gider.

        System.out.println(str);
        str.substring(3, 5);//di sout olmadigi icin yazdirmaz
        //Istedigimiz kadar degisiklik yaparsak yapalim onlari hep kopyalara koyar
        //Orjinali degistirmez cunku String immutable'dir.

        //Java'da String gibi metin ifadelerde kullanabilecegimiz
        //mutable StringBuilder class'i da vardir.


        StringBuilder sb = new StringBuilder("Java Bank");
        System.out.println(sb);
        sb.reverse();
        System.out.println("sb = " + sb); //sb = knaB avaJ

        sb.append(".");
        System.out.println(sb);

        for (int i = sb.length()-1; i >0 ; i--) {
        }
        System.out.println(sb);

        //Immutable class'lar degismiyor.
        //Mutable'lar degisiyor.

        //***String immutable***
        //***StringBuilder mutable***
    }
}

