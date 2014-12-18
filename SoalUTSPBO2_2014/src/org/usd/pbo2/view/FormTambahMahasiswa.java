package org.usd.pbo2.view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import org.usd.pbo2.model.Mahasiswa;

public class FormTambahMahasiswa extends JDialog {
        JLabel namaLabel;
        JLabel nimLabel;
        JLabel prodiLabel;
        JTextField namaText;
        JTextField nimText;
        JTextField prodiText;
        JButton simpan;
        private final FrameUtama owner;
        
        public FormTambahMahasiswa(final FrameUtama owner, boolean modal){
            super(owner,modal);
            this.setSize(360, 200);
            this.setTitle("Tambah Mahasiswa");
            this.getContentPane().setLayout(null);
        
            namaLabel = new JLabel("Nama");
            namaLabel.setBounds(10,15,100,20);
            nimLabel = new JLabel("NIM");
            nimLabel.setBounds(10,45,100,20);
            prodiLabel = new JLabel ("Prodi");
            prodiLabel.setBounds(10,75,100,20);
            this.getContentPane().add(namaLabel);
            this.getContentPane().add(nimLabel);
            this.getContentPane().add(prodiLabel);
        
            namaText = new JTextField(12);
            this.getContentPane().add(namaText);
            namaText.setBounds(150,15,185,20);
            nimText = new JTextField(20);
            this.getContentPane().add(nimText);
            nimText.setBounds(150,45,185,20);
            prodiText = new JTextField(9);
            this.getContentPane().add(prodiText);
            prodiText.setBounds(150,75,185,20);
        
            simpan = new JButton("Tambah");
            this.getContentPane().add(simpan);
            simpan.setBounds(125,100,100,40);
            
            simpan.addActionListener(new ActionListener() {   
                @Override
                public void actionPerformed(ActionEvent e) {
                    Mahasiswa mahasiswa = new Mahasiswa();
                try {
                    mahasiswa.setNama(namaText.getText());
                    mahasiswa.setNim(nimText.getText());
                    mahasiswa.setProdi(prodiText.getText());
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,ex.getMessage());
                }
                    Mahasiswa.tambahMahasiswa(mahasiswa);
                }
            });
            
            this.setVisible(true);
            this.owner = owner;
    }
}