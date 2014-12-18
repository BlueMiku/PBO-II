package testing;

import com.pkg135314076.model.Penduduk;

public class TestPenduduk {
    public static void main(String[] args) {
        Penduduk test = new Penduduk("Yosep","Denpasar","30 Desember");
        
        System.out.println("Nama : "+test.getNama());
        System.out.println("Tempat Lahir : "+test.getTempatLahir());
        System.out.println("TL : "+test.getTanggalLahir());
    }
}