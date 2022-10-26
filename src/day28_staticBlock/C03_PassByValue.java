package day28_staticBlock;

public class C03_PassByValue {
    public static void main(String[] args) {
       /*
        %25 indirimli fiyati hesaplayip bize donduren bir method olusturun
         */

        double satisFiyati=100;
        double indirimOrani=25;


        double indirimliFiyat=indirimliFiyatHesapla(satisFiyati,indirimOrani);
        System.out.println("indirimli fiyat:" + indirimliFiyat);
        System.out.println("indirimli fiyat:" + indirimliFiyat);
        System.out.println("indirimli fiyat:" + indirimliFiyat);
        System.out.println("indirimli fiyat:" + indirimliFiyat);

    }

    public static double indirimliFiyatHesapla(double satisFiyati, double indirimOrani) { // yukarıdaki satisfiyati burada declare edilmis, yukarısı ile burası aynı variable değildir.
        // iste bu farklı satis fiyatlari icin java pass by value kullanıyor.
        //java variable ı buraya gecirmez, ama variable ın değerini gecirir, biz gözlerimizle satisFiyati görürüz ama java burada 100 görür.
        //yani satisFiyatinin bir kopyasını gecirir diyebiliriz.
        //bundan sonra bu scope ta kullanacağımız değisiklikler benim main body mde yazan değerimi değil buradaki değeri kullanir.
        //buradaki satisFiyatinin adını xyz de yapabilirsin hangi isim oldugu hic bir önemi yok,
        //farkli methodlara gidis yapıyor olsak bile aynı isimleri kullanırız ki karısıklık olmasın. tek amac budur
        // ne yazarsanız yazın java sizin satisFiyati parametresi olustururken bunun değirini buraya gecirir
        //ve siz arka arkaya isterseniz 5 kere indirim yapın her seferinde indirimliFiyat 75 yazar.

        double indirimliFiyat=satisFiyati*(1-indirimOrani/100);
        return indirimliFiyat;

        //Java pass by value'dur. Java bizim orjinal datamizi degil, kopyasini gonderir, bunun uzerinden islem yapilir
        //boylelikle benim orjinal datam bozulmamis olur.
    }
}
