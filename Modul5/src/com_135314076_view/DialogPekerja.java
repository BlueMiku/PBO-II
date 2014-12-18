package com_135314076_view;

import com_135314076_model.Pekerja;
import com_135314076_model.Penduduk;
import com_135314076_model.PerusahaanList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;



public class DialogPekerja extends JDialog {
        JLabel NamaLabel, TempatLahirLabel, TanggalLahirLabel, NipLabel, GolonganLabel,NoKtpLabel;
        JTextField NamaText, TempatLahirText, TanggalLahirText, NipText,NoKtpText;
        JButton simpan;
        JComboBox GolonganCombo;
        String golongan[] = {"01", "02", "03"};
        private final FrameUtama owner;

    public DialogPekerja(final FrameUtama owner, boolean modal) {
        super(owner,modal);
            this.owner = owner;
            this.setSize(360, 400);
            this.setTitle("Tambah Pekerja");
            this.setLayout(null);
        
            NamaLabel = new JLabel("Nama");
            NamaLabel.setBounds(10,15,100,20);
            this.add(NamaLabel);
            
            TempatLahirLabel = new JLabel("Tempat Lahir");
            TempatLahirLabel.setBounds(10,45,100,20);
            this.add(TempatLahirLabel);
            
            TanggalLahirLabel = new JLabel ("Tanggal Lahir");
            TanggalLahirLabel.setBounds(10,75,100,20);
            this.add(TanggalLahirLabel);
            
            NipLabel = new JLabel ("NIP");
            NipLabel.setBounds(10,105,100,20);
            this.add(NipLabel);
            
            NoKtpLabel = new JLabel("No KTP");
            NoKtpLabel.setBounds(10, 135, 140, 20);
            this.add(NoKtpLabel);
            
            GolonganLabel = new JLabel ("Golongan");
            GolonganLabel.setBounds(10,165,100,20);
            this.add(GolonganLabel);
        
            NamaText = new JTextField(12);
            NamaText.setBounds(150,15,185,20);
            this.add(NamaText);
            
            TempatLahirText = new JTextField(12);
            TempatLahirText.setBounds(150,45,185,20);
            this.add(TempatLahirText);
            
            TanggalLahirText = new JTextField(12);
            TanggalLahirText.setBounds(150,75,185,20);
            this.add(TanggalLahirText);
            
            NipText = new JTextField(12);
            NipText.setBounds(150,105,185,20);
            this.add(NipText);
           
            NoKtpText = new JTextField();
            NoKtpText.setBounds(150, 135, 185, 20);
            this.add(NoKtpText);

            GolonganCombo =new JComboBox(golongan);
            this.add(GolonganCombo);
            GolonganCombo.setBounds(150,165,185,20);

            simpan = new JButton("Tambah");
            this.add(simpan);
            simpan.setBounds(125,195,100,40);
            simpan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
            
             
                    
                try {
                    Pekerja pekerja = new Pekerja();
                    pekerja.setNama(NamaText.getText());
                    pekerja.setNip(NipText.getText());
                    pekerja.setTanggalLahir(TanggalLahirText.getText());
                    pekerja.setTempatLahir(TempatLahirText.getText());
                    int golongan = Integer.parseInt(GolonganCombo.getSelectedItem().toString());
                    pekerja.setGolongan(golongan);
                    pekerja.setNoKtp(NoKtpText.getText());
                    
                    JOptionPane.showMessageDialog(null,
                            "Nama : " + pekerja.getNama() + ""
                                    + "\nNIP : " + pekerja.getNip() + ""
                                    + "\nTempat Lahir : " + pekerja.getTempatLahir()
                                    + "\nTangal Lahir : " + pekerja.getTanggalLahir()
                                    + "\nGolongan : " + pekerja.getGolongan()
                                    + "\nNo KTP : "+ pekerja.getNoKtp());
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(owner, ex.getMessage());
                }
                    
                
            }
        });
        this.setVisible(true);
    }
}


        
