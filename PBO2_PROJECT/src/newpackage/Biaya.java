package newpackage;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Biaya {

    public static int simpleDaysBetween(LocalDate start, LocalDate end) {
        return (int) ChronoUnit.DAYS.between(start, end);
    }

    public static int lamaOpname(LocalDate start, LocalDate end) {
        int aa;
        aa = simpleDaysBetween(start, end);
        return aa;
    }
    
    public static int hargaKamar(String kode){
        if(kode.contains("VVIP")){
            return 750000;
        }
        else if (kode.contains("VIP")){
            return 650000;
        }
        else if (kode.contains("Utama")){
            return 450000;
        }
        else if (kode.contains("Kelas1")){
            return 380000;
        }
        else if (kode.contains("Kelas2")){
            return 275000;
        }
        else if (kode.contains("Kelas3")){
            return 125000;
        }
        else{
            return 0;
        }
            
    }
    
    public static int hitung(String kode,LocalDate start,LocalDate end)
    {
        return hargaKamar(kode)*lamaOpname(start,end);
    }
    
    public static void main(String[] args) {
        String x = "VVIP";
         LocalDate start = LocalDate.now();
         LocalDate end = LocalDate.of(2014, Month.DECEMBER, 9);
        int biaya = hargaKamar(x)*lamaOpname(start,end);
        System.out.println(biaya);
    }
}
