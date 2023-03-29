/* Nama File		: Asersi1.java
   Tanggal Pembuatan: 29 Maret 2023
   Nama Praktikan   : Safril Isnaini
   Laboratorium		: B1
   NIM Praktikan	: 24060121130057
   Deskripsi		: Program untuk menunjukkan asersi
 */

public class Asersi1 {
    public static void main(String[] args) {
        int x = 0;
        if(x>0){
            System.out.println("x bilangan positif");
        }
        else{
            assert(x < 0): "Ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}
