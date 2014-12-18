package com.pkg135314076.model;
public class Pekerja extends Penduduk implements Penghasilan {
    int UPAH_POKOK=50000;
    private String nip;
    private int golongan;
    
    public Pekerja(String nama, String tanggalLahir,  String tempatLahir,String nip, int golongan) {
        super(nama, tempatLahir, tanggalLahir);
        this.nip = nip;
        this.golongan = golongan;
    }
    
    @Override
    public int gaji(){
        return UPAH_POKOK * golongan;
    }

    public int getGolongan() {
        return golongan;
    }

    public void setGolongan(int golongan) {
        this.golongan = golongan;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }
}