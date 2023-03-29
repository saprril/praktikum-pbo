/* Nama File		: BangunDatar.java
   Tanggal Pembuatan: 25 Maret 2023
   Nama Praktikan   : Safril Isnaini
   Laboratorium		: B1
   NIM Praktikan	: 24060121130057
   Deskripsi		: Kelas abstrak, berisi abstraksi bangun datar
 */

public abstract class BangunDatar {
    protected double luas;

    public abstract double hitungLuas(double sisi);

    public void setLuas(double l){
        luas = l;
    }

    public double getLuas(){
        return luas;
    }
}
