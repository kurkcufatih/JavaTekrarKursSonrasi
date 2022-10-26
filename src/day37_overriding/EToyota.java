package day37_overriding;


    public class EToyota extends DAraba {

        @Override
        void marka() {
            //super.marka();
            //Eger hem overridden hem de verriding method'un calismasini istersek
            //ilk satira super.marka() yazabiliriz. ilk satira yazmak zorunda degiliz
            // ilk yonlendirdigi class'daki ozellikleri alsin diye ilk satira ekliyoruz.
        }

        void motor(){
            System.out.println("Toyota araclar Toyota marka motor kullanir");
        }
    }

