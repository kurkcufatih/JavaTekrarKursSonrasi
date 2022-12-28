package day04_IncrementDecrement;

public class C07_PreDecrementPostDecrement {

	public static void main(String[] args) {
		//PREDECREMENT and POSTDECREMENT
		int sayi=10;
		sayi--;
		System.out.println(sayi); // 9

		int a=sayi--;
		System.out.println(a); //9
		System.out.println(sayi);//8
		System.out.println(--a); //8

		System.out.println("===========");

		int sayi2=10;
		System.out.println(sayi2); //10
		int b=--sayi2;
		System.out.println(sayi2); //9
		System.out.println(b); //9
		System.out.println(--b); //8
	}

}
