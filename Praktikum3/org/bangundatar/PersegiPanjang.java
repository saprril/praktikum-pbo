/* Nama File		: PersegiPanjang.java
   Tanggal Pembuatan: 14 Maret 2023
   Nama Praktikan   : Safril Isnaini
   NIM Praktikan	: 24060121130057
   Laboratorium		: B1
   Deskripsi		: modul program kelas persegi panjang
 */

package org.bangundatar;

import org.poligon.Poligon;

public class PersegiPanjang extends Poligon{
	private double panjang, lebar;
	
	public PersegiPanjang(double panjang, double lebar, int jumlahSisi){
		this.panjang = panjang;
		this.lebar = lebar;
		this.jumlahSisi = jumlahSisi;
	}
	
	public double hitungLuas(){
		return panjang * lebar;
	}
	
	public void printInfo(){
		System.out.println("Bangun Persegi Panjang bersisi " +this.getJumlahSisi());
	}
}
