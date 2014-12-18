/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mainproyek;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Fendi
 */
public class Koneksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Koneksi m = new Koneksi();
        Connection con = m.getConnection();
        
        try {
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

     public Connection getConnection(){
    String host = "localhost";
    String port = "1521";
    String db = "XE";
    String usr = "HR";
    String pwd = "erwin";
    
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            System.out.println("Maaf, driver class tidak ditemukan");
            System.out.println(e.getMessage());
        }
        
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:oracle:thin:@"+host+":"+port+":"+db,usr,pwd);
        } catch (SQLException e) {
            System.out.println("Maaf, koneksi tidak berhasil.");
            System.out.println(e.getMessage());
        }
        if (con!=null) {
            System.out.println("Koneksi ke database berhasil tebentuk");
        }
        else{
            System.out.println("Maaf, koneksi ke database gagal tebentuk");
        }
        return con;
    }
      public void inputData(String nik, String nama, String kelamin, String tempat_lahir, String tgl_lahir, String alamat, String status, String agama, String telpon, String email, String pekerjaan, String keterangan){
     Connection con = null;
     PreparedStatement ps = null;
     con = this.getConnection();
     
     
    
     System.out.println("Data sudah ditambahkan");
     try {
        ps = con.prepareStatement("insert into penduduk values ('"+nik+"','"+nama+"','"+kelamin+"','"+tempat_lahir+"','"+tgl_lahir+"','"+alamat+"','"+status+"','"+agama+"','"+telpon+"','"+email+"','"+pekerjaan+"','"+keterangan+"')");
        ps.executeUpdate();
        con.commit();
     } catch (SQLException e) {
         System.out.println(e.getMessage());;
     } finally{
         try {
             ps.close();
             con.close();
         } catch (SQLException e) {
             System.out.println(e.getMessage());
         }
     }
 }

public void updateData(String nik, String nama, String kelamin, 
        String tempat_lahir, String tgl_lahir, String alamat,
        String status, String agama, String telpon, String email,
        String pekerjaan, String keterangan){
            Connection con = null;
            PreparedStatement ps = null;
            con = this.getConnection();

    try {
        ps = con.prepareStatement("update penduduk set nama = '"+nama+"', kelamin = '"+kelamin+
                "', tempat_lahir = '"+tempat_lahir+"', tgl_lahir = '"+tgl_lahir+"', alamat = '"+alamat+
                "', status = '"+status+"', agama = '"+agama+"', telpon = '"+telpon+"', pekerjaan = '"+pekerjaan+
                "',keterangan = '"+keterangan+
                "' where nik = '"+nik+"'");
        ps.executeUpdate();
        con.commit();
        System.out.println("Data sudah diperbaiki!");
    } catch (SQLException e) {
        System.out.println(e.getMessage());;
    } finally {
        try {
            ps.close();
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    }
public  void  hapusData(String nik){
Connection con = null;
PreparedStatement ps = null;

con = this.getConnection();
   
    try {
        ps = con.prepareStatement("delete from penduduk where nik = '"+nik+"'"); 
        ps.executeUpdate();
        con.commit();
        System.out.println("Data sudah dihapus!");
    } catch (SQLException e) {
        System.out.println(e.getMessage());;
    } finally{
        try {
            ps.close();
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
    
}
