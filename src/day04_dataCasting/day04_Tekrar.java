package day04_dataCasting;

public class day04_Tekrar {
    public static void main(String[] args) {

        char harf = 'a';
        char yeniHarf = (char) (harf + 1);
        System.out.println(yeniHarf); //b

        int sayi1 = (int) 7.3;
        System.out.println(sayi1); //7

        double sayi2 = 10;
        System.out.println(sayi2); //10.0

        int sayi3 = 'c';
        System.out.println(sayi3); //99

        char harf2 = 98;
        System.out.println(harf2); //b

        //Java casting yaparken data turlerinden hangisi daha kapsamli ise
        // o data turune otomatik olarak cevirir.

        int say1 = 23;
        int say2 = 5;
        System.out.println(say1 / say2); //4

        double say3 = 5;
        System.out.println(say1 / say3); //4.6

        int sayii1 = 300;

        short sayii2 = (short) sayii1;
        // esitligin sagi ile solundaki veri turleri farkli oldugundan java mismatch hatasi verir
        // hatayi gidermek icin buyuk data turundeki deger'in onune manule onayimizi gosteren
        // (short) yazilir

        System.out.println("sayii2 : " + sayii2);

        byte sayii3 = (byte) sayi2;

        System.out.println("sayi3 : " + sayii3);
        // deger byte'in sinirlarindan buyuk oldugu icin java int 300'u kendi yontemine gore
        // byte'a donusturur ve bu arada bizim datamiz DEGISIR

        double sayi4 = 87.9;

        int sayi5 = (int) sayi4;

        System.out.println("sayi5 : " + sayi5);

        // deger virgullu oildugundan ve int'da ondalikli kisim olmadigindan java ondalikli kismi keser
        // dolayisiyla data kaybi olusur


        int sayi6 = 27;
        int sayi7 = 4;


        System.out.println(sayi6 / sayi7); // bolme islemi yapilan iki sayi da int oldugu icin
        // java sonucu int olarak yazar

        double sayi8 = 4;
        double sayi9 = 17;

        System.out.println(sayi6 / sayi8); //6,75 islem yapilan sayilardan daha genis data turune sahip olan
        // double oldugundan sonucu double olarak yazdirir

        System.out.println(sayi9 / sayi7); //4.25

        /*
        	// atama islemi olursa sayinin degeri kalici olarak degisir
		// atama islemi olmadan yapilan toplama, cikarma vs islemler sadece o satirda yapilir
		// sayinin degerini kalici olarak degistirmez

		int sayi1=10;

		System.out.println(sayi1+=5);//15
		// bu islem sayi1'in degerini 5 artirip sayi1'e assign ediyor
		// dolayisiyla sayi1'in degeri kalici olarak degisiyor

		System.out.println(sayi1);//15


		System.out.println(sayi1+12); // 27

		System.out.println(sayi1);// 15

		sayi1++;
		// her ne kadar = isareti gorunmese de sayi1++ isleminde assign vardir
		// dolayisyla deger kalici olarak degisir

		System.out.println(sayi1); //16
         */
        /*
        // preIncrement ve post increment sadece sayi++ veya sayi-- yazimi icin gecerlidir
		int sayi=10;

		sayi++;
		sayi++;
		sayi++;

		System.out.println(sayi); // 13


		System.out.println(sayi++); // 13  bu satirda iki islem var
									// bir artirma , bir de yazdirma
		System.out.println(sayi); // 14

		// once artirmak sonra yazdirmak isterseniz ++sayi
		// once yazdirmak sonra artirmak isterseniz sayi++

		System.out.println(++sayi); // 15
         */
    }
}
