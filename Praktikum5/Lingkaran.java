/* Nama File		: Lingkaran.java
   Tanggal Pembuatan: 25 Maret 2023
   Nama Praktikan   : Safril Isnaini
   Laboratorium		: B1
   NIM Praktikan	: 24060121130057
   Deskripsi		: kelas implementasi IArea berupa cara
                      menghitung luas lingkaran
 */


import static java.lang.Math.PI;

class Lingkaran implements IArea{
    private double jejari;
    public Lingkaran(double r){
        jejari = r;
    }

    public double hitungLuas(){
        return PI*jejari*jejari;
    }
}
