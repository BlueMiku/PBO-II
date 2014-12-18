package com_135314076_model;
public class Pekerja extends Penduduk implements Penghasilan {
    int UPAH_POKOK=500;
    private String nip;
    private int golongan;
    
    public Pekerja(String nama, String tanggalLahir,  String tempatLahir, String NoKtp,String nip, int golongan) throws Exception {
        super(nama, tempatLahir, tanggalLahir,NoKtp);
        setNip(nip);
        setGolongan(golongan);
    }

    public Pekerja() {
        
    }
    
    @Override
    public int gaji(){
        return UPAH_POKOK * golongan;
    }

    public int getGolongan() {
        return golongan;
    }


    public String getNip() {
        return nip;
    }

    public void setNip(String nip) throws Exception {
    String rule = "P[0-9]{8}";
        if (nip.matches(rule)) 
            {
                this.nip = nip;
            } 
       else 
        {
            throw new Exception("NIP tidak melebihi 9 digit dengan diawali huruf P");
        }
    }

    public void setGolongan(int golongan) throws Exception {
        if(golongan == 1 || golongan == 2 || golongan == 3)
        {
            this.golongan = golongan;
        }
        else
        {
            throw new Exception("Rentang Golongan hanya dari 1 - 3");
        }
        }

 


}