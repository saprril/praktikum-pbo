/* Nama File		: AngkaSial.java
   Tanggal Pembuatan: 29 Maret 2023
   Nama Praktikan   : Safril Isnaini
   Laboratorium		: B1
   NIM Praktikan	: 24060121130057
   Deskripsi		: Program penggunaan exception buatan sendiri pengenalan klausa 'throe' dan 'throws'
 */

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka==13){
            throw new AngkaSialException();
        }
        System.out.print(angka + " bukan angka sial\n"); /*baris ke 14 (12 pada lembar soal) dalam program dijalankan 
        sekali pada bagian cobaAngka(10). Try tidak mendeteksi eksepsi AngkaSialException pada parameter 10*/ 
    } 
    
    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12); 
        } catch (AngkaSialException ase) { /*  baris ke 23 dalam kode ini akan dijalankan setelah 
            cobaAngka(13) dieksekusi di dalam program. Catch akan menangkap eksepsi ase yang berupa 
            kelas AngkaSialException yang telah terdefinisi*/
            // method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati - hati memasukkan angka !!!");
        }
    }
}

 
