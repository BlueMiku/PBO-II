package com_135314076_model;
public class Penduduk {
    private String nama;
    private String tanggalLahir;
    private String tempatLahir;
    private String NoKtp;

    public Penduduk() {
    }

    public Penduduk(String nama, String tempatLahir, String tanggalLahir,String noKtp) throws Exception{
        setNama(nama);
        setTempatLahir(tempatLahir);
        setTanggalLahir(tanggalLahir);
        setNoKtp(noKtp);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) throws Exception {
        String rule = "[A-Za-z\\ .]+";
        if (nama.matches(rule))
        {
            this.nama = nama;
        }
        else 
        {
        throw new Exception ("Nama hanya boleh mengandung alphabet");   
        }
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) throws Exception {
        String rule = "(0?[1-9]|[12][0-9]|3[01])-(0?[1-9]|1[0-2])-((18|19|20|21)\\d\\d)";
        if (tanggalLahir.matches(rule))
        {
           this.tanggalLahir = tanggalLahir;
        }
        else
        {
            throw new Exception ("Tanggal lahir hanya boleh mengandung angka dan mengikuti format dd-mm-yyyy");
        }
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) throws Exception 
    {
    String rule = "[A-Za-z]+";
    if (tempatLahir.matches(rule))
    {          
       this.tempatLahir = tempatLahir;
    }
    else 
    {
        throw new Exception ("Tempat lahir hanya boleh mengandung alphabet");
    }
    }
    public String getNoKtp() {
        return NoKtp;
    }

    public void setNoKtp(String NoKtp) throws Exception {
    String rule = "[0-9]{16}";
        if (NoKtp.matches(rule))
        {
                this.NoKtp = NoKtp;
        }
        else
        {
            throw new Exception("Nomer KTP hanya boleh mengandung angka dan terdiri dari 16 angka pas");
        }
        }
   
    
}