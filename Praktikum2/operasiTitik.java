/* Nama File		: operasiTitik.java
   Tanggal Pembuatan	: 22 Februari 2023
   Nama Praktikan   	: Safril Isnaini
   NIM Praktikan	: 24060121130057
   Deskripsi		: modul kelas program operasiTitik
 */
class OperasiTitik{
	private void refleksiSumbuX(Titik titik){
		double ordinat = titik.getOrdinat();
		ordinat = ordinat * -1;
		titik.setOrdinat(ordinat);
	}
	
	private void refleksiSumbuY(Titik titik){
		double absis = titik.getAbsis();
		absis = absis * -1;
		titik.setAbsis(absis);
	}
	
	public Titik refleksiX(Titik t){
		refleksiSumbuX(t);
		return t;
	}
	
	public Titik refleksiY(Titik t){
		refleksiSumbuX(t);
		return t;
	}
}
