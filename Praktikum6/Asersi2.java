/* Nama File		: Asersi2.java
   Tanggal Pembuatan: 29 Maret 2023
   Nama Praktikan   : Safril Isnaini
   Laboratorium		: B1
   NIM Praktikan	: 24060121130057
   Deskripsi		: Program untuk menunjukkan asersi yang akan menolak input jari-jari lingkaran yang bernilai nol
 */
//class lingkaran 
/* Secara konsep, asersi dalam program ini kurang tepat. Apabila jariJari dimasukkan sebagai bilangan negatif, 
 * asersi akan ter-trigger, sehingga pesan error adalah "Jari-jari tidak boleh nol", padahal jari-jari memang 
 * tidak nol. Untuk itu, pesan error seharusnya diubah agar sesuai dengan realita. 
 */

class Lingkaran{
    private double jariJari;
    public Lingkaran(double jarijari){
        this.jariJari = jarijari;
    }

    public double hitungKeliling(){
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}
public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert(jariJari > 0): "Jari-jari tidak boleh no1 !!!!"; //Pesan error seharusnya "Jari-jari harus bilangan positif !!!"
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling lingkaran = " + kelilingLingkaran);
    }
}
