package com.view;

import javax.swing.*;



public class DialogPekerja extends JDialog {
    JLabel cariPekerjaLabel;
    JTextField cariPekerjaText;
    JLabel TempatTanggalLahir;
    JTextField text2;
    JButton cari;
    JButton simpan;
    JComboBox golongans;
    JLabel golongan;
    JRadioButton genders;
    JLabel gender;
    public DialogPekerja()
    {
        this.setLayout(null);
        this.setSize(600,300);
        
        this.setTitle("PT. XYZ");
        
        //baris pertama
        cariPekerjaLabel = new JLabel("Nama");
        cariPekerjaLabel.setBounds(25,30,150,20);
        this.add(cariPekerjaLabel);
        cariPekerjaText = new JTextField(15);
        cariPekerjaText.setBounds(150,30,220,20);
        this.add(cariPekerjaText);
        cari = new JButton ("cari");
        cari.setBounds(400,30,60,20);
        this.add(cari);
   
        //baris kedua
        TempatTanggalLahir = new JLabel("Tempat/Tanggal Lahir");
        TempatTanggalLahir.setBounds(25,60,300,20);
        this.add(TempatTanggalLahir);
        text2 = new JTextField(35);
        text2.setBounds(150,60,330,20);
        this.add(text2);
        
   
        //baris ketiga
        golongan = new JLabel("Golongan");
        golongan.setBounds(25,90,150,20);        
        this.add(golongan);
        String gol[] = {"1","2","3"};
        golongans = new JComboBox(gol);
        golongans.setBounds(150,90,220,20);
        this.add(golongans);
        
        //baris keempat
        gender = new JLabel("Jenis Kelamin");
        gender.setBounds(25,120,300,20);
        this.add(gender);
        ButtonGroup bg = new ButtonGroup();
        JRadioButton Laki = new JRadioButton("Laki-laki",true);
        Laki.setBounds(150, 120, 100, 20);
        JRadioButton Perempuan = new JRadioButton("Perempuan");
        Perempuan.setBounds(250,120,100,20);
        bg.add(Laki);
        bg.add(Perempuan);
        Laki.setEnabled(true);
        Perempuan.setEnabled(true);
        this.add(Laki);
        this.add(Perempuan);
        
        //baris kelima
        simpan = new JButton("simpan");
        simpan.setBounds(200,170,100,20);
        this.add(simpan);
        
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
    
}
