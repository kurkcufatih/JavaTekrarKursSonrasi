package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class day39_Tekrar_Exceptions_TryCatch_FileInputStream {
    public static void main(String[] args) {
        int k;
        try {
            FileInputStream fis = new FileInputStream("src/day39_exceptions/test.txt");
            while ((k = fis.read()) != -1) {
                System.out.print((char) k);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Dosyadan bilgiler okunamadi");
        } catch (IOException e) {
            System.out.println("Dosya bulunamadi");
        }

        //sout sonucu

        /*
        Java'da 39. gundeyiz
        Biz Java'yi cok sevdik
        Umarim o da bizi sevmistir.
         */
        class Parent {
            @SuppressWarnings("unused")
            private void m1() {
                System.out.println("Parent class'da private access modifier");
            }

            protected void m2() {
                System.out.println("Parent class'da protected access modifier");
            }
        }

        class Child extends Parent {
            @SuppressWarnings("unused")
            private void m1() {
                System.out.println("Child class'da private access modifier");
            }

            public void m2() {
                System.out.println("Child class'da public access modifier");

            }
        }

        class Test {

            @SuppressWarnings("unused")
            public static void main(String[] args) {

                Parent obj1 = new Parent();
                //obj1.m1(); has private acccess, cannot be reachable
                Child obj2 = new Child();
                //obj2.m1;  has private acccess, cannot be reachable
            }

        }
    }
}
