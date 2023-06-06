/* Nama File		: ExceptionOnArray.java
   Tanggal Pembuatan: 29 Maret 2023
   Nama Praktikan   : Safril Isnaini
   Laboratorium		: B1
   NIM Praktikan	: 24060121130057
   Deskripsi		: Program kelas Programmer (keturunan dari kelas Pegawai)
 */

public class Programmer extends Pegawai {
    int bonus = 450000;
    Programmer(String nama){
        this.nama = nama;
    }
    void tampilData() {
        System.out.println("Nama : " + this.nama + ", Gaji pokok : " + this.gajiPokok + "\nBonus : " + this.bonus);
    }
}
