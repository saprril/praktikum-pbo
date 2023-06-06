/* Nama File		: Pegawai.java
   Tanggal Pembuatan: 29 Maret 2023
   Nama Praktikan   : Safril Isnaini
   Laboratorium		: B1
   NIM Praktikan	: 24060121130057
   Deskripsi		: Program kelas Pegawai
 */
public class Pegawai {
    String nama;
    int gajiPokok = 5000000;
    void setNama(String nama){
        this.nama = nama;
    }
    void tampilData(){
        System.out.println("Nama :" + this.nama);
    }
}
