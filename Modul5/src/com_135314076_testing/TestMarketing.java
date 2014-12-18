package com_135314076_testing;
import com_135314076_model.Marketing;
public class TestMarketing {
        public static void main(String[] args) {
        Marketing test = new Marketing("Arung","Sleman","12 Mei","007",2);
        
        System.out.println("Nama : "+test.getNama());
        System.out.println("Tempat Lahir : "+test.getTempatLahir());
        System.out.println("Tanggal Lahir : "+test.getTanggalLahir());
        System.out.println("NIP : "+test.getNip());
        System.out.println("Golongan : "+test.getGolongan());
        System.out.println("Gaji : "+test.gaji());
    }
}