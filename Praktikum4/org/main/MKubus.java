/* Nama File		: MKubus.java
   Tanggal Pembuatan: 15 Maret 2023
   Nama Praktikan   : Safril Isnaini
   NIM Praktikan	: 24060121130057
   Deskripsi		: modul main/utama dari program kelas kubus
 */
package org.main;

import org.bangundatar.BujurSangkar;
import org.bangunruang.*;
/**
 * MKubus
 */
public class MKubus {
    public static void main(String[] args) {
        BujurSangkar mas = new BujurSangkar(4.0);
        Kubus ngab = new Kubus(mas);
        System.out.println("Panjang sisi permukaan kubus adalah " + mas.getPanjangSisi());
        System.out.println("Luas alas kubus adalah "+ngab.hitungLuasAlas());
        System.out.println("Volume kubus adalah " + ngab.hitungVolume());
    }
    
}
