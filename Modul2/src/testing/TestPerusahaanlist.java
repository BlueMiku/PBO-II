package testing;

import com.pkg135314076.model.Pekerja;
import com.pkg135314076.model.PerusahaanList;

public class TestPerusahaanlist {
    public static void main(String[] args) {
        PerusahaanList test = new PerusahaanList();
    
        Pekerja test1 = new Pekerja("Yosep","Denpasar","30 Desember","135314",3);
        Pekerja test2 = new Pekerja("Dimas","Jogja","20 Juni","135315",2);
    
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
