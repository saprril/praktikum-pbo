/* Nama File		: Titik.java
   Tanggal Pembuatan: 22 Februari 2023
   Nama Praktikan   : Safril Isnaini
   NIM Praktikan	: 24060121130057
   Laboratorium		: B1
   Deskripsi		: modul program kelas titik
 */

class Titik{
	private static int counterTitik;
	private double absis;
	private double ordinat;
	
	Titik(){
		absis = 0;
		ordinat = 0;
		counterTitik = counterTitik + 1;
	}
	
	Titik( double a, double b){
		absis = a;
		ordinat = b;
		counterTitik = counterTitik + 1;
	}
	
	public void setAbsis(double a){
		absis = a;
	}
	
	public void setOrdinat(double a){
		ordinat = a;
	}
	
	public int getCounterTitik(){
		return counterTitik;
	}
	
	public double getAbsis(){
		return absis;
	}
	
	public double getOrdinat(){
		return ordinat;
	}
}