package testing;

import com.pkg135314076.model.Marketing;

public class TestMarketing {
        public static void main(String[] args) {
        Marketing test = new Marketing("Yosep","Denpasar","30 Desember","135314",2);
        
        System.out.println("Nama : "+test.getNama());
        System.out.println("Tempat Lahir : "+test.getTempatLahir());
        System.out.println("TL : "+test.getTanggalLahir());
        System.out.println("NIP : "+test.getNip());
        System.out.println("Golongan : "+test.getGolongan());
        System.out.println("Gaji : "+test.gaji());
    }
}