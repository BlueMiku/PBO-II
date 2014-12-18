package org.usd.pbo2.uts;
import org.usd.pbo2.model.KelasKuliah;
import org.usd.pbo2.model.Mahasiswa;

public class TestKelasKuliah {
    public static void main(String[] args) throws Exception {
        
        Mahasiswa mhs1 = new Mahasiswa("007", "James Bond", "MI6");
        Mahasiswa mhs2 = new Mahasiswa("006", "Wiro Sableng", "MI6");
        Mahasiswa mhs3 = new Mahasiswa("008", "Saras", "MI6");

        Mahasiswa.tambahMahasiswa(mhs1);
        Mahasiswa.tambahMahasiswa(mhs2);
        Mahasiswa.tambahMahasiswa(mhs3);

        KelasKuliah kelas1 = new KelasKuliah("PBO2_A", "gasal", "2014/2015");
        KelasKuliah kelas2 = new KelasKuliah("PBO2_B", "gasal", "2014/2015");

        kelas1.tambahMahasiwa(mhs1);
        kelas1.tambahMahasiwa(mhs2);

        kelas2.tambahMahasiwa(mhs1);
        kelas2.tambahMahasiwa(mhs3);

        KelasKuliah.tambahKelas(kelas1);
        KelasKuliah.tambahKelas(kelas2);

        // Tampilkan daftar nama mahasiswa per kelas
        for (int i = 0; i < KelasKuliah.DAFTAR_KELAS_KULIAH.size(); i++) {
            KelasKuliah kelasTemp = KelasKuliah.DAFTAR_KELAS_KULIAH.get(i);
            System.out.print("Kode Kelas :" + kelasTemp.getKodeKuliah());
            System.out.print(" semester :" + kelasTemp.getSemester());
            System.out.println(" tahun :" + kelasTemp.getTahunAkademik());
            for (int j = 0; j < kelasTemp.getDaftarMahasiswa().size(); j++) {
                System.out.print("NIM: " + kelasTemp.getDaftarPeserta().get(j).getNim());
                System.out.print(" Nama: " + kelasTemp.getDaftarPeserta().get(j).getNama());
                System.out.println(" Prodi: " + kelasTemp.getDaftarPeserta().get(j).getProdi());
            }
        } 
    }
}