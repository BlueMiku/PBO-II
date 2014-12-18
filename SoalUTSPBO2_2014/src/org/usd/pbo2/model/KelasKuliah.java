package org.usd.pbo2.model;
import java.util.ArrayList;

public class KelasKuliah {
    private String kodeKuliah;
    private String semester;
    private String tahunAkademik;
    ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<Mahasiswa>();
    public static ArrayList<Mahasiswa> daftarPeserta = new ArrayList<Mahasiswa>();
    public static ArrayList<KelasKuliah> DAFTAR_KELAS_KULIAH = new ArrayList<KelasKuliah>();
    
    public KelasKuliah(String kodeKuliah, String semester, String tahunAkademik) {
        this.kodeKuliah = kodeKuliah;
        this.semester = semester;
        this.tahunAkademik = tahunAkademik;
    }

    public KelasKuliah() {
    }

    public static ArrayList<KelasKuliah> getDAFTAR_KELAS_KULIAH() {
        return DAFTAR_KELAS_KULIAH;
    }

    public static void setDAFTAR_KELAS_KULIAH(ArrayList<KelasKuliah> DAFTAR_KELAS_KULIAH) {
        KelasKuliah.DAFTAR_KELAS_KULIAH = DAFTAR_KELAS_KULIAH;
    }

    public ArrayList<Mahasiswa> getDaftarPeserta() {
        return daftarPeserta;
    }

    public void setDaftarPeserta(ArrayList<Mahasiswa> daftarPeserta) {
        this.daftarPeserta = daftarPeserta;
    }
    
    public ArrayList<Mahasiswa> getDaftarMahasiswa() {
        return daftarMahasiswa;
    }
    

    public void setDaftarMahasiswa(ArrayList<Mahasiswa> daftarMahasiswa) {
        this.daftarMahasiswa = daftarMahasiswa;
    }

    public String getKodeKuliah() {
        return kodeKuliah;
    }

    public void setKodeKuliah(String kodeKuliah) throws Exception {
        String pola="[a-zA-Z0-9-]*";
        if (kodeKuliah.matches(pola))
            this.kodeKuliah = kodeKuliah;
        else{
            throw new Exception("Terdapat kesalahan dalam pengisian kode kuliah");
        }  
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getTahunAkademik() {
        return tahunAkademik;
    }

    public void setTahunAkademik(String tahunAkademik) {
        this.tahunAkademik = tahunAkademik;
    }
    
    public void tambahMahasiwa(Mahasiswa mahasiswa){
        daftarMahasiswa.add(mahasiswa);
        daftarPeserta.add(mahasiswa);
    }
    
    public void tambahPeserta(Mahasiswa mahasiswa){
        daftarPeserta.add(mahasiswa);
    }
    
    public static void tambahKelas(KelasKuliah kelas){
        DAFTAR_KELAS_KULIAH.add(kelas);
    }
}