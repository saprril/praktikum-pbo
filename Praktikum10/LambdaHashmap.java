/* Nama File		: LambdaHashmap.java
   Tanggal Pembuatan: 29 Mei 2023
   Nama Praktikan   : Safril Isnaini
   Laboratorium		: B1
   NIM Praktikan	: 24060121130057
   Deskripsi		: Program untuk menguji fungsi Lambda koleksi Hashmap
 */

import java.util.*;

public class LambdaHashmap {
    public static void main(String[] args) {

        // membuat program yang menampilkan key dan value dari sebuah Map
        Map<Integer, String> mapMhs = new HashMap<Integer, String>();
        mapMhs.put(1, "Ali");
        mapMhs.put(2, "Budi");
        mapMhs.put(3, "Cantika");
        Set<Integer> key = mapMhs.keySet();
        // operasi lambda forEach() dengan output metode get() dari Set kunci
        key.forEach((kunci) -> System.out.println("NIM: "+ kunci + " Nama: "+mapMhs.get(kunci)));
    }    
}
