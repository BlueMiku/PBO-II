package laporan.pkg1;
public class Laporan1 {
public static void main(String[] args) {

    Perusahaan tes = new Perusahaan ();
    
    System.out.println("Jumlah Pekerja = "+tes.getJumlahPekerja());
    tes.tammbahPekerja(null);
    System.out.println("Jumlah Pekerja = "+tes.getJumlahPekerja());
    tes.tammbahPekerja(null);
    System.out.println("Jumlah Pekerja = "+tes.getJumlahPekerja());


}
}
