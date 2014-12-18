/**
 *
 * @author Sekarinotan
 */
public class TestKelasPBO2 {
    public static void main(String[] args) {
        KelasPBO2 testK = new KelasPBO2();
            
        Mahasiswa test1 = new Mahasiswa("135314","Junaedi","Magelang","9 Desember");
        Mahasiswa test2 = new Mahasiswa("135314","JuJi","Magelang","hari ju-ji");
        
        Nilai nilai1 = new Nilai(10,10,test1);
        
        testK.tambahMhs(test1);
        testK.tambahMhs(test2);
        
        System.out.println(testK.rerataNilai(test1,nilai1));
        System.out.println(testK.getListMahasiswa().get(0).getNama());
        System.out.println(testK.getListMahasiswa().get(1).getNama());
    }
}
