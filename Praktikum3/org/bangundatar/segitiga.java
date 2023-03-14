/* Nama File		: segitiga.java
   Tanggal Pembuatan: 22 Februari 2023
   Nama Praktikan   : Safril Isnaini
   NIM Praktikan	: 24060121130057
   Laboratorium		: B1
   Deskripsi		: modul program kelas Segitiga
 */
package org.bangundatar;

import org.poligon.Poligon;

public class segitiga extends Poligon{
	private double alas, tinggi;
	
	public segitiga(double alas, double tinggi, int jumlahSisi){
		this.alas = alas;
		this.tinggi = tinggi;
		this.jumlahSisi = jumlahSisi;
	}
	
	public double hitungLuas(){
		return tinggi * alas * 0.5;
	}
	
	public void printInfo(){
		System.out.println("Bangun Segitiga bersisi " +this.getJumlahSisi());
	}
}