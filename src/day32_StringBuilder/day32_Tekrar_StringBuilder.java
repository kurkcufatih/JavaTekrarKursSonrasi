package day32_StringBuilder;

public class day32_Tekrar_StringBuilder {
    public static void main(String[] args) {

        //==== StringBuilder olusturma cesitleri ====

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Java Candir");
        StringBuilder sb3 = new StringBuilder(10);
        System.out.println(sb1.length()); // 0
        System.out.println(sb1.capacity()); // 16
        System.out.println(sb2.length()); // 11
        System.out.println(sb2.capacity()); // 27
        System.out.println(sb3.length()); // 0
        System.out.println(sb3.capacity()); // 10
        sb1.append("Java");
        System.out.println(sb1.length()); // 4
        System.out.println(sb1.capacity()); // 16
        sb1.append(" Candir");
        System.out.println(sb1.length()); // 11
        System.out.println(sb1.capacity()); // 16
        sb1.append(", bilen bilir.");
        System.out.println(sb1.length()); // 25
        System.out.println(sb1.capacity()); // 34 (16 *2 +2)
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Java Candir");
        System.out.println(sb4.length()); // 11
        System.out.println(sb4.capacity()); // 16

        System.out.println("===============");

        StringBuilder sb5 = new StringBuilder();
        System.out.println(sb5.length()); //0
        System.out.println(sb5.capacity()); //16

        sb5.append("Java");
        System.out.println(sb5.length()); //4
        System.out.println(sb5.capacity()); //16

        sb5.append(" Candir, Gerisi Heyecan");
        System.out.println(sb5.length()); //27
        System.out.println(sb5.capacity()); //34

        //==== append() ve insert() methodu ====

        StringBuilder str = new StringBuilder();
        str.append("Java daha ne yapsin?");
        str.insert(4, " her seyi dusunmus,");
        System.out.println(str); //Java her seyi dusunmus, daha ne yapsin?


        //==== reverse() methodu ====

        StringBuilder str2 = new StringBuilder("Java candir");
        System.out.println(str2.reverse()); //ridnac avaJ

        //==== subsequence() methodu ====

        StringBuilder str3 = new StringBuilder("Kayra");
        System.out.println(str3.substring(0, 3)); //Kay

        // Bu method String dondurdugu icin
        // StringBuilder'in eski halini degistiremez
        System.out.println(str3); //Kayra

        System.out.println(str3.subSequence(0, 3)); //Kay
        System.out.println(str3); //Kayra


        //==== indexOf() ve lastIndexOf() methodlari ====

        StringBuilder sb = new StringBuilder("Pay attention please");
        System.out.println(sb.indexOf("Pay")); //0
        System.out.println(sb); // Pay attention please
        System.out.println(sb.indexOf("e")); // 7
        System.out.println(sb.indexOf("e", 10)); // 16
        System.out.println(sb.lastIndexOf("e")); // 19
        System.out.println(sb.lastIndexOf("e", 10)); // 7


        //==== replace() methodu ====

        sb.replace(4, 13, "the bill");
        System.out.println(sb); //Pay the bill please

        //==== delete() methodu ====

        sb.delete(0, 3);
        System.out.println(sb); //the bill please

        sb.deleteCharAt(2);
        System.out.println(sb); //te bill please
        //index'e gore degil length'e gore sayarak sildi

        //==== equals() methodu ====
        StringBuilder kelime = new StringBuilder("Java");
        StringBuilder kelime2 = new StringBuilder("Java");
        String kelime3 = "Java";
        System.out.println(kelime.equals(kelime2)); // false
        System.out.println(kelime.equals(kelime)); // true
        // StringBuilder'da equals method'u ancak ayni obje olursa true doner
        // String'deki gibi dusunmemek lazim
        System.out.println(kelime.equals(kelime3)); //false

        //==== compareTo() methodu ====

        System.out.println(kelime.compareTo(kelime2)); //0
        StringBuilder kelime4 = new StringBuilder("Jave");
        StringBuilder kelime5=new StringBuilder("Javo");
        System.out.println(kelime.compareTo(kelime4)); //-4
        System.out.println(kelime.compareTo(kelime5)); //-14
        /*
         compareTo() iki stringBuilder'i bastan baslayarak
         harf harf karsilastirir
         ilk harfler ayni ise, ikincilere gecer
         ikinciler ayni ise 3.lere gecer ve
         ilk farkli olan harfe kadar gider
         farkli olan iki harfin ascii kodlari arasindaki farki verir
         eger hic farkli harf yoksa
         sonuc olarak 0 dondurur
         */

    }
}
