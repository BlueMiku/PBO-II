package org.usd.pbo2.view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import org.usd.pbo2.model.KelasKuliah;
import org.usd.pbo2.model.Mahasiswa;

public class FormTambahPesertaKelas extends JDialog {
    JLabel kelasLabel;
    JLabel mahasiswaLabel;
    JTextField textField;
    JTable daftar;
    JComboBox kelasCombo;
    JComboBox mahasiswaCombo;
    String[] arrayKelas;
    String[] arrayMahasiswa;
    String[] namaKolom = {"Kelas", "NIM"};
    JButton simpan;
    private final FrameUtama owner;

    public FormTambahPesertaKelas(final FrameUtama owner, boolean modal) {
        super(owner, modal);
        this.setSize(320, 600);
        this.setTitle("Tambah Peserta Kelas");
        this.getContentPane().setLayout(null);

        kelasLabel = new JLabel("Kelas");
        kelasLabel.setBounds(10, 15, 100, 20);
        mahasiswaLabel = new JLabel("NIM");
        mahasiswaLabel.setBounds(10, 45, 100, 20);
        this.getContentPane().add(kelasLabel);
        this.getContentPane().add(mahasiswaLabel);

        arrayKelas = new String[KelasKuliah.DAFTAR_KELAS_KULIAH.size()];
        for (int i = 0; i < KelasKuliah.DAFTAR_KELAS_KULIAH.size(); i++) {
            arrayKelas[i] = KelasKuliah.DAFTAR_KELAS_KULIAH.get(i).getKodeKuliah();
        }
        kelasCombo = new JComboBox(arrayKelas);
        this.getContentPane().add(kelasCombo);
        kelasCombo.setBounds(75, 15, 200, 20);

        arrayMahasiswa = new String[Mahasiswa.DAFTAR_MAHASISWA.size()];
        for (int i = 0; i < Mahasiswa.DAFTAR_MAHASISWA.size(); i++) {
            arrayMahasiswa[i] = Mahasiswa.DAFTAR_MAHASISWA.get(i).getNim();
        }
        mahasiswaCombo = new JComboBox(arrayMahasiswa);
        this.getContentPane().add(mahasiswaCombo);
        mahasiswaCombo.setBounds(75, 45, 200, 20);

        textField = new JTextField();
        this.getContentPane().add(textField);
        textField.setBounds(10, 125, 285, 425);
        textField.setEditable(false);

        simpan = new JButton("Tambah");
        this.getContentPane().add(simpan);
        simpan.setBounds(110, 75, 100, 40);

        simpan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String x = (String) mahasiswaCombo.getSelectedItem();
                String y = (String) kelasCombo.getSelectedItem();
                textField.setText(x+"\t\t"+y);
            }
        }
        );
        this.setVisible(true);
        this.owner = owner;
    }
}