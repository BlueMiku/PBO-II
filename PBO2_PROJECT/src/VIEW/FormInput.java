package VIEW;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import newpackage.Biaya;
import newpackage.Kalender;
import newpackage.Pasien;

public class FormInput extends JDialog {

    JLabel labelNamaPasien;
    JLabel labelkodePasien;
    JLabel labelTanggalMasuk;
    JLabel labelAlamat;
    JLabel labelDiagnosa;
    JLabel labelResep;
    JLabel labelKodeKamar;
    JLabel labelTarifKamar;
    JLabel labelKodeDokter;
    JLabel labelJenisLayanan;
    JLabel labelTarifLayanan;
    JLabel labelTanggalKeluar;
    
    JLabel labelJumlahBayar;
    JLabel labelKembali;
    JLabel labelTotalHarga;

    JScrollPane scroll;
    JTextField textkodePasien;
    JComboBox comboTanggalMasuk;
    JTextArea textAlamat;
    JTextField textDiagnosa;
    JTextField textResep;
    JComboBox comboKodeKamar;
    JTextField textTarifKamar;
    JComboBox comboKodeDokter;
    JComboBox comboJenisLayanan;
    JTextField textTarifLayanan;
    JComboBox comboTanggalKeluar;
    JTextField textJumlahBayar;
    JTextField textKembali;
    JTextField textTotalHarga;
    JTextField textNamaPasien;
    
    JButton buttonHitungKembali;
    JButton buttonHitungTotal;
    JButton buttonSimpan;
    JButton buttonHapus;
    JButton buttonKeluar;

    JPanel panelInput;
    private final FrameUtama owner;

    Kalender tm = new Kalender();
    Biaya bayar = new Biaya();
    Kalender tk = new Kalender();


