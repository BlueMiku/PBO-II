package laporan.pkg1;
public class Perusahaan {

    private Pekerja daftarPekerja[] = new Pekerja[10];
    private int jumlahPekerja;

    public Perusahaan() {
    }
    
      public void tammbahPekerja(Pekerja pekerja)
    {
      daftarPekerja[jumlahPekerja] = pekerja;
      jumlahPekerja++;
    }

    
    public int getJumlahPekerja() {
        return jumlahPekerja;
    }

    public void setJumlahPekerja(int jumlahPekerja) {
        this.jumlahPekerja = jumlahPekerja;
    }
}
