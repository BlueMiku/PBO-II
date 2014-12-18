/**
 *
 * @author Sekarinotan
 */
public class Nilai {
    private int UTS;
    private int UAS;
    Mahasiswa mahasiswa;

    public Nilai(int UTS, int UAS, Mahasiswa mahasiswa) {
        this.UTS = UTS;
        this.UAS = UAS;
        this.mahasiswa = mahasiswa;
    }
    
    public int getUTS() {
        return UTS;
    }

    public void setUTS(int UTS) {
        this.UTS = UTS;
    }

    public int getUAS() {
        return UAS;
    }

    public void setUAS(int UAS) {
        this.UAS = UAS;
    }

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }
}