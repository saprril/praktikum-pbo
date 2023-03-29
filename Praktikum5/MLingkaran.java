/* Nama File		: MLingkaran.java
   Tanggal Pembuatan: 25 Maret 2023
   Nama Praktikan   : Safril Isnaini
   Laboratorium		: B1
   NIM Praktikan	: 24060121130057
   Deskripsi		: Implementasi cara menghitung luas lingkaran
 */

import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran(10.2);
        System.out.println("Luas lingkaran dengan jejari 10.2 satuan adalah " + l.hitungLuas());


        //TODO: Buatlah MLingkaran sedemikian hingga dapat menerima input jejari dari pengguna !
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jejari lingkaran : ");
        double jari = scan.nextDouble();
        Lingkaran l2 = new Lingkaran(jari);
        System.out.println("Luas lingkaran dengan jejari "+ jari + " satuan adalah " + l2.hitungLuas());
    }    
}
