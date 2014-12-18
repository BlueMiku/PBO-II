package com_135314076_model;
public class Manager extends Pekerja implements Penghasilan {
    int TUNJANGAN_ESELON=200;
    private int eselon;

    public Manager(String nama,String tempatLahir,String tanggalLahir,String NoKtp, String nip, int golongan, int eselon) throws Exception {
        super(nama, tempatLahir, tanggalLahir,NoKtp,nip,golongan);
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
