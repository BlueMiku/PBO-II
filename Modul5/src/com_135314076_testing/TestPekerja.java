package com_135314076_testing;
import com_135314076_model.Pekerja;
public class TestPekerja {
        public static void main(String[] args) throws Exception {
        Pekerja test = new Pekerja("Arung","12-12-1995","Sleman","1234567891234567","12345678",2);
        
        System.out.println("Nama : "+test.getNama());
        System.out.println("Tempat Lahir : "+test.getTempatLahir());
        System.out.println("Tanggal Lahir : "+test.getTanggalLahir());
        System.out.println("NIP : "+test.getNip());
        System.out.println("Golongan : "+test.getGolongan());
        System.out.println("Gaji : "+test.gaji());
    }
}