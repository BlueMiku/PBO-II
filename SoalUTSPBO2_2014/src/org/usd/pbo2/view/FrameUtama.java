package org.usd.pbo2.view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class FrameUtama extends JFrame implements ActionListener{
    JMenuBar menuBar;
    JMenu mahasiswaMenu, kelasMenu, sistemMenu;
    JMenuItem tambahMhs, tambahKls, tambahPstKls;
    
    public FrameUtama(){
        this.setTitle("Frame Utama");
        this.setSize(400,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        menuBar = new JMenuBar();
        mahasiswaMenu = new JMenu("Mahasiswa");
        kelasMenu = new JMenu("Kelas");
        sistemMenu = new JMenu("Sistem");
        tambahMhs = new JMenuItem("Tambah Mahasiswa");
        tambahKls = new JMenuItem("Tambah Kelas");
        tambahPstKls = new JMenuItem("Tambah Peserta Kelas");
        
        this.setJMenuBar(menuBar);        
        menuBar.add(mahasiswaMenu);
        menuBar.add(kelasMenu);
        menuBar.add(sistemMenu);
        mahasiswaMenu.add(tambahMhs);
        kelasMenu.add(tambahKls);
        kelasMenu.add(tambahPstKls);
        this.setVisible(true);
        
        tambahMhs.addActionListener(this);
        tambahKls.addActionListener(this);
        tambahPstKls.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if(event.getSource() == tambahMhs){
            FormTambahMahasiswa tambahMahas = new FormTambahMahasiswa(this, true);
        } 
        if(event.getSource() == tambahKls){
            FormTambahKelas tambahKelas = new FormTambahKelas(this, true);
        }
        if(event.getSource() == tambahPstKls){
            FormTambahPesertaKelas tambahPstKelas = new FormTambahPesertaKelas(this, true); 
        }
    }
}