/* Nama File		: Kubus.java
   Tanggal Pembuatan: 15 Maret 2023
   Nama Praktikan   : Safril Isnaini
   NIM Praktikan	: 24060121130057
   Deskripsi		: modul main/utama dari program kelas titik
 */

package org.bangunruang;

import org.bangundatar.BujurSangkar;

public class Kubus {
    protected BujurSangkar permukaan;

    public Kubus(BujurSangkar permukaan){
        this.permukaan = permukaan;
    }
    
    public double hitungVolume(){
        return permukaan.getPanjangSisi() * permukaan.getPanjangSisi() * permukaan.getPanjangSisi();
    }

    public double hitungLuasAlas(){
        return permukaan.hitungLuas();
    }
}
