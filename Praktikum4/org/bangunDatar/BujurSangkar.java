/* Nama File		: BujurSangkar.java
   Tanggal Pembuatan: 15 Maret 2023
   Nama Praktikan   : Safril Isnaini
   NIM Praktikan	: 24060121130057
   Deskripsi		: modul kelas Bujur Sangkar dari program tugas praktikum ke-4
 */

package org.bangundatar;

import org.poligon.Poligon;

public class BujurSangkar extends Poligon{
    protected double panjangSisi;

    public BujurSangkar(double panjangSisi){
        this.panjangSisi = panjangSisi;
    }

    public double hitungLuas(){
        return panjangSisi * panjangSisi;
    }

    public double getPanjangSisi(){
        return panjangSisi;
    }


} 
