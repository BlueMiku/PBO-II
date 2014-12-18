/**
 *
 * @author Sekarinotan
 */
public class Mahasiswa extends Penduduk {
    private String nim;

    public Mahasiswa(String nim, String nama, String tempatLahir, String tanggalLahir) {
        super(nama, tempatLahir, tanggalLahir);
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }    
    
    
}