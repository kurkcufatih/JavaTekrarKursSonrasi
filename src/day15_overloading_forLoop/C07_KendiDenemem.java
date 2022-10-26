package day15_overloading_forLoop;

public class C07_KendiDenemem {
    //100'den bire kadar(sinirlar dahil)
    // 8 ile bolunebilen sayilari yazdirin
    public static void main(String[] args) {

        for (int i =100 ; i >1 ; i--) {
            if (i%8==0){
                System.out.print(i+" ");
            }
        }

    }
}
