package day34_accessDeneme;

import day34_accessModifier_encapsulation.C01;

public class C01_BaskaPackage {

	public static void main(String[] args) {
		C01 obj=new C01();
		// System.out.println(obj.sayiPrivate);
		// System.out.println(obj.sayiDefault); // sadece ayni pacgace dakiler ulasabilir
		// System.out.println(obj.sayiProtected); // ayni package'daki class'lar ve child class'lar ulasabilir
		System.out.println(obj.sayiPublic);

		System.out.println(obj.sayiPublic); //Sadece sayiPublic geldi cunku public modifier olanlar tum paket ve class'lardan ulasilabilirler.
		/*
		private= sadece ayni class icerisinde ulasilabilir
		default= sadece ayni package icerisinde ulasilabilir
		protected=sadece ayni package ve child class'lardan ulasilabilir
		public= tum package ve class'lardan ulasilabilir.
		 */

	}

}
