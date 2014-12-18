package model;

import java.io.Serializable;

public class Penduduk implements Serializable {
    private String nama;
    private String alamat;
    private String tanggalLahir;

    public Penduduk() {
    }
    
    public Penduduk(String nama, String alamat, String tanggalLahir) {
        this.nama = nama;
        this.alamat = alamat;
        this.tanggalLahir = tanggalLahir;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }
}