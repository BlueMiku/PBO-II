package model;

import java.io.Serializable;

public class Pekerja extends Penduduk implements Serializable {
    private String nim;
    private int golongan;

    public Pekerja(String nama, String alamat, String tanggalLahir, String nim, int golongan) {
        super(nama, alamat, tanggalLahir);
        this.nim = nim;
        this.golongan = golongan;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public int getGolongan() {
        return golongan;
    }

    public void setGolongan(int golongan) {
        this.golongan = golongan;
    }
}