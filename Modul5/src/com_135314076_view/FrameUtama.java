package com_135314076_view;

import com_135314076_model.PerusahaanList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class FrameUtama extends JFrame implements ActionListener{
    JMenuBar menuBar;
    JMenu pekerjaMenu, help;
    JMenuItem exitMenu, tambahPekerja;
    PerusahaanList perusahaan;
    
    public FrameUtama(){
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("PT.XYZ");
  
        menuBar = new JMenuBar();
        pekerjaMenu = new JMenu("Pekerja");
        menuBar.add(pekerjaMenu);
        help = new JMenu("Help");
        menuBar.add(help);
        exitMenu = new JMenuItem("Exit");
        tambahPekerja = new JMenuItem("Tambah Pekerja");
        pekerjaMenu.add(tambahPekerja);
        pekerjaMenu.add(exitMenu);
        this.setJMenuBar(menuBar);
        this.setVisible(true);
        
        exitMenu.addActionListener(this);
        tambahPekerja.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if(event.getSource() == exitMenu){
            System.exit(0);
        } 
        if(event.getSource() == tambahPekerja){
            DialogPekerja pekerja = new DialogPekerja(this, true);
        }
    }
}
