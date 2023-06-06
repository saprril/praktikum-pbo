/* Nama File		: Manajer.java
   Tanggal Pembuatan: 3 Mei 2023
   Nama Praktikan   : Safril Isnaini
   Laboratorium		: B1
   NIM Praktikan	: 24060121130057
   Deskripsi		: Program kelas Manajer (keturunan dari Pegawai)
 */

public class Manajer extends Pegawai {
    int tunjangan = 700000;
    Manajer(String nama){
        this.nama = nama;
    }
    void tampilData(){
        System.out.println("Nama : " + this.nama + ", Gaji pokok : "  + this.gajiPokok + "\nTunjangan : " + this.tunjangan);
    }
}
