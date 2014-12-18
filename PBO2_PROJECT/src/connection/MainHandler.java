package connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class MainHandler {

    public static void main(String[] args) throws SQLException {
        DataHandler hd = new DataHandler();
        hd.getDBConnection();

//        Statement stmt = hd.conn.createStatement();
//
//        String sql = "CREATE TABLE HOSPITAL "
//                + "(kode_pasien VARCHAR2(4) not NULL, "
//                + " nama VARCHAR2(30), "
//                + " alamat VARCHAR2(255), "
//                + " resep VARCHAR2(4), "
//                + " diagnosa VARCHAR2(20), "
//                + " kode_kamar VARCHAR2(15), "
//                + " tarif_kamar NUMBER(15), "
//                + " jenis_layanan VARCHAR2(25), "
//                + " tarif_layanan NUMBER(15), "
//                + " tanggal_masuk VARCHAR2(25), "
//                + " tanggal_keluar VARCHAR2(25), "
//                + " PRIMARY KEY ( kode_pasien ))";
//
//        stmt.executeUpdate(sql);
        tambahPasien("AA12","Hendra","Dipowinatan","A1A2","Sakit hati","VVIP-01",750000,"Gawat Darurat",50000,"2014-DEC-06","2014-DEC-09");

    }

    public static void tambahPasien(String kodePasien, String nama, String alamat, String resep, String diagnosa, String kodeKamar, int tarifKamar, String jenisLayanan, int tarifLayanan, String tanggalMasuk, String tanggalKeluar
    ) throws SQLException {
        DataHandler hd = new DataHandler();
        hd.getDBConnection();
        PreparedStatement ps = null;

        Statement stmt = hd.conn.createStatement();
        ps = hd.conn.prepareStatement("INSERT INTO HOSPITAL VALUES('"+kodePasien+"', '"+nama+"', '"+alamat+"', '"+resep+"', '"+diagnosa+"', '"+kodeKamar+"', "+tarifKamar+", '"+jenisLayanan+"', "+tarifLayanan+", '"+tanggalMasuk+"', '"+tanggalKeluar+"')");
        ps.executeUpdate();
    }
}