    public FormInput(final FrameUtama owner, boolean modal) {
        super(owner, modal);
        this.owner = owner;
        this.setSize(900, 600);
        this.setTitle("Tambah Pasien");
        this.setLayout(null);

        labelNamaPasien = new JLabel("Nama Pasien");
        labelNamaPasien.setBounds(10, 15, 100, 20);
        this.add(labelNamaPasien);
        
        textNamaPasien = new JTextField();
        textNamaPasien.setBounds(150, 15, 185, 20);
        this.add(textNamaPasien);
        
        labelkodePasien = new JLabel("Kode Pasien");
        labelkodePasien.setBounds(10, 45, 100, 20);
        this.add(labelkodePasien);

        textkodePasien = new JTextField(3);
        textkodePasien.setBounds(150, 45, 185, 20);
        this.add(textkodePasien);


        labelTanggalMasuk = new JLabel("Tanggal Masuk");
        labelTanggalMasuk.setBounds(10, 75, 100, 20);
        this.add(labelTanggalMasuk);

        tm.datesBetween(tm.getStart(), tm.getEnd());
        comboTanggalMasuk = new JComboBox((tm.datesBetween(tm.getStart(), tm.getEnd())).toArray());
        comboTanggalMasuk.setBounds(150, 75, 185, 20);
        this.add(comboTanggalMasuk);

        labelTanggalKeluar = new JLabel("Tanggal Keluar");
        labelTanggalKeluar.setBounds(10, 105, 100, 20);
        this.add(labelTanggalKeluar);

        Kalender tk = new Kalender();
        tk.datesBetween(tk.getStart(), tk.getEnd());
        comboTanggalKeluar = new JComboBox((tk.datesBetween(tk.getStart(), tk.getEnd())).toArray());
        comboTanggalKeluar.setBounds(150, 105, 185, 20);
        this.add(comboTanggalKeluar);
        comboTanggalKeluar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               String pilih = String.valueOf(comboJenisLayanan.getSelectedItem());
                if (pilih == "Rawat Jalan"){
                int a = comboTanggalMasuk.getSelectedIndex();
                comboTanggalKeluar.setSelectedIndex(a);
            }}
        });
        this.add(comboTanggalKeluar);
        

        labelAlamat = new JLabel("Alamat");
        labelAlamat.setBounds(10, 135, 100, 20);
        this.add(labelAlamat);

        textAlamat = new JTextArea();
        textAlamat.setBounds(150, 135, 190, 120);
        textAlamat.setLineWrap(true);
        this.add(textAlamat);

        labelDiagnosa = new JLabel("Diagnosa");
        labelDiagnosa.setBounds(10, 265, 100, 20);
        this.add(labelDiagnosa);

        textDiagnosa = new JTextField(12);
        textDiagnosa.setBounds(150, 265, 185, 20);
        this.add(textDiagnosa);

        labelResep = new JLabel("Resep");
        labelResep.setBounds(10, 295, 140, 20);
        this.add(labelResep);

        textResep = new JTextField(12);
        textResep.setBounds(150, 295, 185, 20);
        this.add(textResep);

        labelKodeKamar = new JLabel("Kode Kamar");
        labelKodeKamar.setBounds(470, 15, 100, 20);
        this.add(labelKodeKamar);

        String[] kamar = new String[]{" ","VVIP-01", "VVIP-02", "VVIP-03",
            "VIP-01", "VIP-02", "VIP-03", "VIP-04",
            "Utama-01", "Utama-02", "Utama-03", "Utama-04", "Utama-05",
            "Kelas1-01", "Kelas1-02", "Kelas1-03", "Kelas1-04", "Kelas1-05",
            "Kelas2-01", "Kelas2-02", "Kelas2-03", "Kelas2-04", "Kelas2-05",
            "Kelas3-01", "Kelas3-02", "Kelas3-03", "Kelas3-04", "Kelas3-05"};
        comboKodeKamar = new JComboBox(kamar);
        comboKodeKamar.setBounds(610, 15, 185, 20);

       comboKodeKamar.addActionListener(new ActionListener() {
            String pilih;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (comboKodeKamar.getSelectedItem() != null) {
                    pilih = String.valueOf(comboKodeKamar.getSelectedItem());
                    textTarifKamar.setText(Integer.toString(Biaya.hargaKamar(pilih)));
                }
                pilih = String.valueOf(comboJenisLayanan.getSelectedItem());
                if (pilih == "Rawat Jalan"){
                    comboKodeKamar.setSelectedIndex(0);
                    String pil = String.valueOf(comboJenisLayanan.getItemAt(0));
                    textTarifKamar.setText(Integer.toString(Biaya.hargaKamar(pil)));

                }
            }
        });
        this.add(comboKodeKamar);

        labelTarifKamar = new JLabel("Tarif Kamar");
        labelTarifKamar.setBounds(470, 45, 100, 20);
        this.add(labelTarifKamar);

        textTarifKamar = new JTextField();
        textTarifKamar.setEditable(false);
        textTarifKamar.setBounds(610, 45, 185, 20);
        this.add(textTarifKamar);

        labelJenisLayanan = new JLabel("Kode Layanan");
        labelJenisLayanan.setBounds(470, 75, 185, 20);
        this.add(labelJenisLayanan);

        String[] layanan = new String[] {"Gawat Darurat", "Rawat Jalan", "Rawat Inap"};
        comboJenisLayanan = new JComboBox(layanan);
        comboJenisLayanan.setBounds(610, 75, 185, 20);
        comboJenisLayanan.addActionListener(new ActionListener() {
            String pilih;
            @Override
            public void actionPerformed(ActionEvent e) {
                pilih = String.valueOf(comboJenisLayanan.getSelectedItem());
                if (pilih == "Rawat Jalan"){
                    comboKodeKamar.setSelectedIndex(0);
                    String pilih = String.valueOf(comboJenisLayanan.getSelectedItem());
                if (pilih == "Rawat Jalan"){
                tk.setEnd((LocalDate) comboTanggalMasuk.getSelectedItem());
            }
                }
                
                
            }
        });
        this.add(comboJenisLayanan);

        labelTarifLayanan = new JLabel("Tarif Layanan");
        labelTarifLayanan.setBounds(470, 105, 185, 20);
        this.add(labelTarifLayanan);

        textTarifLayanan = new JTextField("0");
        textTarifLayanan.setBounds(610, 105, 185, 20);
        this.add(textTarifLayanan);

        labelTotalHarga = new JLabel("Total Harga");
        labelTotalHarga.setBounds(470,135,185,20);
        this.add(labelTotalHarga);
        
        textTotalHarga = new JTextField();
        textTotalHarga.setBounds(610,135,185,20);
        textTotalHarga.setEditable(false);
        this.add(textTotalHarga);
        
        buttonHitungTotal = new JButton("Hitung");
        buttonHitungTotal.setBounds(800, 135, 80, 20);
        this.add(buttonHitungTotal);
        buttonHitungTotal.addActionListener(new ActionListener(){
           
            @Override
            public void actionPerformed(ActionEvent e) {
            LocalDate start;
            LocalDate end;
            String pilih;
            start = (LocalDate) comboTanggalMasuk.getSelectedItem();
            end = (LocalDate) comboTanggalKeluar.getSelectedItem();
            pilih = String.valueOf(comboKodeKamar.getSelectedItem());
            int layan = Integer.parseInt(textTarifLayanan.getText());
            int x = Biaya.hitung(pilih, start, end) + layan;
            textTotalHarga.setText(Integer.toString(x));
               }
            });
               
        labelJumlahBayar = new JLabel("Jumlah Bayar");
        labelJumlahBayar.setBounds(470, 165, 185, 20);
        this.add(labelJumlahBayar);
        
        textJumlahBayar = new JTextField();
        textJumlahBayar.setBounds(610, 165, 185, 20);
        this.add(textJumlahBayar);
        
        labelKembali = new JLabel("Kembali");
        labelKembali.setBounds(470,195,185,20);
        this.add(labelKembali);
        
        textKembali = new JTextField();
        textKembali.setBounds(610, 195, 185, 20);
        textKembali.setEditable(false);
        this.add(textKembali);
        
        buttonHitungKembali = new JButton("Hitung");
        buttonHitungKembali.setBounds(800, 195, 80, 20);
        this.add(buttonHitungKembali);
        buttonHitungKembali.addActionListener(new ActionListener(){
           
            @Override
            public void actionPerformed(ActionEvent e) {
                int bayar = Integer.parseInt(textJumlahBayar.getText());
                int wajib = Integer.parseInt(textTotalHarga.getText());
                int total = bayar - wajib;
                textKembali.setText(Integer.toString(total));
                    
                }
            });
        
        buttonSimpan = new JButton("Simpan");
        buttonSimpan.setBounds(470,225,80,20);
        this.add(buttonSimpan);
        buttonSimpan.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               
                
               
                try {
                    String nama = textNamaPasien.getText();
                    String kode = textkodePasien.getText();
                    String alamat = textAlamat.getText();
                    String resep = textResep.getText();
                    String diagnosa = textDiagnosa.getText();
                    String kodeKam = String.valueOf(comboKodeKamar.getSelectedItem());
                    int tarifKam = Integer.parseInt(textTarifKamar.getText());
                    String jenisLayan = String.valueOf(comboJenisLayanan.getSelectedItem());
                    int tarifLayan = Integer.parseInt(textTarifLayanan.getText());
                    String tm = String.valueOf(comboTanggalMasuk.getSelectedItem());
                    String tk = String.valueOf(comboTanggalKeluar.getSelectedItem());
                    Pasien pasien = new Pasien();
                    pasien.setNama(nama);
                    pasien.setKodePasien(kode);
                    pasien.setAlamat(alamat);
                    pasien.setResep(resep);
                    pasien.setDiagnosa(diagnosa);
                    pasien.setKodeKamar(kodeKam);
                    pasien.setTarifKamar(tarifKam);
                    pasien.setJenisLayanan(jenisLayan);
                    pasien.setTarifLayanan(tarifLayan);
                    pasien.setTanggalMasuk(tm);
                    pasien.setTanggalKeluar(tk);
                    JOptionPane.showMessageDialog(null,"Penyimpanan sukses");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(owner, ex.getMessage());
                }
                
                
          
            }
        });
        
        buttonHapus = new JButton("Clear");
        buttonHapus.setBounds(560,225,80,20);
        this.add(buttonHapus);
        buttonHapus.addActionListener(new ActionListener(){
           
            @Override
            public void actionPerformed(ActionEvent e) {
                textNamaPasien.setText("");
                textkodePasien.setText("");
                textAlamat.setText("");
                textDiagnosa.setText("");
                textResep.setText("");
                textTarifLayanan.setText("0");
                textJumlahBayar.setText("");
                                }
            });
        

        this.setVisible(true);
    }
}
