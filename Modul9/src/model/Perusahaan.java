package model;

import java.io.*;
import java.util.ArrayList;


public class Perusahaan {

    public static ArrayList<Pekerja> listPekerja = new ArrayList<Pekerja>();

    public Perusahaan() {
    }

    public void tambahPekerja(Pekerja pekerja) {
        listPekerja.add(pekerja);
    }

    public static void simpanFilePekerja() throws FileNotFoundException, Exception {
        if (listPekerja.isEmpty()) {
            throw new Exception("Daftar pekerja kosong");
        } else {
            File file = new File("pekerja.dat");
            try (FileOutputStream output = new FileOutputStream(file);
                    ObjectOutputStream objStream = new ObjectOutputStream(output)) {
                    objStream.writeObject(listPekerja);
                output.close();
            }
        }
    }
    
    public static void bacaFilePekerja() throws Exception {
        File file = new File("pekerja.dat");
        FileInputStream input = new FileInputStream(file);
        ObjectInputStream objStream = new ObjectInputStream(input);
        listPekerja = (ArrayList<Pekerja>) objStream.readObject();
        input.close();
    }
}