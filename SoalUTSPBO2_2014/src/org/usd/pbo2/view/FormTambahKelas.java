package org.usd.pbo2.view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import org.usd.pbo2.model.KelasKuliah;
import org.usd.pbo2.model.Mahasiswa;

public class FormTambahKelas extends JDialog {
        JLabel kodeLabel;
        JLabel semesterLabel;
        JLabel tahunLabel;
        JTextField kodeText;
        JComboBox tahunCombo;
        JRadioButton genap;
        JRadioButton gasal;
        ButtonGroup bg;
        JButton simpan;
        String tahun[] = {"2012/2013", "2013/2014", "2014/2015"};
        private final FrameUtama owner;
        
        public FormTambahKelas(final FrameUtama owner, boolean modal){
            super(owner,modal);
            this.setSize(360, 200);
            this.setTitle("Tambah Peserta Kelas");
            this.getContentPane().setLayout(null);
        
            kodeLabel = new JLabel("Kode Kelas");
            kodeLabel.setBounds(10,15,100,20);
            semesterLabel = new JLabel("Semester");
            semesterLabel.setBounds(10,45,100,20);
            tahunLabel = new JLabel ("Tahun Akademik");
            tahunLabel.setBounds(10,75,100,20);
            this.getContentPane().add(kodeLabel);
            this.getContentPane().add(semesterLabel);
            this.getContentPane().add(tahunLabel);
        
            kodeText = new JTextField(12);
            this.getContentPane().add(kodeText);
            kodeText.setBounds(150,15,185,20);
            
            genap = new JRadioButton("Genap");
            this.getContentPane().add(genap);
            genap.setBounds(150,45,80,20);
            gasal = new JRadioButton("Gasal");
            this.getContentPane().add(gasal);
            gasal.setBounds(230,45,100,20);
            bg = new ButtonGroup();
            bg.add(genap);
            bg.add(gasal);
            genap.setEnabled(true);
            gasal.setEnabled(true);
            
            tahunCombo = new JComboBox(tahun);
            this.getContentPane().add(tahunCombo);
            tahunCombo.setBounds(150,75,185,20);
            
            simpan = new JButton("Tambah");
            this.getContentPane().add(simpan);
            simpan.setBounds(125,100,100,40);
            
            simpan.addActionListener(new ActionListener() {   
                @Override
                public void actionPerformed(ActionEvent e) {
                    KelasKuliah kelas = new KelasKuliah();
                try {
                    kelas.setKodeKuliah(kodeText.getText());
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,ex.getMessage());
                }
                    if(e.getSource() instanceof JRadioButton){
                        JRadioButton radioButton = (JRadioButton) e.getSource();
                            if(radioButton.isSelected()){
                                kelas.setSemester(radioButton.getText());
                            }
                    }
                    String x = String.valueOf(tahunCombo.getSelectedItem());
                    kelas.setTahunAkademik(x);
                    KelasKuliah.tambahKelas(kelas);
                }
            });
            
            this.setVisible(true);
            this.owner = owner;
    }
}