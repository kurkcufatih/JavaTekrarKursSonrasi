package GrupCalismalari;

public class SekilSorusu {
    public static void main(String[] args) {
        //1 den 10 C01_I kadar her satırda bir artırarak aşağıdaki şekli oluşturan Java kodunu yazınız.
      /*  1
        12
        123
        1234
        12345
        123456
        1234567
        12345678
        123456789
        12345678910
       */
        for (int i = 1; i <=10 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}

