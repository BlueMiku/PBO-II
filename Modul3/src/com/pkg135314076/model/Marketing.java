package com.pkg135314076.model;
public class Marketing extends Pekerja implements Penghasilan {
    int TUNJANGAN_TRANSPORT=50000;
    
    public Marketing(String nama, String tempatLahir, String tanggalLahir, String nip, int golongan) {
        super(nama, tempatLahir, tanggalLahir, nip, golongan);
    }
    
    @Override
    public int gaji(){
        return super.gaji()+TUNJANGAN_TRANSPORT;
    }
}
