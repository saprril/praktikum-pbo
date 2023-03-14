/* Nama File		: MPoligon.java
   Tanggal Pembuatan: 22 Februari 2023
   Nama Praktikan   : Safril Isnaini
   NIM Praktikan	: 24060121130057
   Laboratorium		: B1
   Deskripsi		: modul program main kelas Poligon
 */


package org.main;

import org.bangundatar.*;


public class MPoligon{
	public static void main(String[] args){
		/*
		PersegiPanjang persegi = new PersegiPanjang(10, 10, 4);
		persegi.printInfo();
		System.out.println("Luas Persegi Panjang :" +persegi.hitungLuas());
		*/
		
		segitiga triangle = new segitiga(10, 10, 3);
		triangle.printInfo();
		System.out.println("Luas Segitiga :" +triangle.hitungLuas());
	}
}
