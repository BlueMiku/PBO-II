package com.pkg135314076.model;
public class Manager extends Pekerja implements Penghasilan {
    int TUNJANGAN_ESELON;
    private int eselon;

    public Manager(String nama, String tempatLahir, String tanggalLahir, String nip, int golongan, int eselon) {
        super(nama, tempatLahir, tanggalLahir, nip, golongan);
        this.eselon=eselon;
    }
    
    @Override
    public int gaji(){
        return super.gaji() + TUNJANGAN_ESELON * eselon;
    }

    public int getEselon() {
        return eselon;
    }

    public void setEselon(int eselon) {
        this.eselon = eselon;
    }
    
    
}
