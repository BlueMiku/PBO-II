
package perusahaan; 
public class Pegawai{
	private int nip;
	private String nama;
	private double gajiPokok;
	private int jamLembur;
	private int jumlahAnak;
	private double honorLembur=10;

	public Pegawai(){
	}

	public Pegawai(int nip, String nama){
		this.nip=nip;
		this.nama=nama;
	}

	public Pegawai(double gajiPokok, int jamLembur, int jumlahAnak){
		this.gajiPokok=gajiPokok;
		this.jamLembur=jamLembur;
		this.jumlahAnak=jumlahAnak;
	}

	public double tunjangan(){
		return 0.1*getjAnak()*getgPokok();
	}

	public double gajiLembur(){
		return getjLembur()*gethLembur();
	}

	public  double gajiTotal(){
		return getgPokok()+tunjangan()+gajiLembur();
	}

	public double gethLembur(){
		return honorLembur;
	}

	public void setjLembur(int jamLembur){
		this.jamLembur=jamLembur;
	}
	public int getjLembur(){
		return jamLembur;
	}

	public void setNip(int nip){
		this.nip=nip;
	}
	public int getNip(){
		return nip;
	}

	public void setjAnak(int jumlahAnak){
		this.jumlahAnak=jumlahAnak;
	}
	public int getjAnak(){
		return jumlahAnak;
	}

	public void setNama(String nama){
		this.nama=nama;
	}
	public String getNama(){
		return nama;
	}

	public void setgPokok(double gajiPokok){
		this.gajiPokok=gajiPokok;
	}
	public double getgPokok(){
		return gajiPokok;
	}
}