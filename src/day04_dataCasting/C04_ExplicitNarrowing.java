package day04_dataCasting;

public class C04_ExplicitNarrowing {
    public static void main(String[] args) {
        int sayi1=50;
        byte sayi2= (byte)sayi1;
        System.out.println(sayi2);  //50
        //genis data turundeki degeri dar data turundeki veriable atamak isterseniz Java sizin genis data turundeki degeri dar turunun sinirlarina uyup uymayacagini calistirina kadar bilemez.
        //Java risk almaz, riski sifira indirmek icin burda bir sorun olursa, sorumlulugu kabul etmenizi bekler. Bunun icin degerin onune parantez icerisinde istedigimiz data turunu yazmamiz yeterlidir.
        //Explicit narrowing te bazi riskler var
        //1- bizim degerimiz dar kalip degerlerine uygujn olursa hic bir problem olmadan cast edilir.
        //2-double bir sayiyi integera cast etmek gibi durumda data kaybi yasayabiliriz, virgulden sonrasi kaybolur.
        //3-genis kaliptan degeri dar kaliba koydugunuzda, sinirlari asan durumlarda veri baskalasabilir.



    }
}
