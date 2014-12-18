/**
 *
 * @author Sekarinotan
 */
public class TesPenduduk {
    public static void main(String[] args) {
        Penduduk testP = new Penduduk("Junaedi","Magelang","9 Desember");
        
        System.out.println(testP.getNama());
        System.out.println(testP.getTempatLahir());
        System.out.println(testP.getTanggalLahir());
    }
}
