/* Nama File		: MBujurSangkar.java
   Tanggal Pembuatan: 25 Maret 2023
   Nama Praktikan   : Safril Isnaini
   Laboratorium		: B1
   NIM Praktikan	: 24060121130057
   Deskripsi		: Kelas yang mengimplementasikan cara 
                      menghitung luas bujur sangkar
 */

import java.util.Scanner;

class MBujurSangkar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.print("Masukkan sisi bujur sangkar: ");
        double sisi = scan.nextDouble();
        System.out.println("Luas bujur sangkar dengan sisi " + sisi + " satuan adalah " + bs.hitungLuas(sisi));
    }
    
}
