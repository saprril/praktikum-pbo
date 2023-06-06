/* Nama File		: PolimorfismeCoercion.java
   Tanggal Pembuatan: 3 Mei 2023
   Nama Praktikan   : Safril Isnaini
   Laboratorium		: B1
   NIM Praktikan	: 24060121130057
   Deskripsi		: Program penggunaan Polimorfisme ad-hoc Coercion
 */

public class PolimorfismeCoercion{
    public static int kuadrat(int bilangan){
        return bilangan * bilangan;
    }

    public static void main(String[] args) {
        //deklarasi objek integer
        Integer bilangan = 10;
        
        // objek integer 'dipaksa' untuk diubah
        // menjadi primitif
        int hasilKuadrat = kuadrat(bilangan);

        System.out.printf("Hasil kuadrat %d adalah %d", bilangan, hasilKuadrat);
        
    }
}
