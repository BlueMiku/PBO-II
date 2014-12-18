/**
 *
 * @author Sekarinotan
 */
public class TestNilai {
    public static void main(String[] args) {
    
        Mahasiswa testM = new Mahasiswa("135314","Junaedi","Magelang","9 Desember");
        
        Nilai testN = new Nilai(10,10,testM);
        
        System.out.println(testN.mahasiswa.getNama());
        System.out.println(testN.mahasiswa.getTempatLahir());
        System.out.println(testN.mahasiswa.getTanggalLahir());
        System.out.println(testN.mahasiswa.getNim());
        System.out.println(testN.getUTS());
        System.out.println(testN.getUAS());
    }
}
