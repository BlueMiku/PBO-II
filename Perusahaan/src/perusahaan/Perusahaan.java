package perusahaan;
public class Perusahaan {
	private String kodePerusahaan;
	private String namaPerusahaan;
	private Pegawai ketuaPerusahaan;

	public Perusahaan(){
	}

	public Perusahaan(String kodePerusahaan){
		this.kodePerusahaan=kodePerusahaan;
	}

	public void setkPerusahaan(Pegawai ketuaPerusahaan){
		this.ketuaPerusahaan=ketuaPerusahaan;
	}
	public Pegawai getkPerusahaan(){
		return ketuaPerusahaan;
	}

	public void setKode(String kodePerusahaan){
		this.kodePerusahaan=kodePerusahaan;
	}
	public String getKode(){
		return kodePerusahaan;
	}

	public void setnPerusahaan(String namaPerusahaan){
		this.namaPerusahaan=namaPerusahaan;
	}
	public String getnPerusahaan(){
		return namaPerusahaan;
	}
}