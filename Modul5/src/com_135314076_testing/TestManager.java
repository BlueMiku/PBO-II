package com_135314076_testing;
import com_135314076_model.Manager;
public class TestManager {
        public static void main(String[] args) {
        Manager test = new Manager("Arung","Sleman","12 Mei","007",1,3);
        
        System.out.println("Nama : "+test.getNama());
        System.out.println("Tempat Lahir  : "+test.getTempatLahir());
        System.out.println("Tanggal Lahir : "+test.getTanggalLahir());
        System.out.println("NIP : "+test.getNip());
        System.out.println("Golongan : "+test.getGolongan());
        System.out.println("Eselon : "+test.getEselon());
        System.out.println("Gaji : "+test.gaji());
    }
}