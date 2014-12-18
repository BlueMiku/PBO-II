package com.pkg135314076.model;
import java.util.ArrayList;
public class PerusahaanList implements Pengeluaran {
    private ArrayList<Pekerja> listPekerja = new ArrayList<Pekerja>();
    
    public void tambahPekerja(Pekerja Pekerja){
        listPekerja.add(Pekerja);
    }
    
    @Override
    public int gajiTotal(){
        int total = 0;
        for (int i = 0; i < listPekerja.size(); i++) {
            total += getListPekerja().get(i).gaji();
        }
        return total;
    } 
    
    public ArrayList<Pekerja> getListPekerja() {
        return listPekerja;
    }

    public void setListPekerja(ArrayList<Pekerja> listPekerja) {
        this.listPekerja = listPekerja;
    }
}
