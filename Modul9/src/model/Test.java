package model;

import java.io.FileNotFoundException;

public class Test {
    public static void main(String[] args) throws FileNotFoundException, Exception {
        Perusahaan test = new Perusahaan();
        
        Pekerja test1 = new Pekerja("Yosep","Denpasdar","30 December","135314076",1);
        Pekerja test2 = new Pekerja("Awan","Magelang","29 December","135314089",2);
        
        test.tambahPekerja(test1);
        test.tambahPekerja(test2);
        Perusahaan.simpanFilePekerja();
        Perusahaan.bacaFilePekerja();
         System.out.println("Nama    Alamat   Tanggal Lahir     NIP      Golongan");
        for (Pekerja listPekerja : Perusahaan.listPekerja) {
            System.out.println(listPekerja.getNama()+"  "+listPekerja.getAlamat()+"  "+listPekerja.getTanggalLahir()+"  "+listPekerja.getNim()+"          "+listPekerja.getGolongan());
    }
}
}