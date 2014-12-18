package testing;

import com.pkg135314076.model.Pekerja;

public class TestPekerja {
        public static void main(String[] args) {
        Pekerja test = new Pekerja("Yosep","Denpasar","30 Desember","135314",2);
        
        System.out.println("Nama : "+test.getNama());
        System.out.println("Tempat Lahir : "+test.getTempatLahir());
        System.out.println("TL : "+test.getTanggalLahir());
        System.out.println("NIP : "+test.getNip());
        System.out.println("Golongan : "+test.getGolongan());
        System.out.println("Gaji : "+test.gaji());
    }
}