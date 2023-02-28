/* Nama File		: Titik.java
   Tanggal Pembuatan: 22 Februari 2023
   Nama Praktikan   : Safril Isnaini
   NIM Praktikan	: 24060121130057
   Laboratorium		: B1
   Deskripsi		: modul program kelas titik
 */

class Titik{
	static int counterTitik;
	double absis;
	double ordinat;
	
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
	
	void setAbsis(double a){
		absis = a;
	}
	
	void setOrdinat(double a){
		ordinat = a;
	}
	
	int getCounterTitik(){
		return counterTitik;
	}
	
	double getAbsis(){
		return absis;
	}
	
	double getOrdinat(){
		return ordinat;
	}
}
