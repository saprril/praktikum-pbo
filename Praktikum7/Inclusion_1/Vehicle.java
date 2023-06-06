/* Nama File		: Vehicle.java
   Tanggal Pembuatan: 3 Mei 2023
   Nama Praktikan   : Safril Isnaini
   Laboratorium		: B1
   NIM Praktikan	: 24060121130057
   Deskripsi		: Program kelas Vehicle
 */


public class Vehicle {
    void calRent(int distance, float price){
        float fare = distance * price;
        System.out.println("Vehicle price: " + fare);
    }
}
