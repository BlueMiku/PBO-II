import java.util.ArrayList;
/**
 *
 * @author Sekarinotan
 */
public class KelasPBO2 implements Pengajaran {
    private ArrayList<Mahasiswa> listMahasiswa = new ArrayList<Mahasiswa>();
    private ArrayList<Nilai>listNilai = new ArrayList<Nilai>();
    
    @Override
    public void tambahMhs(Mahasiswa mahasiswa){
        listMahasiswa.add(mahasiswa);
        
    }
    
    @Override
    public void hapusMhs(Mahasiswa mahasiswa){
        if(listMahasiswa.contains(mahasiswa)){
            listMahasiswa.remove(mahasiswa);
            System.out.println("Sudah Dihapus");
        }
        else
            System.out.println("Tidak ditemukan");
    }
    
    @Override
    public double rerataNilai(Mahasiswa mahasiswa, Nilai nilai){
        int rata = (nilai.getUTS() + nilai.getUAS())/2;
        return rata;
    }

    public ArrayList<Mahasiswa> getListMahasiswa() {
        return listMahasiswa;
    }

    public void setListMahasiswa(ArrayList<Mahasiswa> listMahasiswa) {
        this.listMahasiswa = listMahasiswa;
    }
    
    
}