package com_135314076_testing;
import com_135314076_model.Penduduk;
public class TestPenduduk {
    public static void main(String[] args) throws Exception {
        Penduduk test = new Penduduk("Arung","Sleman","12-12-1995","1353140761234567");
        
        System.out.println("Nama : "+test.getNama());
        System.out.println("Tempat Lahir : "+test.getTempatLahir());
        System.out.println("Tanggal Lahir : "+test.getTanggalLahir());
        System.out.println("No KTP : "+test.getNoKtp());
    }
}