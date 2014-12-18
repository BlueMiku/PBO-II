package com.pkg135314076.model;
public class Penduduk {
    private String nama;
    private String tanggalLahir;
    private String tempatLahir;

    public Penduduk() {
    }

    public Penduduk(String nama, String tempatLahir, String tanggalLahir) {
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tempatLahir = tempatLahir;
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

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }
   
}

