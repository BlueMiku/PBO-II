/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sekarinotan
 */
public class TesMahasiswa {
    public static void main(String[] args) {
    
        Mahasiswa testM = new Mahasiswa("135314","Junaedi","Magelang","9 Desember");
        
        System.out.println(testM.getNama());
        System.out.println(testM.getTempatLahir());
        System.out.println(testM.getTanggalLahir());
        System.out.println(testM.getNim());
    }
}