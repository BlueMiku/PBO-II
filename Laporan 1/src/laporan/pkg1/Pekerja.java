package laporan.pkg1;
public class Pekerja extends Penduduk{
 
    public static int UPAH_POKOK = 1000;
    private String nip;
    private int golongan ;
    
    public Pekerja() {
    }

    public Pekerja(String nama, String tempatLahir, String tanggalLahir, String nip, int golongan ) {
        super(nama, tempatLahir, tanggalLahir);
        this.nip = nip;
        this.golongan = golongan;
    }

    public Pekerja(String nip, int golongan) {
        this.nip = nip;
        this.golongan = golongan;
    }
    
    public int gaji()
    {
        return getGolongan()*getUPAH_POKOK();
    }

    public int getUPAH_POKOK() {
        return UPAH_POKOK;
    }

    public void setUPAH_POKOK(int UPAH_POKOK) {
        this.UPAH_POKOK = UPAH_POKOK;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public int getGolongan() {
        return golongan;
    }

    public void setGolongan(int golongan) {
        this.golongan = golongan;
    }

}
