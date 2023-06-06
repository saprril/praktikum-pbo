/* Nama File		: MapTest.java
   Tanggal Pembuatan: 10 Mei 2023
   Nama Praktikan   : Safril Isnaini
   Laboratorium		: B1
   NIM Praktikan	: 24060121130057
   Deskripsi		: Program untuk menguji koleksi MapTest
 */

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        // kunci -> integer, nilai -> string
        Map<Integer, String> map = new HashMap<Integer, String>();
        // menemoatkan elemen kunci dan nilai
        map.put(1, "satu");
        map.put(2, "dua");
        // mengambil elemen pertama
        System.out.println(map.get(1));
        // mengambil keseluruhan kunci sebagai objek collection set
        Set<Integer> key = map.keySet();
        // bagaimana itersi untuk mengambil keseluruhan
        // nilai dari kunci ? tulis pada laporan anada!
        // petunjuk : gunakan iterasi seperti program ArrayListTest

        // solusi: dapat digunakan metode get() di dalam iterasi foreach dengan 
        // parameter sebuah set yang berisi Key dalam HashMap
        for (Integer i : key) {
            System.out.println(map.get(i) + " ");
        }
    }
}
