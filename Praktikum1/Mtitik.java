/* Nama File		: Mtitik.java
   Tanggal Pembuatan: 22 Februari 2023
   Nama Praktikan   : Safril Isnaini
   NIM Praktikan	: 24060121130057
   Laboratorium		: B1
   Deskripsi		: modul main/utama dari program kelas titik
 */


class Mtitik{
	public static void main(String[] args){
		
		// Instantiasi titik tanpa parameter
		Titik t1 = new Titik();
		t1.setAbsis(1.0);
		t1.setOrdinat(2.0);
		
		Titik t2 = new Titik();
		t2.setAbsis(3.0);
		t2.setOrdinat(4.0);
		
		// Instantiasi titik dengan parameter
		Titik t3 = new Titik(5, 6);
		
		int counterTitik = t1.getCounterTitik();
		
		System.out.println("Jumlah objek titik " + counterTitik);
		System.out.println("t1 ( " + t1.getAbsis() + " , " + t1.getOrdinat() + " )");
		System.out.println("t2 ( " + t2.getAbsis() + " , " + t2.getOrdinat() + " )");
		System.out.println("t3 ( " + t3.getAbsis() + " , " + t3.getOrdinat() + " )");
	}
}