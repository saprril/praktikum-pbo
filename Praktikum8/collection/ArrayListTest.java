/* Nama File		: ArrayListTest.java
   Tanggal Pembuatan: 10 Mei 2023
   Nama Praktikan   : Safril Isnaini
   Laboratorium		: B1
   NIM Praktikan	: 24060121130057
   Deskripsi		: Program untuk mengetes koleksi kelas ArrayList
 */

import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {
        // inisialisasi ArrayList yang hanya dapat
        // berisi objek String
        ArrayList<String> strings = new ArrayList<String>();
        // menambah elemen
        strings.add("praktikum");
        strings.add("collection");
        strings.add("dan generics");
        // menghapus elemen
        strings.remove("praktikum");
        // iterasi pada keseluruhan ArrayList
        for (String s : strings) {
            System.out.println(s + " ");
        }
    }
}
