package com_135314076_model;
public class Marketing extends Pekerja implements Penghasilan {
    int TUNJANGAN_TRANSPORT=300;
    
    public Marketing(String nama,String tempatLahir,String tanggalLahir,String NoKtp, String nip, int golongan) throws Exception {
           super(nama, tempatLahir, tanggalLahir,NoKtp,nip,golongan);
    }
    
    @Override
    public int gaji(){
        return super.gaji()+TUNJANGAN_TRANSPORT;
    }
}
