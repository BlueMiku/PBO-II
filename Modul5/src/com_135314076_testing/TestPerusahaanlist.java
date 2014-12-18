package com_135314076_testing;
import com_135314076_model.Pekerja;
import com_135314076_model.PerusahaanList;
public class TestPerusahaanlist {
    public static void main(String[] args) {
        PerusahaanList test = new PerusahaanList();
    
        Pekerja test1 = new Pekerja("Arung","Sleman","12 Mei","007",2);
        Pekerja test2 = new Pekerja("Arjuna","Bantul","08 Agustus","008",2);
    
        test.tambahPekerja(test1);
        test.tambahPekerja(test2);
        
        for (int i = 0; i < test.getListPekerja().size(); i++) {
            System.out.println("Nama : "+test.getListPekerja().get(i).getNama());
            System.out.println("NIP : "+test.getListPekerja().get(i).getNip());
            System.out.println("Gaji : "+test.getListPekerja().get(i).gaji());
        }
            System.out.println("Gaji Total : "+test.gajiTotal());
    }
}